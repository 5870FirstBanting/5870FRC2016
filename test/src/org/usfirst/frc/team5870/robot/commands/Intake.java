package org.usfirst.frc.team5870.robot.commands;

import org.usfirst.frc.team5870.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Intake extends Command {

    public Intake() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intaking = true;
    	Robot.intake.spin(-0.4);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(!Robot.oi.intakeTrigger.get()) {
    		return true;
    	}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
//    	Robot.intake.spin(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
