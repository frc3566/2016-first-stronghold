// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.chasis2016;

import edu.wpi.first.wpilibj.IterativeRobot;


import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc3566.chasis2016.subsystems.EndGameWinch;
import org.usfirst.frc3566.chasis2016.commands.*;
import org.usfirst.frc3566.chasis2016.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.\
 * new radio: 10.35.66.83
 */
public class Robot extends IterativeRobot {
	
    Command autonomousCommand;
    SendableChooser chooser;
    public static OI oi;
    public static NetworkTable table;
    public static getVisionValue getVisionValue;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static EndGameWinch endGameWinch;
    public static CatapultWinchAimer catapultWinchAimer;
    public static RulerWinchEndGame rulerWinchEndGame;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static driveTrain driveTrain;
    public static windowControl windowControl;
	public static ballPickerUpper bpu;
	public static putsmartDashboard sd;
	public static catapult catapult;
	
	
//public static Ytwist ytwist;
//public static Ztwist ztwist;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
  
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    catapultWinchAimer = new CatapultWinchAimer();
    rulerWinchEndGame = new RulerWinchEndGame();
    endGameWinch = new EndGameWinch();
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        oi = new OI();
        table = NetworkTable.getTable("GRIP/myContoursReport"); 
        driveTrain= new driveTrain();
        windowControl= new windowControl();
        catapult= new catapult();
          bpu = new ballPickerUpper();
       sd= new putsmartDashboard();
       getVisionValue = new getVisionValue();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
       
       


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

       chooser = new SendableChooser();
       chooser.addObject("Cheval de Frise", new Autonomous(0));
       chooser.addObject("DrawBridge", new Autonomous(1));
       chooser.addObject("LowBar", new Autonomous(2));
       chooser.addObject("Moat", new Autonomous(3));
       chooser.addObject("Portcullis", new Autonomous(4));
       chooser.addObject("Rampart", new Autonomous(5));
       chooser.addObject("RockWall", new Autonomous(6));
       chooser.addObject("Rough Terrain", new Autonomous(7));
       chooser.addObject("Sallyport", new Autonomous(8));
       chooser.addDefault("Default Drive Slowly Forward", new Autonomous(9));
       chooser.addObject("Drive Slowly Backward", new Autonomous(10));
       chooser.addObject("Drive Forward Full Speed", new Autonomous(11));
       SmartDashboard.putData("Autonomous", chooser);
       
        
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
    	autonomousCommand = (Command) chooser.getSelected();
    	autonomousCommand.start();
  
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
    	//ztwist.start();
    //	ytwist.start();
    	sd.start();
    	getVisionValue.start();
        if (autonomousCommand != null) 
        	autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
