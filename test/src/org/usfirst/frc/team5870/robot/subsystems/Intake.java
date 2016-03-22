
package org.usfirst.frc.team5870.robot.subsystems;

import org.usfirst.frc.team5870.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
    public Victor basketMotor;
    public Victor intakeMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Intake() {
    	basketMotor = new Victor(RobotMap.basketMotor);
    	intakeMotor = new Victor(RobotMap.intakeMotor);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void powerBasket(double power) {
    	basketMotor.set(power);
    }
    
    public void powerIntake(double power) {
    	intakeMotor.set(power);
    }
    
}

