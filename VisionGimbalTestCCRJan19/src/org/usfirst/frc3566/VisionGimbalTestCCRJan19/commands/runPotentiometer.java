package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class runPotentiometer extends Command {
public static double degrees;
    public runPotentiometer() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("potentiometer is initiliazed");
    	RobotMap.sensorAnalogPotentiometer1.startLiveWindowMode();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	degrees= RobotMap.sensorAnalogPotentiometer1.get();
    	RobotMap.sensorAnalogPotentiometer1.updateTable();
    	SmartDashboard.putNumber("potentiometer", degrees);
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
