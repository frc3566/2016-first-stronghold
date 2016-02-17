package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class driveBackward extends Command {

    public driveBackward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    //obot.driveTrain.driveIt(.5,.5);
      	this.setTimeout(1);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    	Robot.driveTrain.driveIt(-.5,-.5);
    	
    	
  
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
