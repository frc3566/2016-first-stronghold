package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;


import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class runPotentiometers extends Command {
public static double degrees;
    public runPotentiometers() {
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
    	SmartDashboard.putNumber("BPUpot", Robot.bpu.getPotentiometerValue());//this is for the bpu potentiometer
    	degrees= RobotMap.sensorAnalogPotentiometer1.get();
    	SmartDashboard.putNumber("potentiometer", degrees);//this should be for the gimbal potentiometer. We'll have to put it on tho
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
