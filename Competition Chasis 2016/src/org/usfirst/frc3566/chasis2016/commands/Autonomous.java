package org.usfirst.frc3566.chasis2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
    
	public Autonomous(int num) {
		if (num == 99 ) {// Put down bpu for 2 seconds
		addSequential(new timyDrive(.1, 1));	
		}
		if (num == 98 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.2, 1));	
			}
		if (num == 97 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.3, 1));	
			}
		if (num == 96 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.4, 1));	
			}
		if (num == 95 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.5, 1));	
			}
		if (num == 94 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.6, 1));	
			}
		if (num == 93 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.7, 1));	
			}
		if (num == 92 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.8, 1));	
			}
		if (num == 91 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.9, 1));	
			}
		if (num == 90 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(1, 1));	
			}
		/*
		 * 	if (num == 99 ) {// Put down bpu for 2 seconds
		addSequential(new timyDrive(.1, 2));	
		}
		if (num == 98 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.2, 2));	
			}
		if (num == 97 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.3, 2));	
			}
		if (num == 96 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.4, 2));	
			}
		if (num == 95 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.5, 2));	
			}
		if (num == 94 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.6, 2));	
			}
		if (num == 93 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.7, 2));	
			}
		if (num == 92 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.8, 2));	
			}
		if (num == 91 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.9, 2));	
			}
		if (num == 90 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(1, 2));	
			}
		 * 
		 */
		/*
		 * 	if (num == 99 ) {// Put down bpu for 2 seconds
		addSequential(new timyDrive(.1, 4));	
		}
		if (num == 98 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.2, 4));	
			}
		if (num == 97 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.3, 4));	
			}
		if (num == 96 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.4, 4));	
			}
		if (num == 95 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.5, 4));	
			}
		if (num == 94 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.6, 4));	
			}
		if (num == 93 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.7, 4));	
			}
		if (num == 92 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.8, 4));	
			}
		if (num == 91 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(.9, 4));	
			}
		if (num == 90 ) {// Put down bpu for 2 seconds
			addSequential(new timyDrive(1, 4));	
			}
		 */
		
		
		
		
		
		
		
			if (num==0){ // ChevaldeFries IDEAL AND PERFECt
			addSequential(new timyDrive(.5, 2));
			
			
		}
		if (num==1){ // Drawbridge Never 
			

			addSequential(new timyDrive(.5, 2));
			
		}
		if (num == 2) { // Lowbar EASY PEASERY 

			addSequential(new BPUgoTo(2, .1));
			addSequential(new timyDrive(.5, 2));
			addSequential(new BPUgoTo(1, .5));
			addSequential(new BPUgoTo(3, .3));
			//aim and fire at Mr. Wells
			
		}
		if (num == 3) { // Moat EASY 
			addSequential(new BPUgoTo(2, .1));
			addSequential(new timyDrive(.5, 2));
		}
		
		if (num == 4){ // Portcullis HARD
			addSequential(new BPUgoTo(1, .1));
			addSequential(new timyDrive(.5, 2));
			addSequential(new BPUgoTo(3, .3));
			addParallel(new timyDrive(.3, 4));
			
		}
		
		if (num == 5){ // Rampart Impossible
			

			addSequential(new timyDrive(.5, 2));
		}
			
		if (num == 6 ){
			addSequential(new BPUgoTo(2, .1));
			addSequential(new timyDrive(.5, 2));
			
		}
		if (num == 7){ //RoughTerrain EASY even Jason can do this 
			addSequential(new BPUgoTo(2, .1));
			addSequential(new timyDrive(.5, 2));
			
		}
		
		if (num ==8){ // Sallyport imposible 
			
			addSequential(new timyDrive(.5, 2));
		}
		
		
	
		
	}

	
}
