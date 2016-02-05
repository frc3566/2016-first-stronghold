package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.Robot;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class setPotentiometerCenter extends Command {
public double poCenter, currpo; 
//GimbalLeftHorizontal GimbalLeftHorizontal;GimbalRightHorizontal GimbalRightHorizontal;
    public setPotentiometerCenter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	poCenter=RobotMap.POTENTIOMETER_CENTER;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	currpo=Robot.runPotentiometer.degrees;
    	
    	SmartDashboard.putNumber("currpo", currpo);
    	if(currpo>poCenter+0.5){
    		Robot.horizontalGimbalTurning.moveHorizontalLeft();
    		SmartDashboard.putNumber("setpotworking", 2);
    	}else if(currpo<poCenter-0.5){
    		Robot.horizontalGimbalTurning.moveHorizontalRight();
    		SmartDashboard.putNumber("setpotworking", 3);
    	}else{
    		if(isFinished()){
    		end();
    		}
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	boolean inrange=false;
    	if(currpo<=poCenter+RobotMap.GIMBAL_INERTIA && currpo>=poCenter-RobotMap.GIMBAL_INERTIA){
    		inrange=true;
    	}
        return inrange;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.horizontalGimbalTurning.stopHorizontalGimbal();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
