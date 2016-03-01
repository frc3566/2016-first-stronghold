package org.usfirst.frc3566.chasis2016.autonomousButtons;

import org.usfirst.frc3566.chasis2016.commands.timyDrive;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RoughTerrain extends CommandGroup {

    public RoughTerrain() {
    	addSequential(new timyDrive(.8, 5));
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    } 
    }
