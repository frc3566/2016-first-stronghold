package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.Robot;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.RobotMap;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class getSonarSensor extends Command{
	
    
	
	@Override
	protected void initialize() {
	RobotMap.ultra=new Ultrasonic(0,1);
	RobotMap.ultra.setAutomaticMode(true);
	RobotMap.ultra.setEnabled(true);
	}

	@Override
	protected void execute() {
		double range = RobotMap.ultra.getRangeInches(); 
		SmartDashboard.putNumber("SonarRange", range);
		/*if (range >= 20) {
			Robot.driveTrain.driveIt(.5,.5);
		}else{
			Robot.driveTrain.driveIt(0,0);
		}*/
	}

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
