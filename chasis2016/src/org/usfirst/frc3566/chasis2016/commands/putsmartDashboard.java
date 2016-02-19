package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;
import org.usfirst.frc3566.chasis2016.autonomousButtons.DrawBridge;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class putsmartDashboard extends Command{


	@Override
	protected void initialize() {
		SmartDashboard.putData("DrawBridge", new DrawBridge());
		SmartDashboard.putData("FullPower Drive", new fullPower());
	}

	@Override
	protected void execute() {
		SmartDashboard.putNumber("LinearPotFront", RobotMap.steeringAnalogPotentiometerFRONT.get());
		SmartDashboard.putNumber("LinearPotBack", RobotMap.steeringAnalogPotentiometerBACK.get());
		SmartDashboard.putNumber("BPU Potentiometer" , RobotMap.BPUpotentiometer.get());
		SmartDashboard.putNumber("Y value",Robot.oi.getY());
		// create a button that makes it so that all four motors go at 100% 
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
