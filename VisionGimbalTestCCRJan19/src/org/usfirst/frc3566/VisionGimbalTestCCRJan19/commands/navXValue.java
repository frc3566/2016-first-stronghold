package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.awt.Color;

import javax.swing.JPanel;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.*;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands.*;
import com.kauailabs.navx.frc.AHRS;
/**
 *
 */
public class navXValue extends Command {
	AHRS ahrs;
	JPanel jp= new JPanel();
    public navXValue() {
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	ahrs = RobotMap.AHRS;
    	ahrs.resetDisplacement();
    	SmartDashboard.putData("driveForward", new driveForward());
    	SmartDashboard.putData("gimble", new GimbalLeftHorizontalSweep());
    	jp.setSize(100,100);
    	jp.setBackground(Color.PINK);
    	jp.setVisible(true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
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
    	SmartDashboard.putNumber("OiZAxis", Robot.oi.logitechXBox.getRawAxis(2));
    	SmartDashboard.putNumber("OiXAxis", Robot.oi.logitechXBox.getRawAxis(0));
    	
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
