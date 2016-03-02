package org.usfirst.frc3566.chasis2016.commands;



import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
	//	double[] centerY = Robot.table.getNumberArray("centerY", defaultValue);
		     
		     
		        for (double area: areas) {//area range 900-1100
		     	   SmartDashboard.putNumber("area", area);
		     	   if(area<=900){
		     		   robotAstrategy="forward";
		     	   }else if(area>1100){
		     		  robotAstrategy="backward";
		     	   }else if(area>900 && area<=1100){
		     		   robotAstrategy="inRange";
		     	   }else{
		     		   robotAstrategy="null";
		     	   }
		     	}
		 
		        for (double X: centerX) {
		        	 SmartDashboard.putNumber("centerX", X);
		        	 if(X<=150){
			     		   cameraHstrategy="left";
			     	   }else if(X>170){
			     		  cameraHstrategy="right";
			     	   }else if(X>150 && X<=170){
			     		   cameraHstrategy="inRange";
			     	   }else{
			     		   cameraHstrategy="null";
			     	   }
			     	}
		        
		        if(cameraHstrategy.equals("inRange")&& robotAstrategy.equals("inRange")){
		        	RobotMap.blueLight.set(true);
		        }else{
		        	RobotMap.blueLight.set(false);
		        }
		        
		   /* we're not doing vertical gimbal so no Y anymore
		        for (double Y: centerY) {
		        	 SmartDashboard.putNumber("centerY", Y);
		        	 if(Y<=120){
			     		   cameraVstrategy="upward";
			     	   }else if(Y>150){
			     		  cameraVstrategy="downward";
			     	   }else if(Y>120 && Y<=150){
			     		   cameraVstrategy="inRange";
			     	   }else{
			     		   cameraVstrategy="null";
			     	   }
			     	}
		       */
		        SmartDashboard.putString("robotAstrategy", robotAstrategy);
		        SmartDashboard.putString("cameraHstrategy", cameraHstrategy);
		      //  SmartDashboard.putString("cameraVstrategy", cameraVstrategy);
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

