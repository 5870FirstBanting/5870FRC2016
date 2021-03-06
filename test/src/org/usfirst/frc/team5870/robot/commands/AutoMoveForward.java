package org.usfirst.frc.team5870.robot.commands;

import java.util.concurrent.locks.ReadWriteLock;

import org.usfirst.frc.team5870.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoMoveForward extends Command {

	double time;
	double power = 1;
	// double power;// add as parameter for class. and set on execute

	public AutoMoveForward(double power) {
		requires(Robot.chassis);
		this.power = power;
		this.time = time;
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

//		for (int i = 10; i >= 1; i--) {
//			Robot.chassis.drive(power / i, power / i + 0.0328 / i);
//			Timer.delay(0.1);
//		}

		 Robot.chassis.drive(power, power + 0.0328);
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
