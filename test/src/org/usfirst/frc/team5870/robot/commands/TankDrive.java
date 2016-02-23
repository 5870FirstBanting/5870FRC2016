package org.usfirst.frc.team5870.robot.commands;

import org.usfirst.frc.team5870.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
 
/**
 *
 */
public class TankDrive extends Command {

    public TankDrive() {
        // Use requires() here to declare subsystem dependencies
         requires(Robot.chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double leftPower = Robot.oi.mXboxController.getRawAxis(1);
    	double rightPower = Robot.oi.mXboxController.getRawAxis(5);
    	if (Robot.oi.mXboxController.getRawAxis(5) > -0.15 && Robot.oi.mXboxController.getRawAxis(5) < 0.15) { // Added deadzone, if forwardPower is less than 0.5, robot does not move forward
    		leftPower = 0;
    	}
    	if (Robot.oi.mXboxController.getRawAxis(1) > -0.15 && Robot.oi.mXboxController.getRawAxis(1) < 0.15) { // Added deadzone, if forwardPower is less than 0.5, robot does not move forward
    		rightPower = 0;
    	}
    	
    	Robot.chassis.drive(leftPower,rightPower);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
   Robot.chassis.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
