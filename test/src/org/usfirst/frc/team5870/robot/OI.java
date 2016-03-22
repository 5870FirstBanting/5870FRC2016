package org.usfirst.frc.team5870.robot;
/*
 * Imports for not Xbox code
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5870.robot.commands.Attack3Joystick;
import org.usfirst.frc.team5870.robot.commands.ExampleCommand;

*/

// Xbox controller imports
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.RumbleType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick mXboxController = new Joystick(0);
	
	public JoystickButton stopButton = new JoystickButton(mXboxController, 7);
	
	public JoystickButton holdButton = new JoystickButton(mXboxController, 8);
	
	JoystickButton liftBtn = new JoystickButton(mXboxController, 1);
	JoystickButton dropBtn = new JoystickButton(mXboxController, 2);
	
	JoystickButton intakeBtn = new JoystickButton(mXboxController, 3);
	JoystickButton outtakeBtn = new JoystickButton(mXboxController, 4);
	
}


