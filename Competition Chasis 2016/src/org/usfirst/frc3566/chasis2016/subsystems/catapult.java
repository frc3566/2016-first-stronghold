package org.usfirst.frc3566.chasis2016.subsystems;

import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class catapult extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void catapultTurnPos(){
		RobotMap.CatapultBIGGearWinch.set(RobotMap.CATAPULT_SPEED);
	}
	
	public void catapultTurnNeg(){
		RobotMap.CatapultBIGGearWinch.set(RobotMap.CATAPULT_SPEED * -1);
	}
	
	public void catapultStop(){
		RobotMap.CatapultBIGGearWinch.set(0);
	}
}