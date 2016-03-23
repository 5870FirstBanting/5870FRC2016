package org.usfirst.frc.team5870.robot.commands;

import org.usfirst.frc.team5870.robot.Robot;

import edu.wpi.first.wpilibj.Joystick.RumbleType;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopRumble extends Command {

    public StopRumble() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
 
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		Robot.oi.intakeController.setRumble(RumbleType.kLeftRumble,  0);
		Robot.oi.intakeController.setRumble(RumbleType.kRightRumble, 0);
		
		Robot.oi.driverController.setRumble(RumbleType.kLeftRumble, 0);
		Robot.oi.driverController.setRumble(RumbleType.kRightRumble, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.oi.intakeController.setRumble(RumbleType.kLeftRumble, 0);
		Robot.oi.intakeController.setRumble(RumbleType.kRightRumble, 0);
		
		Robot.oi.driverController.setRumble(RumbleType.kLeftRumble, 0);
		Robot.oi.driverController.setRumble(RumbleType.kRightRumble, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
