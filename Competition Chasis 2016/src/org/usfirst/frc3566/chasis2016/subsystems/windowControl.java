package org.usfirst.frc3566.chasis2016.subsystems;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class windowControl extends Subsystem {
	
	private final CANTalon backWindowMotor = RobotMap.backSteering;
	private final CANTalon frontWindowMotor= RobotMap.frontSteering;
	

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	public void backWindowLeftTurning() {//left is positive for now, but maybe it's wrong.
		//we'll have to test it
		backWindowMotor.set(RobotMap.WINDOW_MOTOR_SPEED * -1);
		
	}
	public void joystickControl(){
		
	}
	public void backWindowRightTurning() {
		backWindowMotor.set(RobotMap.WINDOW_MOTOR_SPEED );
		
	}
	public void backWindowStopTurning() {
		backWindowMotor.set(0.0);
	}
	public void frontWindowLeftTurning() {
		frontWindowMotor.set(RobotMap.WINDOW_MOTOR_SPEED*-1);
		
	}
	public void frontWindowRightTurning() {
		frontWindowMotor.set(RobotMap.WINDOW_MOTOR_SPEED );
		
	}
	public void frontWindowStopTurning() {
		frontWindowMotor.set(0.0);
	}
}

