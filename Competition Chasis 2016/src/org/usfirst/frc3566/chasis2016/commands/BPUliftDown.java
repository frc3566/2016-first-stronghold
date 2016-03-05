package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BPUliftDown extends Command {

    public BPUliftDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.setTimeout(0.3);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.bpu.liftdown();
    	System.out.println("BPU is Lifting Down");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false; //this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.bpu.stopBPU();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
