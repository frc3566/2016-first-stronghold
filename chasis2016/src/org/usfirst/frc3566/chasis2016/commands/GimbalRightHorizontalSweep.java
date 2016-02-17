package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class GimbalRightHorizontalSweep extends Command{
	/* 
	 * making something that sweeps the bidget left or right 
	 */
	private double timeout=0.1;

	public GimbalRightHorizontalSweep(){
		
	}
	   public GimbalRightHorizontalSweep(double timeOut){ // Times out robot if area is a certain value 
	    	 /* if (Robot.table.getNumber("area", 1)<0) {
	    		timeout = timeOut; 
	    		System.out.print("area "+ Robot.table.getNumber("area", 1 ));
	        	stopornot=false;
	    	} else {
	stopornot=true;

	    	} */ 
		   timeout=timeOut;
	    	Robot.horizontalGimbalTurning.stopHorizontalGimbal();
	    	
	    }

		    // Called just before this Command runs the first time
		    protected void initialize() {
		    	this.setTimeout(timeout);
		    	Robot.horizontalGimbalTurning.moveHorizontalRight();
		    	
		    }
		 
		    
		    // Called repeatedly when this Command is scheduled to run
		    protected void execute() {
		    	
		    }

		    // Make this return true when this Command no longer needs to run execute()
		    protected boolean isFinished() {
		        return this.isTimedOut();
		    }

		    // Called once after isFinished returns true
		    protected void end() {
		    	Robot.horizontalGimbalTurning.stopHorizontalGimbal();
		    }

		    // Called when another command which requires one or more of the same
		    // subsystems is scheduled to run
		    protected void interrupted() {
		    	Robot.horizontalGimbalTurning.stopHorizontalGimbal();
		    }
	
	
	
    // sweep method 
	double defaultarray[] = {0.0};
	
	
	
	public double getMaxValue(double[] list){
		double max = -1.0;
		
		for( int i = 0 ; i < list.length; ++i){
			
			if(list[i] > max){
				max = list[i];
			}
		}
		return max;
	}
	
	
	
	public boolean doSweep(){
		
		boolean didIFindIt = false;
		
		
		//do stuff
		
		return didIFindIt;
		
	}

}
