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

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private final Joystick joy; 
	   private Button[] button=new Button[10]; 
	   
		public static final Joystick controller = new Joystick();
		public JoystickButton stopButton = new JoystickButton(controller);
		
	   public Axis LeftStick=new Axis(0,0), RightStick=new Axis(0,0);
	   
	   public triggers Triggers=new triggers(0,0); 
	   public buttons Buttons; 
	   public POV DPad = new POV(); 
	    
	    
	   public class triggers{ 
	   	public double Right; 
	   	public double Left; 
	   	public double Combined; 
	   	public triggers(double r, double l){ 
	   		Right=r; 
	   		Left=l; 
	   		combine(); 
	   	} 
	   	private void combine(){ 
	   		Combined=Right-Left; 
	   	} 
	   } 
	   public class POV{ 
	   	public boolean Up=false, Down=false, Left = false, Right=false; 
	   	public int degrees=-1; 
	   	private void set(int degree){ 
	   		Up=(degree==315 || degree==0 || degree==45); 
	   		Down=(degree<=225 && degree>=135); 
	   		Left=(degree<=315 && degree>=225); 
	   		Right=(degree<=135 && degree>=45); 
	   		degrees=degree; 
	   	} 
	   } 
	   public class Axis{ 
	       public double X,Y; 
	       public Axis(double x,double y){ 
	           X=x; 
	           Y=y; 
	       } 
	   } 
	   public class buttons{ 
	       public Button A =button[0]; 
	       public Button B =button[1]; 
	       public Button X =button[2]; 
	       public Button Y =button[3]; 
	       public Button LB =button[4]; 
	       public Button RB =button[5]; 
	       public Button Back =button[6]; 
	       public Button Start =button[7]; 
	       public Button LeftStick =button[8]; 
	       public Button RightStick =button[9]; 
	   	 
	   } 
	   public static class Button{ 
	       public boolean current=false , last=false,changedDown=false,changedUp=false; 
	       private void set(boolean c){ 
	       	last=current; 
	       	current=c; 
	       	changedDown=!last && current; 
	       	changedUp=last && !current; 
	       } 
	   } 
	   private void getDpad(){ 
	   	DPad.set(joy.getPOV(0)); 
	   } 
	   private void leftStick(){ 
	   	LeftStick.X=joy.getRawAxis(0); 
	   	LeftStick.Y=joy.getRawAxis(1); 
	   } 
	   private void rightStick(){ 
	   	RightStick.X=joy.getRawAxis(4); 
	   	RightStick.Y=joy.getRawAxis(5); 
	   } 
	   public void trigger(){ 
	       Triggers.Left = joy.getRawAxis(2); 
	       Triggers.Right = joy.getRawAxis(3); 
	       Triggers.combine(); 
	   } 
	   public void refresh(){ 
	   	for(int i=1;i<11;i++){ 
	   		button[i-1].set(joy.getRawButton(i)); 
	   	} 
	       leftStick(); 
	       rightStick(); 
	       trigger(); 
	       getDpad(); 
	   } 
	   public OI(int i) { 
	       joy=new Joystick(i); 
	       for(int ii=0;ii<10;ii++){ 
	       	button[ii]=new Button(); 
	       } 
	       refresh(); 
	       Buttons=new buttons(); 
	   } 
	   public void vibrate(RumbleType type,float value){ 
	   	joy.setRumble(type, value); 
	   } 
	
	/*
	 * Default joystick declarations
	public Attack3Joystick driverLeftStick = new Attack3Joystick(0);    //2015 = 0
    public Attack3Joystick driverRightStick = new Attack3Joystick(1);   //
    public Attack3Joystick operatorStick = new Attack3Joystick(2);
    */
    
    /*
     * Default joystick button declarations
    public JoystickButton leftButton2 = new JoystickButton(driverLeftStick, 2);
    public JoystickButton leftButton1 = new JoystickButton(driverLeftStick, 1);
    public JoystickButton rightButton2 = new JoystickButton(operatorStick, 2);
    public JoystickButton rightButton3 = new JoystickButton(operatorStick, 3);
    public JoystickButton recordButton = new JoystickButton(driverRightStick, 4);
    public JoystickButton playbackButton = new JoystickButton(driverRightStick, 5);
    public JoystickButton stopButton = new JoystickButton(driverRightStick, 6);
    
    
    //Public JoystickButton playbackButton = new JoysticckButton(driverRightStick, trigger)
    // Operator controls
    public static final int[] ELEVATOR_BUTTONS = {1,7,10,11};//6 = 1
    public static final int[] ELEVATOR_LEVEL = {0,1,2,3,4};    
    public JoystickButton[] elevatorLevel = new JoystickButton[5];
    
     public OI() {
    	for (int i = 0; i < elevatorLevel.length-1; i++) {//creates 4 new joystick buttons for operator elevator
			elevatorLevel[i] = new JoystickButton(operatorStick, ELEVATOR_BUTTONS[i]);
		}
     }
     */
}

/* 
* @author TomasR 

public class  { 
   private final Joystick joy; 
   private Button[] button=new Button[10]; 
    
   public Axis LeftStick=new Axis(0,0), RightStick=new Axis(0,0); 
   public triggers Triggers=new triggers(0,0); 
   public buttons Buttons; 
   public POV DPad = new POV(); 
    
    
   public class triggers{ 
   	public double Right; 
   	public double Left; 
   	public double Combined; 
   	public triggers(double r, double l){ 
   		Right=r; 
   		Left=l; 
   		combine(); 
   	} 
   	private void combine(){ 
   		Combined=Right-Left; 
   	} 
   } 
   public class POV{ 
   	public boolean Up=false, Down=false, Left = false, Right=false; 
   	public int degrees=-1; 
   	private void set(int degree){ 
   		Up=(degree==315 || degree==0 || degree==45); 
   		Down=(degree<=225 && degree>=135); 
   		Left=(degree<=315 && degree>=225); 
   		Right=(degree<=135 && degree>=45); 
   		degrees=degree; 
   	} 
   } 
   public class Axis{ 
       public double X,Y; 
       public Axis(double x,double y){ 
           X=x; 
           Y=y; 
       } 
   } 
   public class buttons{ 
       public Button A =button[0]; 
       public Button B =button[1]; 
       public Button X =button[2]; 
       public Button Y =button[3]; 
       public Button LB =button[4]; 
       public Button RB =button[5]; 
       public Button Back =button[6]; 
       public Button Start =button[7]; 
       public Button LeftStick =button[8]; 
       public Button RightStick =button[9]; 
   	 
   } 
   public static class Button{ 
       public boolean current=false , last=false,changedDown=false,changedUp=false; 
       private void set(boolean c){ 
       	last=current; 
       	current=c; 
       	changedDown=!last && current; 
       	changedUp=last && !current; 
       } 
   } 
   private void getDpad(){ 
   	DPad.set(joy.getPOV(0)); 
   } 
   private void leftStick(){ 
   	LeftStick.X=joy.getRawAxis(0); 
   	LeftStick.Y=joy.getRawAxis(1); 
   } 
   private void rightStick(){ 
   	RightStick.X=joy.getRawAxis(4); 
   	RightStick.Y=joy.getRawAxis(5); 
   } 
   public void trigger(){ 
       Triggers.Left = joy.getRawAxis(2); 
       Triggers.Right = joy.getRawAxis(3); 
       Triggers.combine(); 
   } 
   public void refresh(){ 
   	for(int i=1;i<11;i++){ 
   		button[i-1].set(joy.getRawButton(i)); 
   	} 
       leftStick(); 
       rightStick(); 
       trigger(); 
       getDpad(); 
   } 
   public XboxController(int i) { 
       joy=new Joystick(i); 
       for(int ii=0;ii<10;ii++){ 
       	button[ii]=new Button(); 
       } 
       refresh(); 
       Buttons=new buttons(); 
   } 
   public void vibrate(RumbleType type,float value){ 
   	joy.setRumble(type, value); 
   } 
} 
*/


