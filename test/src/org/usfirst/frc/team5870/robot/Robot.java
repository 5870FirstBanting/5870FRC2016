
package org.usfirst.frc.team5870.robot;

import org.usfirst.frc.team5870.robot.commands.FieldPosition;
import org.usfirst.frc.team5870.robot.commands.FullStop;
import org.usfirst.frc.team5870.robot.commands.GrumbleRumble;
import org.usfirst.frc.team5870.robot.commands.Hold;
import org.usfirst.frc.team5870.robot.commands.Intake;
import org.usfirst.frc.team5870.robot.commands.Outtake;
import org.usfirst.frc.team5870.robot.commands.StopIntake;
import org.usfirst.frc.team5870.robot.commands.StopRumble;
import org.usfirst.frc.team5870.robot.commands.drop;
import org.usfirst.frc.team5870.robot.commands.lift;
import org.usfirst.frc.team5870.robot.subsystems.Arm;
import org.usfirst.frc.team5870.robot.subsystems.Chassis;
import org.usfirst.frc.team5870.robot.subsystems.IntakeMotors;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick.RumbleType;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	public static Chassis chassis;
	public static Arm arm;
	public static OI oi;
	public static CameraServer webcam;
	public static IntakeMotors intake;
	SendableChooser autoChooser;
	Command autonomousCommand;
	public static FieldPosition position;
	public static boolean holding = false;
	public static boolean intaking = false;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {

		chassis = new Chassis(1); // Drivetype - 0: halo, 1: trigger, 2: arcade,
									// 3: tank
		oi = new OI();
		intake = new IntakeMotors();
		arm = new Arm();
		webcam = CameraServer.getInstance();
		webcam.setQuality(50);
		// the camera name (ex "cam0") can be found through the roborio web
		// interface
		webcam.startAutomaticCapture("cam0");

		// oi.mXboxController.setRumble(RumbleType.kLeftRumble, (float) 0.1);
		// oi.mXboxController.setRumble(RumbleType.kRightRumble, (float) 0.1);

		// autoChooser = new SendableChooser();
		// autoChooser.addObject("No Auto", null);
		// autoChooser.addObject("Test Forward", new AutoMoveForward(5));
		// autoChooser.addObject("Test Turn Right", new AutoTurnRight(3));
		// SmartDashboard.putData("Autonomous Selector", autoChooser);

		// SendableChooser driveChooser = new SendableChooser();
		/*
		 * driveChooser.addDefault("Halo Drive", new Integer(1));
		 * driveChooser.addObject("Tank Drive", new Integer(2));
		 * driveChooser.addObject("Arcade Drive", new Integer(3));
		 * driveChooser.addObject("Trigger Drive", new Integer(4));
		 */

		// SmartDashboard.putData("DriveChooser", driveChooser);

		// Safety button
		oi.stopButton.whenPressed(new FullStop());
		oi.stopButton.whileHeld(new GrumbleRumble(1)); // Requires a float
		oi.stopButton.whenPressed(new StopIntake());
		oi.stopButton.whileActive(new FullStop());

		// Intake trigger
		oi.intakeTrigger.whileHeld(new Intake());
		oi.outtakeTrigger.whileHeld(new Outtake());
		oi.intakeTrigger.whileHeld(new GrumbleRumble(0.75F)); // Requires a
		// float
		
		// Outtake trigger
		oi.outtakeTrigger.whileHeld(new GrumbleRumble(0.75F)); // Requires a
																// float
		oi.intakeTrigger.whenReleased(new StopIntake());
		oi.outtakeTrigger.whenReleased(new StopIntake());

		oi.intakeTrigger.whenReleased(new StopRumble());
		oi.outtakeTrigger.whenReleased(new StopRumble());

//		oi.holdButton.whenPressed(new SwitchHold());
		
		// Experimental hold feauture
		oi.holdButton.whileHeld(new GrumbleRumble(0.5F));
		oi.holdButton.whenReleased(new StopIntake());
		oi.holdButton.whenPressed(new Hold());
		
		// Lift and drop buttons
		oi.liftButton.whenPressed(new lift());
		oi.dropButton.whenPressed(new drop());
//		intake.spin(0.1);
		
		
		// oi.reachUpButton.whenPressed(new Reach(true));
		// oi.reachDownButton.whenPressed(new Reach(false));

		// oi.climbUpButton.whenPressed(new Climb(true));
		// oi.climbDownButton.whenPressed(new Climb(false));

		// chooser.addObject("My Auto", new MyAutoCommand());
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	public void disabledInit() {

	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	public void autonomousInit() {
		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		autonomousCommand = new FieldPosition(1, 9); // Position, obstacle

		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {
		LiveWindow.run();
	}
}
