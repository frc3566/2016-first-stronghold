package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class reverseDriving extends Command {
	boolean finished;
	
    public reverseDriving() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	finished=false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.driveTrain.getReversedState()){
    		Robot.driveTrain.setReversedFalse();
    	}else if(!Robot.driveTrain.getReversedState()){
    		Robot.driveTrain.setReversedTrue();
    	}
    	finished=true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
