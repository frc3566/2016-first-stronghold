package org.usfirst.frc3566.chasis2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */

public class Autonomous extends CommandGroup {
    
	public Autonomous(int num) {

			if (num==0){ //Cheval de Frise
				System.out.println("autonomous: "+num+"started");
				
//				addSequential(new timyDrive(-1,2));
			
				System.out.println("autonomous: "+num+"ended");
			
		}

			if (num==1){//DrawBridge
				System.out.println("autonomous: "+num+"started");

//				addSequential(new recenterBackWheels());
//		        addParallel(new recenterFrontWheelss());
//		
//				addSequential(new timyDrive(-0.5,1));
//			
				
				System.out.println("autonomous: "+num+"ended");
			
			
		}
			if (num==2){//LowBar
				System.out.println("autonomous: "+num+"started");
				
				addSequential(new recenterBackWheels());
		        addParallel(new recenterFrontWheels());
		        addParallel(new BPUdown());/////////
		        addSequential(new driveStraight(.6,3));
		        addSequential(new recenterBackWheels());
		        
		        addParallel(new recenterFrontWheels());
		        addSequential(new driveStraight(-.6,3));
		        
		        addSequential(new recenterBackWheels());
		        addParallel(new recenterFrontWheels());

		        
//			
				
				System.out.println("autonomous: "+num+"ended");
			
			
		}

			if (num==3){//Moat
				System.out.println("autonomous: "+num+"started");
//
				   addSequential(new recenterBackWheels());
			        addParallel(new recenterFrontWheels());
			        addSequential(new driveStraight(.3,2));
			        addSequential(new recenterBackWheels());
			        addParallel(new recenterFrontWheels());
			        addSequential(new driveStraight(.9,2));
//				
//				addSequential(new timyDrive(.5,1));
//			
				System.out.println("autonomous: "+num+"ended");
			
		}
			
		if (num==4){ //Portcullis
			System.out.println("autonomous: "+num+"started");
			
//			addSequential(new BPUgoTo(3, .2));
//			addSequential (new BPUgoTo(1, .7));
//			addSequential(new BPUgoTo(2,.3));
//			addSequential(new timyDrive(.5, 1));
			
			System.out.println("autonomous: "+num+"ended");
		}
		
		
		if (num == 5) { //Rampart
			System.out.println("autonomous: "+num+"started");
			
//			addSequential(new recenterBackWheels());
//	        addParallel(new recenterFrontWheels());
//			
//			addSequential(new BPUdown());
//			addSequential(new timyDrive(.3, 5));
			System.out.println("autonomous: "+num+"ended");
		}
		
		if (num == 6) { //RockWall
			   addSequential(new recenterBackWheels());
		        addParallel(new recenterFrontWheels());
		        addSequential(new driveStraight(.3,2));
		        addSequential(new recenterBackWheels());
		        addParallel(new recenterFrontWheels());
		        addSequential(new driveStraight(1,2));
//			
		}
		
		if (num == 7){ // Rough Terrain
			System.out.println("autonomous: "+num+"started");
			   addSequential(new recenterBackWheels());
		        addParallel(new recenterFrontWheels());
		        addSequential(new driveStraight(.3,2));
		        addSequential(new recenterBackWheels());
		        addParallel(new recenterFrontWheels());
		        addSequential(new driveStraight(.6,2));
//			
//		System.out.println("autonomous: "+num+"ended");
		}
		
		if (num == 8){ // SallyPort
			System.out.println("autonomous: "+num+"started");
//			addSequential(new timyDrive(.5, 2));
			System.out.println("autonomous: "+num+"ended");
		}
			
		if (num == 9){//Drive Slowly Forward
			System.out.println("autonomous: "+num+"started");
//			addSequential(new BPUgoTo(2, .1));
//			addSequential(new timyDrive(.5, 2));
			System.out.println("autonomous: "+num+"ended");
		}
		
		if (num == 10){//Drive Slowly Backward
			System.out.println("autonomous: "+num+"started");

//			addSequential(new timyDrive(.65,6));
			System.out.println("autonomous: "+num+"ended");
		}
		
		if (num ==11){//Drive Full Speed Forward
			System.out.println("autonomous: "+num+"started");
//			addSequential(new timyDrive(.5, 2));
			System.out.println("autonomous: "+num+"ended");
		}
		
		
	
		
	}

	
}
