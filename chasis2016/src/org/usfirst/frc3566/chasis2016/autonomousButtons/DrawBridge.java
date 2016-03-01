package org.usfirst.frc3566.chasis2016.autonomousButtons;

import edu.wpi.first.wpilibj.command.CommandGroup;


/**
 *
 */
public class DrawBridge extends CommandGroup {

    public DrawBridge() {
    	pinmode( 0 , 1	);
    	
    	// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

}
