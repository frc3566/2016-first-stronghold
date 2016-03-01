package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BPUgoTo extends Command {
	protected int position_num=-1; double range= 3; boolean inRange=false;
	//bottom:1, middle:2, top:3
    public BPUgoTo(int num) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	position_num=num;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double currValue= RobotMap.BPUencoder.get();
    	if(position_num==1){
    	if(currValue > RobotMap.BPU_MIN + range){
    	RobotMap.pickUpBall.set(-0.3);
		RobotMap.ballPickerUpper2.set(0.3);
	//	inRange=true;
	}else if (currValue< RobotMap.BPU_MIN- range){
		RobotMap.pickUpBall.set(0.3);
		RobotMap.ballPickerUpper2.set(-0.3);	//	inRange=true;
	}else{
		System.out.println("BPUinRange!!osition 1: Min");
		inRange=true;
	}
    	}else if(position_num==2){
    		if(currValue > RobotMap.BPU_CENTER + range){
    	    	RobotMap.pickUpBall.set(-0.3);
    			RobotMap.ballPickerUpper2.set(0.3);
    		//	inRange=true;
    		}else if (currValue< RobotMap.BPU_CENTER- range){
    			RobotMap.pickUpBall.set(0.3);
    			RobotMap.ballPickerUpper2.set(-0.3);	
    		}else{
    			System.out.println("BPUinRange!!osition 2: Center");
    			inRange=true;

    		}
    	}else if(position_num==3){
    		if(currValue > RobotMap.BPU_MAX + range){
    	    	RobotMap.pickUpBall.set(-0.3);
    			RobotMap.ballPickerUpper2.set(0.3);
    		//	inRange=true;
    		}else if (currValue< RobotMap.BPU_MAX- range){
    			RobotMap.pickUpBall.set(0.3);
    			RobotMap.ballPickerUpper2.set(-0.3);	//	inRange=true;
    		}else{
    			System.out.println("BPUinRange!!osition 3: Max");
    			inRange=true;

    		}
    	}
    	}
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return inRange;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.pickUpBall.set(0);
		RobotMap.ballPickerUpper2.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
