package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.Robot;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.RobotMap;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.subsystems.pid;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class sonarDrive extends Command {

    public sonarDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
      	this.setTimeout(1);
    }

    //AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH 
    //ARGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG
    protected void execute() {

    	if (RobotMap.ultra.getRangeInches()>25){
    	Robot.driveTrain.driveIt(.5,.5);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return  this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
