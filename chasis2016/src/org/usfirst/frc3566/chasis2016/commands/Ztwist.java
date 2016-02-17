package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class Ztwist extends Command{
/* backWindowMotorPositive = new JoystickButton(joystick1, 9);
        backWindowMotorPositive.whileHeld(new positiveWindowTurning(-1));
        backWindowMotorNegative = new JoystickButton(joystick1, 10);
        backWindowMotorNegative.whileHeld(new negativeWindowTurning(-1));*/
	double Zvalue; 
/*	positiveWindowTurning pwtneg1;
	negativeWindowTurning nwtneg1; 
	stopWindowMotors swmneg1;*/
	@Override
	protected void initialize() {
		/* pwtneg1=new positiveWindowTurning(-1);
		 nwtneg1=new negativeWindowTurning(-1);
		 swmneg1=new stopWindowMotors(-1);*/
	}

	@Override
	protected void execute() {
		
		Zvalue=Robot.oi.joystick1.getZ();
		if(Zvalue>=0.15){
			Robot.windowControl.backWindowLeftTurning();
			System.out.println("positive!!!"+Zvalue);
		}else if(Zvalue<=-0.15){
			Robot.windowControl.backWindowRightTurning();
			System.out.println("negative!!"+Zvalue);
		}else{
			Robot.windowControl.backWindowStopTurning();
			System.out.println("stopped!");
		}
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
