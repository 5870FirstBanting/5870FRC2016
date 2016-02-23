package org.usfirst.frc.team5870.robot.subsystems;

import org.usfirst.frc.team5870.robot.RobotMap;
import org.usfirst.frc.team5870.robot.commands.AutoTest;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * 
 */
public class Chassis extends Subsystem {
	private RobotDrive myRobot;
	private double leftPower;
	private double rightPower;
	private int driveType;
    public Chassis(int driveType) {
    	this.driveType = driveType;
    	//front left back left front right back right
    	myRobot = new RobotDrive(RobotMap.LEFT_MOTORS[0],RobotMap.LEFT_MOTORS[1],RobotMap.RIGHT_MOTORS[0],RobotMap.RIGHT_MOTORS[1]); 
    	//TODO FIX THIS//encoderRight = new Encoder(RobotMap.ENCODER_RIGHT[0], RobotMap.ENCODER_RIGHT[1], true, EncodingType.k4X);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
    	
    // Set the default command for a subsystem here.
        setDefaultCommand(new AutoTest(driveType));
    }

	public void drive(double leftPower, double rightPower) { 
//    	this.leftPower = leftPower;				// Comment out during normal run time
//    	this.rightPower = rightPower;			// Comment out during normal run time
// 	   	myRobot.tankDrive(leftPower, rightPower);
		myRobot.tankDrive(0,0);
 	}
	
}