package org.usfirst.frc.team5870.robot.subsystems;

import org.usfirst.frc.team5870.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeMotors extends Subsystem {
	  // private Victor IntakeMotor;
 // Put methods for controlling this subsystem
 // here. Call these from Commands.
	 
	private Victor intakeMotor;
	private Victor intakeLiftMotor;
	
	  public IntakeMotors(){
//		IntakeMotor = new Victor(0);
		intakeMotor = new Victor(RobotMap.intakeMotor);
		intakeLiftMotor = new Victor(RobotMap.intakeLiftMotor);
	 }
	  
	 public void spin(double Power){
		 intakeMotor.set(Power);
		 
	 }
	
	 public void lift(double power) {
		 intakeLiftMotor.set(power);
	 }
	 
	 
	 public double getPower() {
		 return intakeMotor.get();
	 }

 public void initDefaultCommand() {
 	
     // Set the default command for a subsystem here.
     //setDefaultCommand(new MySpecialCommand());
 	
 	
 }
}

