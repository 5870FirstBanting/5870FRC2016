package org.usfirst.frc.team5870.robot.subsystems;

import org.usfirst.frc.team5870.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeMotors extends Subsystem {
	  // Victor IntakeMotor;
 // Put methods for controlling this subsystem
 // here. Call these from Commands.
	 
	  public IntakeMotors(){
		//IntakeMotor = new Victor(0);
		//IntakeMotor = new Victor(RobotMap.INTAKE_MOTOR);
	 }
	  
	 public void spin(double Power){
	    // IntakeMotor.set(Power);
		 
	 }
	
	 

 public void initDefaultCommand() {
 	
     // Set the default command for a subsystem here.
     //setDefaultCommand(new MySpecialCommand());
 	
 	
 }
}

