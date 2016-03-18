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
     public static int intakeLiftMotor; // TODO: CHANGE THIS
//     public static int rightMotor = 2;
	
//	public static final int ARM_MOTOR_EXTEND  = 5;
//	public static final int ARM_MOTOR_ERECT  = 6;
	
	//IF THIS ID WRONG THE ROBOT WILL DIE
	public static final int[] LEFT_MOTORS = {4,3};//front left back left
    public static final int[] RIGHT_MOTORS = {1,2}; // Front Right, Back Right
    
   
//     public static final int[] ELEVATOR_MOTOR = {6,5}; // Motor set to elevator winch
//    public static final int[] INTAKE_MOTOR = {7,8};
   // public static final int ARM_MOTOR = 10; // Motor set to arm winch
   // public static final int[] ELEVATOR_PORTS = {5,6,7,8};
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
   //public static final int INTAKE_MOTOR = 4;
}
