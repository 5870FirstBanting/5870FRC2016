package org.usfirst.frc.team5870.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Test trial for autonomous period
 */
public class AutoTest extends CommandGroup {

	public AutoTest(int driveType) {
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

		// addSequential(new DriveFor(.5, .5,20));//left power,rightpower,
		// distance
		// addParallel(new DriveFor(.2,20));//TODO fix this //change paramaters
		// in DriveFor
		// addParallel(new Interpreter());
		
		driveType = 0;
		switch (driveType) {
		case 0:
			addSequential(new HaloDrive());
			break;

		case 1:
			addSequential(new TriggerDrive());
			break;

		case 2:
			addSequential(new ArcadeDrive());
			break;

		case 3:
			addSequential(new TankDrive());
			break;
		}

		// addSequential(new InputReader());
		// addSequential (new SpinLeft(5)); //seconds
//		addParallel(new Hold());
//		addSequential(new Hold());
	}
	
}
