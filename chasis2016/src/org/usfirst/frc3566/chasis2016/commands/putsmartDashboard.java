package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.RobotMap;
import org.usfirst.frc3566.chasis2016.autonomousButtons.DrawBridge;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class putsmartDashboard extends Command{


	@Override
	protected void initialize() {
		SmartDashboard.putData("DrawBridge", new DrawBridge());
	}

	@Override
	protected void execute() {
		SmartDashboard.putNumber("LinearPotFront", RobotMap.steeringAnalogPotentiometerFRONT.get());
		SmartDashboard.putNumber("LinearPotBack", RobotMap.steeringAnalogPotentiometerBACK.get());
		SmartDashboard.putNumber("BPU Potentiometer" , RobotMap.BPUpotentiometer.get());
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
