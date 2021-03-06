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

import edu.wpi.first.wpilibj.AnalogPotentiometer;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
   
   
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	 public static CANTalon backLeftMotor; //4
	// public static PowerDistributionPanel ja; 
	    public static CANTalon backRightMotor; //3
	    public static CANTalon frontLeftMotor; //2
	    public static CANTalon frontRightMotor; //1
	    public static CANTalon frontSteering; //5
	    public static CANTalon backSteering; //6
	    public static CANTalon pickUpBall; //7
	 //   public static CANTalon horizontalGimbalTurningCAN1GimbalHorizontal;
	    public static CANTalon RulerWinch; //9
	    public static CANTalon catapult; //8
	    public static RobotDrive driveTrainRobot4;
	    public static Servo triggerServo;
	    public static CANTalon ballPickerUpper2;
	    public static CANTalon endgamewinch;
	    // max is 2.30
	    // max is 5.1 
	    public static final double GIMBAL_MOTOR_SPEED = 0.25;
	    public static final double WINDOW_MOTOR_SPEED = .6;
	    public static final double POTENTIOMETER_CENTER = 100;
		public static final double GIMBAL_TIMEOUT = 0.1; 
		public static final double BPU_MOTOR_SPEED=1;
		public static final double CATAPULT_SPEED=0.5;
		public static boolean solenoidMode=false;		
		public static final double LINEAR_FRONT_CENTER= 9; //front range: 6.5 -- 11.5
		public static final double LINEAR_BACK_CENTER= 4.3; 
		public static final double RANGE = 0.5;
	    public static final double GIMBAL_INERTIA = 28;
	    public static final double BPU_CENTER = 130;
	    public static final double BPU_MAX = 194;
	    public static final double BPU_MIN = 116; 
	    
	    public static AnalogPotentiometer steeringAnalogPotentiometerFRONT;
	    public static AnalogPotentiometer steeringAnalogPotentiometerBACK;
	    public static AnalogPotentiometer sensorAnalogPotentiometer1;
	    public static AnalogPotentiometer BPUencoder;
	    
	    public static Solenoid solenoid; 
	    public static final int VOLTS_PER_SECOND = 36;
		public static final double WENCH_SPEED = .8;
	    
		public static DigitalOutput blueLight; //port 8 i think
		
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
      
       /* driveTrainRobot4.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainRobot4.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainRobot4.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        driveTrainRobot4.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
       */
        
/*
        horizontalGimbalTurningCAN1GimbalHorizontal = new CANTalon(1);
        LiveWindow.addActuator("HorizontalGimbalTurning", "CAN3GimbalHorizontal", horizontalGimbalTurningCAN1GimbalHorizontal);
        
        */

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

      	steeringAnalogPotentiometerFRONT = new AnalogPotentiometer(3,12,0);
      	LiveWindow.addSensor("Steering", "FRONT Steering", steeringAnalogPotentiometerFRONT);
      	
      	steeringAnalogPotentiometerBACK = new AnalogPotentiometer(2,12,0);
      	LiveWindow.addSensor("Steering", "BACK Steering", steeringAnalogPotentiometerBACK);
      //	ja = new PowerDistributionPanel(9);
      	
      	endgamewinch = new CANTalon(11);
      	LiveWindow.addActuator("End Game Winch", "CAN3_EndGameWinch", endgamewinch);
      	
      	solenoid = new Solenoid(1);
      	LiveWindow.addActuator("Solenoid", 1, solenoid);
      	
      	BPUencoder = new AnalogPotentiometer (0, 270, 0);
      	LiveWindow.addSensor("BPU", "BPU Encoder", BPUencoder);
//min:115 max:195 middle: 130
      	
        frontRightMotor = new CANTalon(1);
        LiveWindow.addActuator("Wheels", "Front Right CIM", frontRightMotor);
        frontRightMotor.setVoltageRampRate(VOLTS_PER_SECOND);
       
        frontLeftMotor = new CANTalon(2);
        LiveWindow.addActuator("Wheels", "Front Left CIM", frontLeftMotor);
        frontLeftMotor.setVoltageRampRate(VOLTS_PER_SECOND);
        
          backRightMotor = new CANTalon(3);
          LiveWindow.addActuator("Wheels", "Back Right CIM", backRightMotor);
          backRightMotor.setVoltageRampRate(VOLTS_PER_SECOND);
          
          backLeftMotor = new CANTalon(4);
          LiveWindow.addActuator("Wheels", "Back Left CIM", backLeftMotor);
          backLeftMotor.setVoltageRampRate(VOLTS_PER_SECOND);
          
          frontSteering = new CANTalon(5);
          LiveWindow.addActuator("Steering", "Front Steering SnowBlower", frontSteering);
          
          backSteering = new CANTalon(6);
          LiveWindow.addActuator("Steering", "Back Steering SnowBlower", backSteering);
          
          pickUpBall = new CANTalon(7);
          LiveWindow.addActuator("BPU", "Ball Picker Upper", pickUpBall);
          
          RulerWinch = new CANTalon(8);
          LiveWindow.addActuator("RulerWinch", "Ruler Winch", RulerWinch);
          
          catapult = new CANTalon(9);
          LiveWindow.addActuator("catapult", "catapult", catapult);
          
          ballPickerUpper2 = new CANTalon(10);
          LiveWindow.addActuator("BPU2", "Ball Picker Upper 2", ballPickerUpper2);
          
          
          driveTrainRobot4 = new RobotDrive (backLeftMotor, frontLeftMotor, backRightMotor, frontRightMotor);
          
          blueLight = new DigitalOutput(8);
          
    }  
}

