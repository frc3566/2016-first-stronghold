package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class recenterBackWheels extends Command {
	
	 double Backcenter, currentValue, range;
	 boolean finished;
	 
    // Called just before this Command runs the first time
    protected void initialize() {
    	Backcenter = RobotMap.LINEAR_BACK_CENTER;
    	range = RobotMap.STEERING_RANGE;
    	finished=false;
    	this.setTimeout(RobotMap.RECENTER_TIMEOUT);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	currentValue = RobotMap.steeringAnalogPotentiometerBACK.get();
    	if (currentValue < range + Backcenter){
    		RobotMap.backSteering.set(-0.1); //test if pos or neg
    		System.out.println("backsteer trying to center: curr value smaller than center");
    	} else if (currentValue > range + Backcenter){
    		RobotMap.backSteering.set(0.1);
    		System.out.println("Backsteer trying to center: curr value bigger than center");
    	} else{
    		//stop motors
    		Robot.bpu.BPUmovement(.1);
    		finished = true;
    		System.out.println("end back centering");
    		this.end();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished || this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.windowControl.backWindowStopTurning();
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
