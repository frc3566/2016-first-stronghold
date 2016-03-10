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

import org.usfirst.frc3566.chasis2016.commands.autoRecenterCalc;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * RobotMap is a good place to store all the values needed in driving and other functions
 * DO NOT STORE VALUES IN INDIVIDUAL COMMANDS. YOU WILL REGRET IT.
 */

public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	
	//IMPORTANT: MUST DO: go to the roborio ip and test all the id # for the motors!!! 
	//EXTRA: COMMAND FOR TESTING CENTER CREATED; DO NOT ADD TO ROBOT
	public static autoRecenterCalc autoRecenterCalc;
	//
	//All the talons 
		public static CANTalon backLeftMotor; //4
	    public static CANTalon backRightMotor; //3
	    public static CANTalon frontLeftMotor; //2
	    public static CANTalon frontRightMotor; //1
	    public static CANTalon frontSteering; //5
	    public static CANTalon backSteering; //6
	    public static CANTalon pickUpBall; //7
	    public static CANTalon ballPickerUpper2;//10
	    public static CANTalon CatapultBIGGearWinch; //8
	    public static CANTalon rulerWinchEndGameRulerWinch;//9
	    public static Talon catapultSwitch; //9PWM  
	    public static CANTalon BPUfunction; 
	    
	    
	    public static RobotDrive driveTrainRobot4;
	    public static Servo triggerServo;
	    
	    public static final double WINDOW_MOTOR_SPEED = .6;
		public static final double BPU_MOTOR_SPEED=1;
		public static final double CATAPULT_SPEED=0.5;
		public static boolean solenoidMode=false;	
		
		public static final double LINEAR_FRONT_CENTER= 9.5; //has to retest!! has to retest!!!!
		public static final double LINEAR_BACK_CENTER= 3.3; 
	    public static final double FRONT_LIMITS_MAX_RIGHT =8.5 ;
	    public static final double FRONT_LIMITS_MAX_LEFTT = 10;
	    public static final double BACK_LIMITS_MAX_RIGHT =5 ;
	    public static final double BACK_LIMITS_MAX_LEFT =2 ;
	    public static final double STEERING_RANGE=.5;
	    public static final double RECENTER_TIMEOUT=1.5;
	    		
	    public static final double BPU_CENTER = 130;
	    public static final double BPU_MAX = 194;
	    public static final double BPU_MIN = 116; //need to be retested
	    
	    
	    public static AnalogPotentiometer steeringAnalogPotentiometerFRONT;
	    public static AnalogPotentiometer steeringAnalogPotentiometerBACK;
	   public static AnalogPotentiometer BPUencoder;
	    
//	    public static Solenoid solenoid; 
	    public static final int VOLTS_PER_SECOND = 36;
		public static final double WENCH_SPEED = .8;
		
		
	    //CATAPULT start
	    public static Servo catapultWinchAimerBIGWDogControllerServoPWM0;
	    public static Servo catapultWinchAimerCatapultReleaseServoLeftPWM1;
	    public static Servo catapultWinchAimerCatapultReleaseServoRightPWM4;
	    public static Servo catapultWinchAimerCatapultCamAimerServoPWM3;
	    public static Servo catapultWinchAimerCatapultHorizontalMoveServoPWM2;
	    public static AnalogPotentiometer catapultWinchAimerCatapultAngleAimerPotAnalog1;
	    public static DigitalInput catapultWinchAimerCatapultLimitSwitchDIO0;
	    public static Encoder catapultWinchAimerCatapultHorizMoveQuadEncoderDIO1_2;
	    public static Encoder catapultWinchAimerBIGWinchMotorQuadEncoderDIO3_4;
	    
	    public static DigitalInput catapultColorSensorDIO5;
	    public static DigitalInput catapultTriggerResetSwitchDIO6;
	    public static DigitalInput catapultTriggerFireStopSwitchDIO7;
	    
	    public static final double CAT_WINCH_MOTOR_SPEED = 0.85;
	    public static final double WINCH_WIND_SERVO_ANGLE = 0.2;
	    public static final double WINCH_RELEASE_SERVO_ANGLE = 0.5;
	    public static final double WINCH_SERVO_ACTIVITY_TIME = 0.5;
	    
	    
	    public static final double TRIGGER_PWM4_LOCK_SERVO_ANGLE = 0.70;
	    public static final double TRIGGER_PWM4_FIRE_SERVO_ANGLE = 0.25;
	    
	    public static final double AIMER_INCREMENTAL_MOVE_VALUE = 0.025;
	    
	    public static final double CATAPULT_TRIGGER_SPEED = 0.65;
	    
	    public static final double CATAPULT_HORIZ_MOVE_AMOUNT = 0.005;
	    public static final long CAT_HORIZONTAL_WAIT_TIME_MS = 50; 

	    public static final double CAT_HORIZ_CENTER_POS = 0.15;  // in a 0 to 1 world 0.5 is half way
	   public static final double BIG_WINCH_SPEED = 0.5;
	   public static final boolean CLOSED = false;
	   public static final boolean OPEN = true;
		//CATAPULT end
	   
	   
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	//Start catapult initialization
    	autoRecenterCalc = new autoRecenterCalc();
    	SmartDashboard.putData("autoRecenter!!", autoRecenterCalc);
          
          catapultWinchAimerBIGWDogControllerServoPWM0 = new Servo(0);
          LiveWindow.addActuator("CatapultWinchAimer", "BIGWDogControllerServoPWM0", catapultWinchAimerBIGWDogControllerServoPWM0);
          
          catapultWinchAimerCatapultReleaseServoLeftPWM1 = new Servo(1);
          LiveWindow.addActuator("CatapultWinchAimer", "CatapultReleaseServoLeftPWM1", catapultWinchAimerCatapultReleaseServoLeftPWM1);
          

          catapultWinchAimerCatapultHorizontalMoveServoPWM2 = new Servo(2);
          LiveWindow.addActuator("CatapultWinchAimer", "CatapultHorizontalMoveServoPWM2", catapultWinchAimerCatapultHorizontalMoveServoPWM2);
          
          
          catapultWinchAimerCatapultReleaseServoRightPWM4 = new Servo(4);
          LiveWindow.addActuator("CatapultWinchAimer", "CatapultReleaseServoRightPWM4", catapultWinchAimerCatapultReleaseServoRightPWM4);
          
          catapultWinchAimerCatapultCamAimerServoPWM3 = new Servo(3);
          LiveWindow.addActuator("CatapultWinchAimer", "CatapultCamAimerServoPWM3", catapultWinchAimerCatapultCamAimerServoPWM3);
          
          catapultWinchAimerCatapultAngleAimerPotAnalog1 = new AnalogPotentiometer(1, 270.0, -135.0);
          LiveWindow.addSensor("CatapultWinchAimer", "CatapultAngleAimerPotAnalog1", catapultWinchAimerCatapultAngleAimerPotAnalog1);
          
          catapultWinchAimerCatapultLimitSwitchDIO0 = new DigitalInput(0);
          LiveWindow.addSensor("CatapultWinchAimer", "CatapultLimitSwitchDIO0", catapultWinchAimerCatapultLimitSwitchDIO0);
          
          
          
          //HEY YOU HAVE ENCODERS SLATED FOR DIO PORTS 1-2 and 3-4 And a color sensor at port 5 SO IT CAUSES PROBLEMS IF YOU RE-USE THEM
          //DON'T
          
          
          catapultColorSensorDIO5 = new DigitalInput(5);
          LiveWindow.addSensor("CatapultWinchAimer", "Catapult Color Sensor", catapultColorSensorDIO5);
          
          catapultTriggerResetSwitchDIO6  = new DigitalInput(6);
          LiveWindow.addSensor("CatapultWinchAimer", "Catapult Trigger Reset Switch", catapultTriggerResetSwitchDIO6);
       
          catapultTriggerFireStopSwitchDIO7  = new DigitalInput(7);
          LiveWindow.addSensor("CatapultWinchAimer", "catapult Trigger Fire Stop Switch", catapultTriggerFireStopSwitchDIO7);
          
          
          catapultWinchAimerCatapultHorizMoveQuadEncoderDIO1_2 = new Encoder(1, 2, false, EncodingType.k4X);
          LiveWindow.addSensor("CatapultWinchAimer", "CatapultHorizMoveQuadEncoderDIO1_2", catapultWinchAimerCatapultHorizMoveQuadEncoderDIO1_2);
          
          catapultWinchAimerCatapultHorizMoveQuadEncoderDIO1_2.setDistancePerPulse(1.0);
          catapultWinchAimerCatapultHorizMoveQuadEncoderDIO1_2.setPIDSourceType(PIDSourceType.kRate);
          catapultWinchAimerBIGWinchMotorQuadEncoderDIO3_4 = new Encoder(3, 4, false, EncodingType.k4X);
          LiveWindow.addSensor("CatapultWinchAimer", "BIGWinchMotorQuadEncoderDIO3_4", catapultWinchAimerBIGWinchMotorQuadEncoderDIO3_4);
          
          catapultWinchAimerBIGWinchMotorQuadEncoderDIO3_4.setDistancePerPulse(1.0);
          catapultWinchAimerBIGWinchMotorQuadEncoderDIO3_4.setPIDSourceType(PIDSourceType.kRate);
          //end catapult initialization

      	steeringAnalogPotentiometerFRONT = new AnalogPotentiometer(3,12,0);
      	LiveWindow.addSensor("Steering", "FRONT Steering", steeringAnalogPotentiometerFRONT);
      	
      	steeringAnalogPotentiometerBACK = new AnalogPotentiometer(2,12,0);
      	LiveWindow.addSensor("Steering", "BACK Steering", steeringAnalogPotentiometerBACK);
            	
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

    	  CatapultBIGGearWinch = new CANTalon(8); 
          LiveWindow.addActuator("CatapultWinchAimer", "Can5CatapultBIGGearWinch", CatapultBIGGearWinch);
          
          frontSteering = new CANTalon(5);
          LiveWindow.addActuator("Steering", "Front Steering SnowBlower", frontSteering);
          
          backSteering = new CANTalon(6);
          LiveWindow.addActuator("Steering", "Back Steering SnowBlower", backSteering);
          
          pickUpBall = new CANTalon(7);
          LiveWindow.addActuator("BPU", "Ball Picker Upper", pickUpBall);
          

          rulerWinchEndGameRulerWinch = new CANTalon(9);
          LiveWindow.addActuator("RulerWinchEndGame", "RulerWinchCAN6", rulerWinchEndGameRulerWinch);
          
          ballPickerUpper2 = new CANTalon(10);
          LiveWindow.addActuator("BPU2", "Ball Picker Upper 2", ballPickerUpper2);
          
          catapultSwitch = new Talon(9); //this is not a cantalon. 9 is for PWM
          LiveWindow.addActuator("Catapult Switch", 9, catapultSwitch);
          
          driveTrainRobot4 = new RobotDrive (backLeftMotor, frontLeftMotor, backRightMotor, frontRightMotor);
          
          BPUfunction = new CANTalon(11);
          LiveWindow.addActuator("BPU Function", "BPU Function", BPUfunction);
          
          
    }  
}

