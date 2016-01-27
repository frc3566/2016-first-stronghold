// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.VisionGimbalTestCCRJan19;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands.GimbalDownVertical;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands.GimbalLeftHorizontal;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands.GimbalLeftHorizontalSweep;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands.GimbalRightHorizontal;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands.GimbalRightHorizontalSweep;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands.GimbalUpVertical;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands.GimballConstantHorizontalRotation;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton button5HorizLeft;
    public JoystickButton button6HorizRight;
    public JoystickButton button4VerticalUp;
    public JoystickButton button2VerticalDown;
    public Joystick logitechXBox;
    public JoystickButton buttonRotateRight;
    public JoystickButton buttonRotateLeft; 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton buttonFireButton;
    public JoystickButton buttonConstantRotation; 

    public JoystickButton button7LeftHorizontalSweep; 

    public JoystickButton button8RightHorizontalSweep; 
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        logitechXBox = new Joystick(0);
        
        button2VerticalDown = new JoystickButton(logitechXBox, 1);
        button2VerticalDown.whileHeld(new GimbalDownVertical());
        button4VerticalUp = new JoystickButton(logitechXBox, 4);
        button4VerticalUp.whileHeld(new GimbalUpVertical());
        button6HorizRight = new JoystickButton(logitechXBox, 5);
        button6HorizRight.whileHeld(new GimbalRightHorizontal());
        button5HorizLeft = new JoystickButton(logitechXBox, 6);
        button5HorizLeft.whileHeld(new GimbalLeftHorizontal());
    //    buttonConstantRotation = new JoystickButton(logitechXBox, 3); // Danger Danger do not use button 3 = Blue button on Controller
  //      buttonConstantRotation.whenPressed(new GimballConstantHorizontalRotation()); // Danger on Blue Boton DO NOT TOUCH or you break robot 
        button7LeftHorizontalSweep = new JoystickButton(logitechXBox, 3);
        button7LeftHorizontalSweep.whenPressed(new GimbalLeftHorizontalSweep(1));
        button8RightHorizontalSweep = new JoystickButton(logitechXBox, 8);
        button8RightHorizontalSweep.whenPressed(new GimbalRightHorizontalSweep(1));
        
         // buttonRotateRight = new JoystickButton(logitechXBox, 3) ; 
        //  buttonRotateRight.whenPressed(new Gimbal)
         // buttonRotateLeft=new JoystickButton(logitechXBox, 3);
           //	buttonRotateLeft.whenPressed(new GimbalLeftHorizontal(RobotMap.VISION_TIMEOUT)); // Rotates left with specific value 
        	

        // SmartDashboard Buttons

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        buttonFireButton = new JoystickButton(logitechXBox, 2);
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLogitechXBox() {
        return logitechXBox;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    
    public double getLeftStick(){
    	//System.out.println("I Think I am getting Left Axis (Axis1)");
    	//System.out.println("Left is supposed to be CAN1");
    	return logitechXBox.getY();
    			
    }
    
    public double getRightStick(){
    	//System.out.println("I Think I am getting Right Axis (Axis5)");
    	//System.out.println("Left is supposed to be CAN2");
    	//return logitechXBox.getRawAxis(3);  Hey sometimes is Axis 3
    	return logitechXBox.getRawAxis(5);
    			
    			
    }
}
