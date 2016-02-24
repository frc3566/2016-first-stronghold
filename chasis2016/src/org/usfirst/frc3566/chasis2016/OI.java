// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.chasis2016;

import org.usfirst.frc3566.chasis2016.commands.*;

import org.usfirst.frc3566.chasis2016.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc3566.chasis2016.subsystems.*;


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
	 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public Joystick joystick1;
    public Joystick xBoxController; 
    public JoystickButton frontWindowMotorPositive;
    public JoystickButton frontWindowMotorNegative;
    public JoystickButton backWindowMotorPositive;
    public JoystickButton backWindowMotorNegative;
    public JoystickButton bothWindowMotorPositive;
    public JoystickButton bothWindowMotorNegative;
    public JoystickButton BPUliftUp;
    public JoystickButton BPUliftDown;
    public JoystickButton reCenterFront;
    public JoystickButton reCenterBack;
    public JoystickButton creepDrive;
    public JoystickButton xBoxRecenterFront;
    public JoystickButton xBoxRecenterBack;
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick1 = new Joystick(0);
        xBoxController = new Joystick(1); 
        
        
        
        frontWindowMotorPositive = new JoystickButton(joystick1, 7);
        frontWindowMotorPositive.whileHeld(new positiveWindowTurning(1));
        frontWindowMotorNegative = new JoystickButton(joystick1, 8);
        frontWindowMotorNegative.whileHeld(new negativeWindowTurning(1));
        
        backWindowMotorPositive = new JoystickButton(joystick1, 9);
        backWindowMotorPositive.whileHeld(new positiveWindowTurning(-1));
        // turns right, decreases potentiometer minimum 2.3 
        
        backWindowMotorNegative = new JoystickButton(joystick1, 10);
        backWindowMotorNegative.whileHeld(new negativeWindowTurning(-1));
        // turns left increases potentiometer 5.8
        
        bothWindowMotorPositive = new JoystickButton(joystick1, 11);
        bothWindowMotorPositive.whileHeld(new positiveWindowTurning(1));
        bothWindowMotorPositive.whileHeld(new positiveWindowTurning(-1));
        bothWindowMotorNegative = new JoystickButton(joystick1, 12);
        bothWindowMotorNegative.whileHeld(new negativeWindowTurning(1));
        bothWindowMotorNegative.whileHeld(new negativeWindowTurning(-1));
        
        BPUliftUp = new JoystickButton(xBoxController, 1);
        BPUliftUp.whileHeld(new BPUliftUp());
        BPUliftDown = new JoystickButton(xBoxController, 2);
        BPUliftDown.whileHeld(new BPUliftDown());
        
        reCenterFront = new JoystickButton(joystick1, 5);
        reCenterFront.whenPressed(new recenterFrontWheel());
        
        reCenterBack = new JoystickButton(joystick1, 6);
        reCenterBack.whenPressed(new recenterBackWheels());
        

        reCenterFront = new JoystickButton(xBoxController, 3);
        reCenterFront.whenPressed(new recenterFrontWheel());
        
        reCenterBack = new JoystickButton(xBoxController, 4);
        reCenterBack.whenPressed(new recenterBackWheels());
       
        
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
   
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }
    
    public double getX() {
    	return joystick1.getRawAxis(0);
    }
    
    public double getY() {
    	
    	return joystick1.getRawAxis(1);
    }
    
    public double getZ() {
    return joystick1.getRawAxis(2);
    }
    public double getxBoxY(){
    	return xBoxController.getRawAxis(1);
    }
    public double getLogitechAxisY(){
    	
    	return joystick1.getY();
    }
    			
    }
//}

