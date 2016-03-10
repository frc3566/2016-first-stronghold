package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class recenterFrontWheels extends Command {
	
	 double Frontcenter, currentValue, range;
	 boolean finished;
	 
    // Called just before this Command runs the first time
    protected void initialize() {
    	Frontcenter = RobotMap.LINEAR_FRONT_CENTER;
    	range = RobotMap.STEERING_RANGE;
    	finished=false;
    	this.setTimeout(RobotMap.RECENTER_TIMEOUT);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	currentValue = RobotMap.steeringAnalogPotentiometerFRONT.get();
    	if (currentValue > range + Frontcenter){
    		RobotMap.frontSteering.set(-0.1); //test if pos or neg
    		System.out.println("Frontsteer trying to center: curr value smaller than center");
    	} else if (currentValue < -1*range + Frontcenter){
    		RobotMap.frontSteering.set(0.1);
    		System.out.println("Frontsteer trying to center: curr value bigger than center");
    	} else{
    		//stop motors
    		Robot.bpu.BPUmovement(.1);
    		finished = true;
    		System.out.println("end Front centering");
    		this.end();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished || this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.windowControl.frontWindowStopTurning();
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
