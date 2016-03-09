// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CockTheCatapult extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	
	boolean allDone = false;
    public CockTheCatapult() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.catapultWinchAimer);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	allDone = false;
    	System.out.println("I'm here");
    	this.setTimeout(10); //10 seconds long time but for safety
    	
    	//Set the dog gear on the winch for pulling the catapult
    	Robot.catapultWinchAimer.winchServoEngage4Pull();
    	//Set the catapult lock to be in "ready for lock" position
    	// Need a color sensor or limit switch...
    	//Run winch untile the limit switch is ....true
    	while( Robot.catapultWinchAimer.getCatIsDownSwitchState()== RobotMap.OPEN){
    		
    		Robot.catapultWinchAimer.runBigWinchBackwards();
    	}
    	
    		Robot.catapultWinchAimer.stopBigWinch();
    		
    		Robot.catapultWinchAimer.runBigWinchForward();
    		
    		try{
        		this.wait(300);
        	}catch(Exception e){
        		
        	}
    		
    		Robot.catapultWinchAimer.stopBigWinch();
    		
    		Robot.catapultWinchAimer.winchServoRelease2Fire();
    		allDone=true;
    	
    	//Stop
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (this.isTimedOut() || allDone);
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