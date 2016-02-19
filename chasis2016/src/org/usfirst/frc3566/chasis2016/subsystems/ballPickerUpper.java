package org.usfirst.frc3566.chasis2016.subsystems;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ballPickerUpper extends Subsystem {
	private final CANTalon pickUpBall = RobotMap.pickUpBall;
    double angle;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void liftdown(){
    	pickUpBall.set(RobotMap.BPU_MOTOR_SPEED*.65);
    }
    
    public void liftup(){
    	pickUpBall.set(RobotMap.BPU_MOTOR_SPEED*-1);
    }
    
    public void stopBPU(){
    	pickUpBall.set(0);
    }
    
    public double getPotentiometerValue(){
    	angle=RobotMap.BPUpotentiometer.get();
    	return angle;
    }
}

