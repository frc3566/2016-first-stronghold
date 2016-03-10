package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class steeringSystem extends Command {
	double frontMax , frontMin, backMax, backMin; 
	double frontCenter, backCenter;
	double frontRange, backRange;
	double mF, mB;
	double JoystickXaxis;
	double range;
	CANTalon frontSteering;
	CANTalon backSteering;
	
    public steeringSystem() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	frontMax = RobotMap.FRONT_LIMITS_MAX_LEFTT;
    	frontMin = RobotMap.FRONT_LIMITS_MAX_RIGHT;
    	backMax = RobotMap.BACK_LIMITS_MAX_RIGHT;
    	backMin = RobotMap.BACK_LIMITS_MAX_LEFT;
    	frontSteering = RobotMap.frontSteering;
    	backSteering = RobotMap.backSteering;
    	frontCenter = RobotMap.LINEAR_FRONT_CENTER;
    	backCenter = RobotMap.LINEAR_BACK_CENTER;
    	range = 0.2;
    	frontRange = frontMax-frontMin;
    	backRange = backMax-backMin;
    	mF=frontRange/2;
    	mB=backRange/2;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	JoystickXaxis = Robot.oi.joystick1.getRawAxis(1);
    	double currFront = RobotMap.steeringAnalogPotentiometerFRONT.get();
    	double currBack = RobotMap.steeringAnalogPotentiometerBACK.get();
    	double idealFrontPos = JoystickXaxis*mF + frontCenter;
    	double idealBackPos = JoystickXaxis*mB + backCenter;
    	if( currFront > idealFrontPos + range){//if it's to the left of the goal
    		frontSteering.set(-.2);
    	} else if (currFront < idealFrontPos - range){
    		frontSteering.set(.2);
    	}else{
    		frontSteering.set(0);
    		System.out.println("Front wheels are in positooin ");
    	}
    	if( currBack > idealBackPos + range){//if it's to the left of the goal
    		backSteering.set(-.2);
    	} else if (currBack < idealBackPos - range){
    		backSteering.set(.2);
    	}else{
    		backSteering.set(0);
    		System.out.println("Back wheels are in positooin ");
    	}

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
