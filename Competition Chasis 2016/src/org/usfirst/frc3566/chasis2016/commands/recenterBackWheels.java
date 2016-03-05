package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class recenterBackWheels extends Command {
	 double range, center, currentValue;
	 boolean finished;
    // Called just before this Command runs the first time
    protected void initialize() {

    	range = RobotMap.RANGE;
    	center = RobotMap.LINEAR_BACK_CENTER;
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	currentValue = RobotMap.steeringAnalogPotentiometerBACK.get();
    	if (currentValue < range + center){
    		// turns backwards
    		//turns motor 
    		RobotMap.backSteering.set(-0.2);
    		finished = false; 
    	} else if (currentValue > range + center){
    		// turns forward
    		//turn motor opposite direction
    		RobotMap.backSteering.set(0.2);
    		finished= false; 
    	} else{
    		//stop motors
    		RobotMap.backSteering.set(0);
    		finished = true; 
    	}
    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
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
