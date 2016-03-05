package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class fullPower extends Command {
	// Make all 4 motors 100% 
    private final CANTalon cANTalon1 = RobotMap.backLeftMotor;
    private final CANTalon cANTalon2 = RobotMap.backRightMotor;
    private final CANTalon cANTalon3 = RobotMap.frontLeftMotor;
    private final CANTalon cANTalon4 = RobotMap.frontRightMotor;

    public fullPower() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    	
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	cANTalon1.set(-1);
    	cANTalon2.set(1);
    	cANTalon3.set(-1.0);
    	cANTalon4.set(1);
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
