// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.chasis2016.subsystems;

import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;
import org.usfirst.frc3566.chasis2016.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class driveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /*    public static CANTalon backLeftMotor;
    public static CANTalon backRightMotor;
    public static CANTalon frontLeftMotor;
    public static CANTalon frontRightMotor;
    public static CANTalon frontSteering;
    public static CANTalon backSteering;

     * (non-Javadoc)
     * @see edu.wpi.first.wpilibj.command.Subsystem#initDefaultCommand()
     */
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon cANTalon1 = RobotMap.backLeftMotor;
    private final CANTalon cANTalon2 = RobotMap.backRightMotor;
    private final CANTalon cANTalon3 = RobotMap.frontLeftMotor;
    private final CANTalon cANTalon4 = RobotMap.frontRightMotor;
    private final CANTalon cANTalon5 = RobotMap.frontSteering;
    private final CANTalon cANTalon6 = RobotMap.backSteering;
    private final CANTalon bu = RobotMap.pickUpBall;
    private final RobotDrive robotDrive4 = RobotMap.driveTrainRobot4;
    private final CANTalon bpu = RobotMap.pickUpBall;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	setDefaultCommand(new DriveWithJoysticks());
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void driveIt (double Y, double X){
    	//robotDrive4.arcadeDrive(X,Y);;
    	//check x values for robot, see if they are same as the d2 values 
    }
    
    
    public void drive2(double speed){
    
    	 cANTalon1.set(speed * -1.0);
    	cANTalon2.set(speed * 1.0);
    	  cANTalon3.set(speed * -1.0); 
    	  cANTalon4.set(speed * 1.0);
    	
    	
    	
    }
   /* public void driveTimmyTitimer2 (double RocheBox){
    	cANTalon1.set(1);
    	cANTalon2.set(1);
    	cANTalon3.set(1);
    	cANTalon4.set(1);
    	cANTalon5.set(1);
    	cANTalon6.set(1);
    	
    }*/
    
    public void driveTimmyTimer2 (double s){
    	if(s>=0.2){
    	cANTalon1.set(Math.sqrt(s) * -1.0);
    	cANTalon2.set(Math.sqrt(s));
    	cANTalon3.set(Math.sqrt(s) * -1.0);
    	cANTalon4.set(Math.sqrt(s));
    	}else if(s<-0.2){
        cANTalon1.set(Math.sqrt(-s));
        cANTalon2.set(Math.sqrt(-s)* -1.0);
        cANTalon3.set(Math.sqrt(-s));
        cANTalon4.set(Math.sqrt(-s)* -1.0);
        
    	}else{
    		cANTalon1.enableBrakeMode(true);
    		cANTalon2.enableBrakeMode(true);
    		cANTalon3.enableBrakeMode(true);
    		cANTalon4.enableBrakeMode(true);
    		
    	}
    }
    public void bpuMovement(double speed){
    	bpu.set(speed);
    }
    public void threeWheelDrive (double speed){
    	if (speed> 0){

        	cANTalon1.set(0.2);
        	cANTalon2.set(speed * -1);
        	cANTalon3.set(speed);
        	cANTalon4.set(speed * -1 );
    	} else if (speed<-0.2){

        	cANTalon1.set(speed);
        	cANTalon2.set(0);
        	cANTalon3.set(speed);
        	cANTalon4.set(speed * -1 );
    	} else {
    		cANTalon1.enableBrakeMode(true);
    		cANTalon2.enableBrakeMode(true);
    		cANTalon3.enableBrakeMode(true);
    		cANTalon4.enableBrakeMode(true);
    	}
    }
  public void d2Stop (){
    //	set d2stop everytime after d2 is not called 
	  cANTalon1.set(0.0);
  	  cANTalon2.set(0.0);
   	  cANTalon3.set(0.0);
      cANTalon4.set(0.0);
    	//call this after d2 equals 0 
    }
  public void creepDrive (double speed) {
	  cANTalon1.set(0.2);
	  cANTalon2.set(0.2);
	  cANTalon3.set(0.2);
	  cANTalon4.set(0.2);
  }
  
    
/* public void combocombo5 (double potValue){
	double Zvalue=Robot.oi.joystick1.getZ();
		double a=9.7; double range=0.5;
		if(RobotMap.steeringAnalogPotentiometerFRONT.get()>a+range ){
			RobotMap.frontSteering.set(-0.2);
		}else if (RobotMap.steeringAnalogPotentiometerFRONT.get()< a-range){
			RobotMap.frontSteering.set(0.2);
		}else{
			Robot.windowControl.frontWindowStopTurning();
			System.out.println("inRange!!!!!"+a+" "+range);
		}
 }*/
    
    
}

