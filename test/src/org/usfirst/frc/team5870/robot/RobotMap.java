package org.usfirst.frc.team5870.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
     public static int intakeMotor = 5;
     public static int basketMotor = 1;	
	
	//IF THIS ID WRONG THE ROBOT WILL DIE
	public static final int[] LEFT_MOTORS = {4,3};//front left back left
    public static final int[] RIGHT_MOTORS = {1,2}; // Front Right, Back Right
    
   
}
