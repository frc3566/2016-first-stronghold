package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;


import org.usfirst.frc3566.VisionGimbalTestCCRJan19.buttons.*;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class autonomousButtons extends Command {

	public int defense;
//	public static portCullisButton portCullisButton;
    public autonomousButtons() {
    	
    	//portcullis=1; Moat=2; rampart=3; rockWall=4; roughTerrain=5; sallyPort = 6; lowBar=7; chevaldeFreis=8; drawBridge=9; 
    	
    	/*SmartDashboard.putData("Moat", new Moat());
    	SmartDashboard.putData("LowBar", null);
    	SmartDashboard.putData("PortCullis", null);
    	SmartDashboard.putData("PortCullis", null);
    	SmartDashboard.putData("PortCullis", null);
    	SmartDashboard.putData("PortCullis", null);
    	SmartDashboard.putData("PortCullis", null);*/
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

    	SmartDashboard.putData("PortCullis", new portCullisButton()); 
    	SmartDashboard.putData("Moat", new Moat()); 
    	SmartDashboard.putData("LowBar", new LowBar()); 
    	SmartDashboard.putData("ChevaldeFries", new ChevaldeFries()); 
    	SmartDashboard.putData("Rampart", new Rampart()); 
    	SmartDashboard.putData("DrawBridge", new DrawBridge()); 
    	SmartDashboard.putData("Sallyport", new Sallyport()); 
    	SmartDashboard.putData("RoughTerrain", new RoughTerrain()); 
    	SmartDashboard.putData("RockWall", new RockWall()); 
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
