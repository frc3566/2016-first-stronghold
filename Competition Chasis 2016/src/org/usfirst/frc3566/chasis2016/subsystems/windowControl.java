package org.usfirst.frc3566.chasis2016.subsystems;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
	
	public void steerWithGivenJoystickValue (double joystickXaxis, double mF, double mB,
			double frontCenter, double backCenter, double range, CANTalon frontMotor, CANTalon backMotor){
		
		double currFront = RobotMap.steeringAnalogPotentiometerFRONT.get();
		double currBack = RobotMap.steeringAnalogPotentiometerBACK.get();
		double idealFrontPos = joystickXaxis * mF + frontCenter;
		double idealBackPos = joystickXaxis * mB + backCenter;
		
		if (currFront > idealFrontPos + range) {// if it's to the right of the
												// goal
			
			frontMotor.set(-.2); //turn left
		} else if (currFront < idealFrontPos - range) {
			frontMotor.set(.2);
		} else {
			frontMotor.set(0);
			System.out.println("Front wheels are in positooin ");
		}
		if (currBack > idealBackPos + range) {// if it's to the left of the goal
			backMotor.set(.2);
		} else if (currBack < idealBackPos - range) {
			backMotor.set(-.2);
		} else {
			backMotor.set(0);
			System.out.println("Back wheels are in positooin ");
		}
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

