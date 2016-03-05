package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class recenterFrontWheel extends Command{
	//front wheel range: 6.5-11.5
			double a, range;
			boolean inRange;
	@Override
	protected void initialize() {
		//front wheel range: 6.5-11.5
		a=RobotMap.LINEAR_FRONT_CENTER; range=0.5;
		inRange= false;
	}

	@Override
	protected void execute() {
		if(RobotMap.steeringAnalogPotentiometerFRONT.get()>a+range ){
			RobotMap.frontSteering.set(-0.2);
			
		//	inRange=true;
		}else if (RobotMap.steeringAnalogPotentiometerFRONT.get()< a-range){
			RobotMap.frontSteering.set(0.2);
		//	inRange=true;
		}else{
			System.out.println("inRange!!!!!"+a+" "+range);
			inRange=true;
		}
		
	}

	@Override
	protected boolean isFinished() {
		return inRange;
	}

	@Override
	protected void end() {
		Robot.windowControl.frontWindowStopTurning();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
