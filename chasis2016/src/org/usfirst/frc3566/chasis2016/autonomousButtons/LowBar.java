package org.usfirst.frc3566.chasis2016.autonomousButtons;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.commands.timyDrive;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LowBar extends CommandGroup {
	
			public LowBar() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
			addSequential(new timyDrive(.5, 2));
			   
    	
    }

    // Called just before this Command runs the first time
 /*   protected void initialize() {
   addSequential(new timyDrive(.5, 2));
   
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
 
    	
    	Robot.driveTrain.bpuMovement(bpuSpeed);
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
    }*/
}
