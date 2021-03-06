package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;

import edu.wpi.first.wpilibj.command.Command;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.awt.Color;

import javax.swing.JPanel;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.*;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands.*;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.subsystems.pid;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.subsystems.testSendablee;

import com.kauailabs.navx.frc.AHRS;
/**
 *
 */
public class navXValue extends Command {
	AHRS ahrs; // testSendablee ts;
    public navXValue() {
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	ahrs = RobotMap.AHRS;
    	//ts= new testSendablee();
    	ahrs.resetDisplacement();
    	SmartDashboard.putData("driveForward", new driveForward());
    	SmartDashboard.putData("driveBackward", new driveBackward());
    	SmartDashboard.putData("gimble", new GimbalLeftHorizontalSweep());
    	SmartDashboard.putData("PID System", new setPIDSystem(pid.DISTANCE));
    	SmartDashboard.putData("SonarDrive", new sonarDrive());
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	SmartDashboard.putNumber("Angle", ahrs.getYaw()); 
    	SmartDashboard.putBoolean("Connected", ahrs.isConnected());
    	SmartDashboard.putBoolean("Calibartting", ahrs.isCalibrating());
    	SmartDashboard.putNumber("Displacement X: " , ahrs.getDisplacementX());
    	SmartDashboard.putNumber("Displacement Y: "  ,ahrs.getDisplacementY());
    	SmartDashboard.putNumber("Displacement Z: ", ahrs.getDisplacementZ());
    	SmartDashboard.putNumber("Velocity X: " , ahrs.getVelocityX());
    	SmartDashboard.putNumber("Velocity Y: " , ahrs.getVelocityY());
    	SmartDashboard.putNumber("Velocity Z: " , ahrs.getVelocityZ());
    	SmartDashboard.putNumber("Acceleration X: " , ahrs.getRawAccelX());
    	SmartDashboard.putNumber("Acceleration Y: " , ahrs.getRawAccelY());
    	SmartDashboard.putNumber("Acceleration Z: " , ahrs.getRawAccelZ());

    	SmartDashboard.putNumber("OiYAxis", Robot.oi.logitechXBox.getRawAxis(1));
    	SmartDashboard.putNumber("OiXAxis", Robot.oi.logitechXBox.getRawAxis(0));
    	SmartDashboard.putNumber("Z Axis", Robot.oi.logitechXBox.getRawAxis(2));
    	//SmartDashboard.putData("testSend", ts);
    	/*\
    	 *Raw Axis 0 = X valuer
    	 *Raw Axis 1 = Y Values
    	 *Raw Axis Z = Strafe 
    	 *
    	 */
    	
    //martDashboard.putData("getdata", SmartDashboard.getData("driveForward"));
  
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
