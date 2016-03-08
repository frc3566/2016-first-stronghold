package org.usfirst.frc3566.chasis2016.subsystems;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ballPickerUpper extends Subsystem {
	private final CANTalon pickUpBall = RobotMap.pickUpBall;
	private final CANTalon pickUpBall2 = RobotMap.ballPickerUpper2;
	//the two bpu motors are flipped, which means they need opposite power to go in the same direction
    double angle;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void liftdown(){
    	pickUpBall.set(RobotMap.BPU_MOTOR_SPEED);
    	pickUpBall2.set(RobotMap.BPU_MOTOR_SPEED * -1);
    }
    
    public void liftup(){
    	pickUpBall.set(RobotMap.BPU_MOTOR_SPEED*-1);
    	pickUpBall2.set(RobotMap.BPU_MOTOR_SPEED);
    }
    
    public void BPUmovement(double bpuSpeed){
    	pickUpBall.set(bpuSpeed);
    	pickUpBall2.set(bpuSpeed*-1);
    }
    
    public void stopBPU(){
    	 pickUpBall.set(0);
    	 pickUpBall2.set(0);
    }
    
   // public double getPotentiometerValue(){
    	//angle=RobotMap.BPUencoder.get();
    	//return angle;
   // }
    
}

