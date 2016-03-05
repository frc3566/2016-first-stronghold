package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;
import org.usfirst.frc3566.chasis2016.autonomousButtons.DrawBridge;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class putsmartDashboard extends Command{
int range;
	@Override
	protected void initialize() {
	range=1;
	}

	@Override
	protected void execute() {
		double front=RobotMap.steeringAnalogPotentiometerFRONT.get();
		double back =RobotMap.steeringAnalogPotentiometerBACK.get();
		double encoder = RobotMap.BPUencoder.get();
		SmartDashboard.putNumber("LinearPotFront", front);
		SmartDashboard.putNumber("LinearPotBack", back);
		SmartDashboard.putNumber("BPU Potentiometer" , encoder);
		
	if(front<RobotMap.LINEAR_FRONT_CENTER-range){
		SmartDashboard.putString("Front", "left");
	}else if(front>RobotMap.LINEAR_FRONT_CENTER+range){
		SmartDashboard.putString("Front", "right");
	}else if (front > RobotMap.LINEAR_FRONT_CENTER - range  ){
		SmartDashboard.putString("Front", "middle");
	}
	
	if(back<RobotMap.LINEAR_BACK_CENTER-range){
		SmartDashboard.putString("Back", "left");
	}else if(back>RobotMap.LINEAR_BACK_CENTER+range){
		SmartDashboard.putString("Back", "right");
	}else{
		SmartDashboard.putString("Back", "middle");
	}
	
		}
		// create a button that makes it so that all four motors go at 100% 
	

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}
