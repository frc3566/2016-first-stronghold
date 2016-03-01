package org.usfirst.frc3566.chasis2016.subsystems;

import org.usfirst.frc3566.chasis2016.RobotMap;
import org.usfirst.frc3566.chasis2016.commands.WinchWithJoysticks;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class EndGameWinch extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	  private final CANTalon winchActivate = RobotMap.endgamewinch;
	  
	  
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	 setDefaultCommand(new WinchWithJoysticks());
    }
    	 public void DriveWinch(double speed){
    		 winchActivate.set(speed);
    	
    }
}

