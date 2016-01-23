// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.Robot;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.RobotMap;

/**
 *
 */
public class GimbalUpVertical extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATION		

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public GimbalUpVertical() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.setTimeout(RobotMap.GIMBAL_TIMEOUT);
    	Robot.verticalGimbalTurning.moveVerticalUp();
    	/*RobotMap.table=NetworkTable.getTable("Root/GRIP/myContoursReport");
    	
    	System.out.println("Center X: " + RobotMap.table.getNumber("centerX", -1));

    	System.out.println("Center Y: " + RobotMap.table.getNumber("centerY", -1));

    	System.out.println("height: " + RobotMap.table.getNumber("height", 0));
    	
    	System.out.println("area : " + RobotMap.table.getNumber("area", 1));

    	System.out.println("width: " + RobotMap.table.getNumber("width", 10));*/
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() { 
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.verticalGimbalTurning.stopVerticalGimbal();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.verticalGimbalTurning.stopVerticalGimbal();
    }
}
