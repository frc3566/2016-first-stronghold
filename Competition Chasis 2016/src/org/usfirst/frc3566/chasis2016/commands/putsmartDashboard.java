package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class putsmartDashboard extends Command{
	double range;
	@Override
	protected void initialize() {
		range=RobotMap.STEERING_RANGE;
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
	
	int POVvalue = Robot.oi.xBoxController.getPOV();
	if (POVvalue == 0 || POVvalue == 90 || POVvalue == 180){
		BPUgoTo BPUGoTo;
		BPUGoTo = new BPUgoTo((POVvalue+90)/90, 0.3);
		BPUGoTo.start();
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
