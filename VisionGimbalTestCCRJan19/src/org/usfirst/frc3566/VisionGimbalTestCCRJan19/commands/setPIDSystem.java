package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.subsystems.*;
/**
 *
 */
public class setPIDSystem extends Command {
	public static pid PID = new pid(); 
	private double setPoint;
	
    public setPIDSystem(double setPoint) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(PID);
    	this.setPoint = setPoint; 
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	PID.setSetpoint(setPoint);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//usePIDOutput(Robot.)
    	 
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Math.abs(PID.getPosition()- setPoint)<10;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
