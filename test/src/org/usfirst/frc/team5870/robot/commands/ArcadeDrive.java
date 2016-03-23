package org.usfirst.frc.team5870.robot.commands;

import org.usfirst.frc.team5870.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArcadeDrive extends Command {

	public ArcadeDrive() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		double forwardPower = Robot.oi.intakeController.getRawAxis(1);

		double turnMod = Robot.oi.intakeController.getRawAxis(0);
		double leftPower = forwardPower;
		double rightPower = forwardPower;

		if (forwardPower > -0.15 && forwardPower < 0.15) { // Added deadzone, if
															// forwardPower is
															// less than 0.5,
															// robot does not
															// move forward
			forwardPower = 0;
		}
		if (leftPower > -0.15 && leftPower < 0.15) {
			leftPower = 0;
		}
		
		if (rightPower > -0.15 && rightPower < 0.15) {
			rightPower = 0;
		}
		
		if (forwardPower < 0) { // switches directions when moving backwards
			turnMod *= -1;
		}

		if (turnMod > 0) { // reduce power of opposite side by the turnMod
			rightPower *= 1 - Math.abs(turnMod);
		}
		if (turnMod < 0) {
			leftPower *= 1 - Math.abs(turnMod);
		}
		if (forwardPower == 0) { // if forward = 0, then zero point turn
			leftPower = turnMod;
			rightPower = -turnMod;
		}
		Robot.chassis.drive(leftPower, rightPower);
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
