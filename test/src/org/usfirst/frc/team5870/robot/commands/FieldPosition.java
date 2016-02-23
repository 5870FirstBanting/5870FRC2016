package org.usfirst.frc.team5870.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class FieldPosition extends CommandGroup {

	public static int position = -1;
	public static int obstacle = -1;

	public FieldPosition(int pos, int obstacle) {

		this.position = pos;
		this.obstacle = obstacle;
		goOverObstacle();
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
	}

	public void goOverObstacle() {
		switch (obstacle) { // In order from manual, added all just incase we
							// are forced to?? -> can turn around and start
							// heading toward other obstacle
		case 1: // Portcullis
			// addSequential(new AutoMoveForward(5));
			break;
		case 2: // Cheval de frise
			// addSequential(new AutoMoveForward(5));
			break;

		case 3: // Moat
			addSequential(new AutoMoveForward(0.5));
			afterObstacle();
			break;

		case 4: // Ramparts
			addSequential(new AutoMoveForward(0.5));
			afterObstacle();
			break;

		case 5: // Drawbridge
			// addSequential(new AutoMoveForward(5));
			break;
		case 6: // Sally port
			// addSequential(new AutoMoveForward(5));
			break;

		case 7: // Rock wall
			addSequential(new AutoMoveForward(0.5));
			afterObstacle();
			break;

		case 8: // Rough terrain
			addSequential(new AutoMoveForward(0.5));
			break;
		case 9: // Lowbar
			addSequential(new AutoMoveForward(0.75), 5);
			// afterObstacle();
			break;
		default:
			// Did not assign valueng.
			break;
		}

	}

	public void afterObstacle() {
		switch (position) {
		case 1: // 1 (Lowbar)
			// test both component and vector approach and test time difference
			// (vector requires additional maneuvering)
			// addSequential (new AutoMoveForward(0.5));//cut this time down by
			// increasing motor power for straight forward
			addSequential(new AutoTurnRight(), 1);// decrease motor power for a
													// clean precise turn
			addSequential(new AutoMoveForward(0.75), 1);
			addSequential(new AutoOuttake(), 2);
			addSequential(new StopIntake());

			// addSequential(new AutoMoveForward(-0.75), 2);
			// addSequential(new AutoTurnRight(), 2);//decrease motor power for
			// a clean precise turn

			//
			break;
		case 2: // 2
			addSequential(new AutoTurnRight());
			addSequential(new AutoMoveForward(0.5));
			// addSequential(new AutoOuttake());
			break;

		case 3: // 3
			addSequential(new AutoTurnRight());
			addSequential(new AutoMoveForward(0.5));
			// addSequential(new AutoOuttake());
			break;

		case 4: // 4
			addSequential(new AutoTurnLeft(0.8));
			addSequential(new AutoMoveForward(0.5));
			// addSequential(new AutoOuttake());
			break;

		case 5: // 5
			addSequential(new AutoTurnLeft(1.5));
			addSequential(new AutoMoveForward(0.5));
			// addSequential(new AutoOuttake());
			break;

		default:
			// Did not assign value.
			break;
		}
	}

}
