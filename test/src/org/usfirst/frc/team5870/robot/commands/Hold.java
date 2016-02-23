package org.usfirst.frc.team5870.robot.commands;

import org.usfirst.frc.team5870.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Hold extends Command {

	public Hold() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.intake);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.holding = !Robot.holding;
		if(!Robot.intaking) {
			if (Robot.holding) {
				Robot.intake.spin(-0.3);
			}
//			else if (Math.abs(Math.abs(Robot.intake.getPower()) - 0.1) < 0.000001) {
//				Robot.intake.spin(0);
//			}
			else {
				Robot.intake.spin(0);
			}
		}
		
		// if(Robot.holdingBall && !Robot.intakeOn) {
		// Robot.intake.spin(-0.1);
		// }
		// else {
		// Robot.intake.spin(0);
		// }
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
