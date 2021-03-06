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


import org.usfirst.frc3566.chasis2016.RobotMap;
import org.usfirst.frc3566.chasis2016.commands.CatapultWithJoySticks;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class CatapultWinchAimer extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon can5CatapultBIGGearWinch = RobotMap.CatapultBIGGearWinch;
    private final Servo bIGWDogControllerServoPWM0 = RobotMap.catapultWinchAimerBIGWDogControllerServoPWM0;
    private final Servo catapultReleaseServoLeftPWM1 = RobotMap.catapultWinchAimerCatapultReleaseServoLeftPWM1;
    private final Servo catapultReleaseServoRightPWM4 = RobotMap.catapultWinchAimerCatapultReleaseServoRightPWM4;
    private final Servo catapultCamAimerServoPWM3 = RobotMap.catapultWinchAimerCatapultCamAimerServoPWM3;
    private final Servo catapultHorizontalMoveServoPWM2 = RobotMap.catapultWinchAimerCatapultHorizontalMoveServoPWM2;
    private final AnalogPotentiometer catapultAngleAimerPotAnalog0 = RobotMap.catapultWinchAimerCatapultAngleAimerPotAnalog1;
    private final DigitalInput catapultLimitSwitchDIO0 = RobotMap.catapultWinchAimerCatapultLimitSwitchDIO0;
    private final Encoder catapultHorizMoveQuadEncoderDIO1_2 = RobotMap.catapultWinchAimerCatapultHorizMoveQuadEncoderDIO1_2;
    private final Encoder bIGWinchMotorQuadEncoderDIO3_4 = RobotMap.catapultWinchAimerBIGWinchMotorQuadEncoderDIO3_4;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    private double currentAimerMotorPosition;
    private final Talon catapultTriggerMotor = RobotMap.catapultSwitch;
    private final DigitalInput catapultColor = RobotMap.catapultColorSensorDIO5;
    private final DigitalInput catapultTriggerFireStopSwitch = RobotMap.catapultTriggerFireStopSwitchDIO7;
    private final DigitalInput catapultTriggerReadyForCatLoadSwitch = RobotMap.catapultTriggerResetSwitchDIO6;


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        //setDefaultCommand(new CatapultWithJoySticks());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    	
    	//currentAimerMotorPosition = catapultCamAimerServoPWM3.get();
       // this.goToThe50PercentSpot();
    	this.goToThe50PercentSpot();
    	setDefaultCommand(new CatapultWithJoySticks());
      
    	
    }
    
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());



public void winchServoEngage4Pull(){
	
	bIGWDogControllerServoPWM0.set(RobotMap.WINCH_WIND_SERVO_ANGLE);
}


public void winchServoRelease2Fire(){
	
	bIGWDogControllerServoPWM0.set(RobotMap.WINCH_RELEASE_SERVO_ANGLE);
}


public void runCatapultWinchForward(){
	
	can5CatapultBIGGearWinch.set(RobotMap.CAT_WINCH_MOTOR_SPEED * -1.0);
}

public void runCatapultWinchBackwards(){
	
	can5CatapultBIGGearWinch.set(RobotMap.CAT_WINCH_MOTOR_SPEED *1.0);
}


public void checkSwitch(){
  
  //System.out.println("The Catapult Switch is " + catapultLimitSwitchDIO0.get() );
  
  if(this.catapultLimitSwitchDIO0.get()== false){
	  SmartDashboard.putString("CatapultSwitch", "Closed");
	  System.out.println("closed");
  } else {
	  SmartDashboard.putString("CatapultSwitch", "Open");
	  System.out.println("Open");
  }

}

public void checkColorSensor(){
	
	/* Trying to do this
	 * 
	 * 		digitalWrite(s0, HIGH);  
  			digitalWrite(s1, HIGH);  
	 * 		digitalWrite(s2, LOW);  
  			digitalWrite(s3, LOW);  
  		//count OUT, pRed, RED  
  			red = pulseIn(out, digitalRead(out) == HIGH ? LOW : HIGH);  
  			digitalWrite(s3, HIGH);  
  		//count OUT, pBLUE, BLUE  
  			blue = pulseIn(out, digitalRead(out) == HIGH ? LOW : HIGH);  
  			digitalWrite(s2, HIGH);  
  		//count OUT, pGreen, GREEN  
  			green = pulseIn(out, digitalRead(out) == HIGH ? LOW : HIGH);  
}
	 */
	
		//int reading = catapultColor.getChannel();
		//int reading = catapultColor.
	 // SmartDashboard.putNumber("Catapult Color Data", reading);
	 // System.out.println("Color Sensor Reading is " + reading);
	 
	
}

public void cockCatapultToLimit(){
	can5CatapultBIGGearWinch.set(RobotMap.CAT_WINCH_MOTOR_SPEED * -1.0);
  
  while(catapultLimitSwitchDIO0.get() == true){  //Normally Open Switch....
	  can5CatapultBIGGearWinch.set(RobotMap.CAT_WINCH_MOTOR_SPEED * -1.0);
  }
  
  can5CatapultBIGGearWinch.set(0.0);
}

public void catapultWinchMotorOff(){
	can5CatapultBIGGearWinch.set(0.0);
}






public void catMoveAimerForward(){
	
	if(catapultCamAimerServoPWM3.get() < 1.0){
		catapultCamAimerServoPWM3.set(catapultCamAimerServoPWM3.get() + RobotMap.AIMER_INCREMENTAL_MOVE_VALUE);
	}
	
}

public void catMoveAimerBackwards(){
	
	if(catapultCamAimerServoPWM3.get() >  0.0){
		catapultCamAimerServoPWM3.set(catapultCamAimerServoPWM3.get() - RobotMap.AIMER_INCREMENTAL_MOVE_VALUE);
	}
	
}

public void moveCatHorizontalRight(){
	
	System.out.println("moveCatHorizRT Position " + catapultHorizontalMoveServoPWM2.get());
	if(catapultHorizontalMoveServoPWM2.get()< 1.0){
		catapultHorizontalMoveServoPWM2.set(catapultHorizontalMoveServoPWM2.get() + 
				RobotMap.CATAPULT_HORIZ_MOVE_AMOUNT);  //Using 0 to 1.0 idea...
	System.out.println("Winch Servo Position ... " + catapultHorizontalMoveServoPWM2.get());
	}
	
}

public void moveCatHorizontalLeft(){
	System.out.println("moveCatHorizLeft Position " + catapultHorizontalMoveServoPWM2.get());
	if(catapultHorizontalMoveServoPWM2.get()> 0.0){
		catapultHorizontalMoveServoPWM2.set(catapultHorizontalMoveServoPWM2.get() - 
				RobotMap.CATAPULT_HORIZ_MOVE_AMOUNT);  //Using 0 to 1.0 idea...
	
	System.out.println("Winch Servo Position ... " + catapultHorizontalMoveServoPWM2.get());
	}
}

public void goToThe50PercentSpot(){
	catapultHorizontalMoveServoPWM2.set(RobotMap.CAT_HORIZ_CENTER_POS);  
}


// These are methods to run the winch 
public void runBigWinchForward() {
	
	can5CatapultBIGGearWinch.set(RobotMap.BIG_WINCH_SPEED);
}

public void runBigWinchBackwards() {
	
	can5CatapultBIGGearWinch.set(RobotMap.BIG_WINCH_SPEED * -1.0);
}

public void stopBigWinch() {
	
	can5CatapultBIGGearWinch.set(0.0);
}


public void runBigWinchWithJoyStickYAxis(double speed){
	
	can5CatapultBIGGearWinch.set(speed);
}

public boolean getCatIsDownSwitchState(){
	
	return catapultLimitSwitchDIO0.get();
	}


public void runCatapultTrigger(double speed){
	catapultTriggerMotor.set(speed);
	
}

public boolean getCatTriggerFIREStopSwitchState(){
	return catapultTriggerFireStopSwitch.get();
}

public boolean getCatTriggerReadyForCatLoadSwitchState(){
	return catapultTriggerReadyForCatLoadSwitch.get();
}



} // end of class

