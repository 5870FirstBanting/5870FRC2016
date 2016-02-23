package org.usfirst.frc.team5870.robot.commands;

import java.util.concurrent.locks.ReadWriteLock;

import org.usfirst.frc.team5870.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;


/**
 *
 */
public class AutoOuttake extends Command {

//double time;
    
public AutoOuttake() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis)
    	requires(Robot.intake);
//    	this.time = time;
    }
//hello
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intaking = true;
    	Robot.intake.spin(2);//Tweak these values
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.spin(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
