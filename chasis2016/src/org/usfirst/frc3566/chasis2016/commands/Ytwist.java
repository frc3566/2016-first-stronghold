package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class Ytwist extends Command{
/* backWindowMotorPositive = new JoystickButton(joystick1, 9);
        backWindowMotorPositive.whileHeld(new positiveWindowTurning(-1));
        backWindowMotorNegative = new JoystickButton(joystick1, 10);
        backWindowMotorNegative.whileHeld(new negativeWindowTurning(-1));*/
	int PosorNeg;
	
	public Ytwist(int x){
		PosorNeg=x;
	}
/*	positiveWindowTurning pwtpos1;
	negativeWindowTurning nwtpos1; 
	stopWindowMotors swmpos1;*/
	@Override

	protected void initialize() {
		/* pwtpos1=new positiveWindowTurning(1);
		 nwtpos1=new negativeWindowTurning(1);
		 swmpos1=new stopWindowMotors(1);*/
		this.setTimeout(0.3);
	}

	@Override
	protected void execute() {
		
		if(PosorNeg>=0.1){
			Robot.windowControl.frontWindowLeftTurning();
			System.out.println("positive!!!");
		}else if(PosorNeg<=-0.1){
			Robot.windowControl.frontWindowRightTurning();
			System.out.println("negative!!");
		}else{
			end();
		}
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return this.isTimedOut();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.windowControl.frontWindowStopTurning();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		end();
	}

}
