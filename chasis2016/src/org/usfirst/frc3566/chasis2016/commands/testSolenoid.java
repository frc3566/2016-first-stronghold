package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class testSolenoid extends Command {
	
    public testSolenoid() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(RobotMap.solenoidMode){
    		RobotMap.solenoid.set(false);
    		RobotMap.solenoidMode=true;
    	}else if(!RobotMap.solenoidMode){
    		RobotMap.solenoid.set(true);
    		RobotMap.solenoidMode=false;
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
