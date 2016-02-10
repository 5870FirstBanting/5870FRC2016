package org.usfirst.frc.team5870.robot.subsystems;


import org.usfirst.frc.team5870.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	   // private RobotDrive myRobot;
	    private double leftPower;
		private double rightPower;        
	   
	    Victor[] IntakeMotor;	
	    // Put methods for controlling this subsystem
	    // here. Call these from Commands.
		public Intake() {
	        //myRobot = new RobotDrive(RobotMap.INTAKE_MOTOR[0],RobotMap.INTAKE_MOTOR[1]);
			IntakeMotor = new Victor[2];
			IntakeMotor[0] = new Victor(RobotMap.INTAKE_MOTOR[0]);
			IntakeMotor[1] = new Victor(RobotMap.INTAKE_MOTOR[1]);
			}
		
	    public void initDefaultCommand() {
	        // Set the default command for a subsystem here.
	        //setDefaultCommand(new MySpecialCommand());
	    }
	    
	    public void lift(double leftPower, double rightPower){
	    	this.leftPower = leftPower;			
	    	this.rightPower = rightPower;
	        IntakeMotor[0].set(-leftPower);
	        IntakeMotor[1].set(rightPower);
	        //myRobot.tankDrive(leftPower, rightPower);
			//IntakeMotor.set(leftPower);	
	    }	
	    public double getLeftPower() {
			return leftPower;
		}

		public double getRightPower() {
			return rightPower;
		}
	    
		public void setRightPower(double rightPower) {
			this.rightPower = rightPower;
		}
	}


