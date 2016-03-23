package org.usfirst.frc.team5870.robot;
/*
 * Imports for not Xbox code
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5870.robot.commands.Attack3Joystick;
import org.usfirst.frc.team5870.robot.commands.ExampleCommand;

*/

// Xbox controller imports
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.RumbleType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick intakeController = new Joystick(0);
	public Joystick driverController = new Joystick(1);
	
	
	public JoystickButton stopButton = new JoystickButton(intakeController, 7);
	
//	public JoystickButton holdButton = new JoystickButton(intakeController, 8);
	
	JoystickButton liftBtn = new JoystickButton(intakeController, 1);
	JoystickButton dropBtn = new JoystickButton(intakeController, 2);
	
	JoystickButton intakeBtn = new JoystickButton(intakeController, 3);
	JoystickButton outtakeBtn = new JoystickButton(intakeController, 4);
	
}


