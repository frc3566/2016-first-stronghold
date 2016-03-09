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

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;

/**
 *
 */
public class MoveLeftHorizontal extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	
	private boolean allDone;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public MoveLeftHorizontal() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.catapultWinchAimer);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        allDone = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.setTimeout((double)(0.1 + (RobotMap.CAT_HORIZONTAL_WAIT_TIME_MS/1000)));
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.catapultWinchAimer.moveCatHorizontalLeft();
    	try{
    	this.wait(RobotMap.CAT_HORIZONTAL_WAIT_TIME_MS);
    	} catch (InterruptedException e){
    		System.out.println("Crud!!! Execute in MoveLeftHorizontal");
    	}
    	allDone = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (this.isTimedOut()|| allDone);
    }

    // Called once after isFinished returns true
    protected void end() {
    	//Robot.catapultWinchAimer.stopCatHorizontalMovement();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}