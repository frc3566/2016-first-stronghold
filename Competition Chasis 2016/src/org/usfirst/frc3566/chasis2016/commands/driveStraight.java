package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class driveStraight extends Command {
	public double SPEED;
	
    public driveStraight(double speed, double timeout) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	SPEED=speed;
    	this.setTimeout(timeout);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.driveIt(SPEED);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.StopMotors();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
