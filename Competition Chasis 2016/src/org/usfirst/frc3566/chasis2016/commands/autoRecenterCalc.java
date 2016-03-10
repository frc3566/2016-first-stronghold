package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

/**
 *RIGHT NOW IT DOESN"T WORK!!!!!!!!!!!!!!!!!!!!!FIX IT OR DELETE IT
 */
public class autoRecenterCalc extends Command {
	//DO NOT ADD THIS TO ROBOT
	double FrontLeft, BackLeft, FrontRight, BackRight;
	double averagesFront, averagesBack;
    public autoRecenterCalc() {
    
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	averagesFront = (FrontLeft+FrontRight)/2;
    	averagesBack =(BackLeft+BackRight)/2; 
    	
    	
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    protected void storeLeftSide(double frontLeft, double backLeft){
    	FrontLeft=frontLeft;
    	BackLeft=backLeft;
    }
    
    protected void storeRightSide(double frontRight, double backRight){
    	FrontRight=frontRight;
    	BackRight=backRight;
    }
    
    
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
