package org.usfirst.frc3566.chasis2016.autonomousButtons;

import org.usfirst.frc3566.chasis2016.commands.timyDrive;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Moat extends CommandGroup {

    public Moat() {
    	addSequential(new timyDrive(.6, 5));
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    }
