package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

	public Solenoid[] charge;
	public Solenoid[] release;
	public boolean[] filled;
	
	public Shooter(){
		charge = new Solenoid[4];
		release = new Solenoid[4];
		filled = new boolean[4];
		
		charge[0] = new Solenoid(RobotMap.CHARGE0);
		charge[1] = new Solenoid(RobotMap.CHARGE1);
		charge[2] = new Solenoid(RobotMap.CHARGE2);
		charge[3] = new Solenoid(RobotMap.CHARGE3);
		
		release[0] = new Solenoid(RobotMap.RELEASE0);
		release[1] = new Solenoid(RobotMap.RELEASE1);
		release[2] = new Solenoid(RobotMap.RELEASE2);
		release[3] = new Solenoid(RobotMap.RELEASE3);
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}

}
