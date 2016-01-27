package org.usfirst.frc3566.VisionGimbalTestCCRJan19;

import edu.wpi.first.wpilibj.Timer;

public class visionValue {
	
	
	public visionValue (int value) { 
		
		
	double[] defaultValue = new double[0];
    
	
	     double[] areas = Robot.table.getNumberArray("area", defaultValue); 

	     double[] centerX = Robot.table.getNumberArray("centerX", defaultValue);

	     double[] centerY = Robot.table.getNumberArray("centerY", defaultValue);
	       System.out.println("areas: "); 
	        for (double area: areas) {
	     	   System.out.print(area + " ");
	     	   
	     	}
	        System.out.println("centerx: ");
	        for (double X: centerX) {
		     	   System.out.print(centerX + "  ");
		     	   
		     	}
	        System.out.println("centery: ");
	        for (double Y: centerY) {
		     	   System.out.print(centerY + "  ");
		     	   
		     	}
	        
	        
	} 

	/*public void check(){
		if ()
	}*/
}
