// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.ShootingTest3566Jan23.subsystems;

import org.usfirst.frc3566.ShootingTest3566Jan23.RobotMap;
import org.usfirst.frc3566.ShootingTest3566Jan23.commands.*;
import edu.wpi.first.wpilibj.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Shooter extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon cANTalon0 = RobotMap.shooterCANTalon0;
    private final CANTalon cANTalon1 = RobotMap.shooterCANTalon1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    boolean isActive = false ;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new ShootWithJoystick());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    
    public void revEngines (){
    	
    	cANTalon0.set(0.9);
    	cANTalon1.set(0.9 * -1.0);
    }
    
    public boolean isShooterRunning(){
    	return isActive;
    }
    
    public void turnShooterOn(){
    	isActive = true;
    }
    
    public void turnShooterOff(){
    	isActive = false;
    }
}

