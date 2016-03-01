package org.usfirst.frc3566.chasis2016.autonomousButtons;

import org.usfirst.frc3566.chasis2016.commands.timyDrive;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RockWall extends CommandGroup {

    public RockWall() {
    	addSequential(new timyDrive(.8, 2)); 
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
 }
