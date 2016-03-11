package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class autoRecenterGoLeft extends Command {
	
	CANTalon frontSteering = RobotMap.frontSteering;
	CANTalon backSteering = RobotMap.backSteering;
	
    public autoRecenterGoLeft() {
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.setTimeout(2);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	frontSteering.set(.5);
    	backSteering.set(-.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    //	RobotMap.autoRecenterCalc.storeLeftSide(RobotMap.steeringAnalogPotentiometerFRONT.get(), 
    	//RobotMap.steeringAnalogPotentiometerBACK.get());
    	frontSteering.set(0);
    	backSteering.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
