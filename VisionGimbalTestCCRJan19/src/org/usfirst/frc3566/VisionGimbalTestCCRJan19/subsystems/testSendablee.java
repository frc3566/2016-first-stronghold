package org.usfirst.frc3566.VisionGimbalTestCCRJan19.subsystems;

import java.awt.Color;

import javax.swing.JPanel;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.tables.ITable;

public class testSendablee extends JPanel implements Sendable{

	public testSendablee(){
		this.setSize(100,100);
		this.setBackground(Color.CYAN);
		this.setVisible(true);
	}
	@Override
	public void initTable(ITable subtable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ITable getTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSmartDashboardType() {
		// TODO Auto-generated method stub
		return null;
	}

}
