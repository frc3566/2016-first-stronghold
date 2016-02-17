package org.usfirst.frc3566.chasis2016.autonomousButtons;


import org.usfirst.frc3566.chasis2016.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class portCullisButton extends Command {
	//public static int jason; 
	//public static int defense; 
	
    public portCullisButton() {
    
    	//RobotMap.DEFENSE=1;
  //  Robot.table.putNumber("defense", 1);
    	//Robot.autonomousButtonse.dfense=1;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

    }

    // Called just before this Command runs the first time
    protected void initialize() {

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
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
