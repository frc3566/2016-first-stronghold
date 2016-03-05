package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class catapultpos extends Command{

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.catapult.catapultTurnPos();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.catapult.catapultStop();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		end();
	}

}
