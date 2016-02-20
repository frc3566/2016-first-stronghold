package org.usfirst.frc3566.chasis2016.commands;



import org.usfirst.frc3566.chasis2016.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class positiveWindowTurning extends Command {
	//by the way, the positive here means it's going left, not which set of wheels it controls
	int backOrFront=0;
    public positiveWindowTurning(int a) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	backOrFront=a;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (backOrFront==-1){
        	Robot.windowControl.backWindowLeftTurning();
        	}else if(backOrFront==1){
        		Robot.windowControl.frontWindowLeftTurning();
        	}
    	//this.setTimeout(.3);
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
    	if (backOrFront==-1){
        	Robot.windowControl.backWindowStopTurning();
        	}else if(backOrFront==1){
        		Robot.windowControl.frontWindowStopTurning();
        	}
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
