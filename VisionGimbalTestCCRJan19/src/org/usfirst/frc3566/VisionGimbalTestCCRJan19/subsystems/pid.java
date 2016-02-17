package org.usfirst.frc3566.VisionGimbalTestCCRJan19.subsystems;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class pid extends PIDSubsystem {

	public static final int d = 0, i = 0, p = 60;
			public static final double DISTANCE = 60, STOP = 20;  
    // Initialize your subsystem her-
		    SpeedController  motor = RobotMap.driveTrainCAN3LeftDriveTrain;
		    Ultrasonic pot = RobotMap.ultra;
    public pid() {
    	super("pid", p, i, d);
    	
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    	setSetpoint(STOP);
    	enable();
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
    	return pot.getRangeInches();
    	
    }
    
    public void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    //	motor.set(output);;
       // this.
    	// SmartDashboard.putNumber("PID output: ", output);
    }
    
}
