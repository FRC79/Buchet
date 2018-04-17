package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;
import org.usfirst.frc.team79.robot.commands.RunCompressor;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Compressors extends Subsystem {

	public Relay com0, com1;
	public DigitalInput pressureSwitch;

	public Compressors() {
		com0 = new Relay(RobotMap.COMPRESSOR0);
		com1 = new Relay(RobotMap.COMPRESSOR1);
		
		pressureSwitch = new DigitalInput(RobotMap.COMPRESSOR_SWITCH);
	}
	
	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new RunCompressor());
	}

}
