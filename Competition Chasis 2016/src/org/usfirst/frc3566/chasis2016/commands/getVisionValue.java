package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class getVisionValue extends Command{
	public static String cameraHstrategy="null", cameraVstrategy="null", robotAstrategy="null";
	
	public getVisionValue() { 
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {

		double[] defaultValue = new double[0];
		double[] areas = Robot.table.getNumberArray("area", defaultValue); 
		double[] centerX = Robot.table.getNumberArray("centerX", defaultValue);
		double[] centerY = Robot.table.getNumberArray("centerY", defaultValue);
		     
		     
		        for (double area: areas) {
		     	   SmartDashboard.putNumber("area", area);
		     	   if(area<=200){
		     		   robotAstrategy="forward";
		     	   }else if(area>260){
		     		  robotAstrategy="backward";
		     	   }else if(area>200 && area<=260){
		     		   robotAstrategy="inRange";
		     	   }else{
		     		   robotAstrategy="null";
		     	   }
		     	}
		 
		        for (double X: centerX) {
		        	 SmartDashboard.putNumber("centerX", X);
		        	 if(X<=185){
			     		   cameraHstrategy="left";
			     	   }else if(X>197){
			     		  cameraHstrategy="right";
			     	   }else if(X>185 && X<=197){
			     		   cameraHstrategy="inRange";
			     	   }else{
			     		   cameraHstrategy="null";
			     	   }
			     	}
		   
		        for (double Y: centerY) {
		        	 SmartDashboard.putNumber("centerY", Y);
		        	 if(Y<=126){
			     		   cameraVstrategy="upward";
			     	   }else if(Y>135){
			     		  cameraVstrategy="downward";
			     	   }else if(Y>126 && Y<=135){
			     		   cameraVstrategy="inRange";
			     	   }else{
			     		   cameraVstrategy="null";
			     	   }
			     	}
		       
		        SmartDashboard.putString("robotAstrategy", robotAstrategy);
		        SmartDashboard.putString("cameraHstrategy", cameraHstrategy);
		       // SmartDashboard.putString("cameraVstrategy", cameraVstrategy);
		      //  SmartDashboard.
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