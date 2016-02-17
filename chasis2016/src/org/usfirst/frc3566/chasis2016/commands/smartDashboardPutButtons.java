package org.usfirst.frc3566.chasis2016.commands;

import org.usfirst.frc3566.chasis2016.autonomousButtons.DrawBridge;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class smartDashboardPutButtons {
	
	public smartDashboardPutButtons(){
		SmartDashboard.putData("DrawBridge", new DrawBridge());
	}
}
