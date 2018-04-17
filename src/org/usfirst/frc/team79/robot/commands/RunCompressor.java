package org.usfirst.frc.team79.robot.commands;

import org.usfirst.frc.team79.robot.Robot;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;

public class RunCompressor extends Command{

	public RunCompressor() {
		requires(Robot.compressors);
	}
	
	@Override
	protected void execute() {
		Relay.Value setValue = !Robot.compressors.pressureSwitch.get() ? Relay.Value.kForward : Relay.Value.kOff;
		Robot.compressors.com0.set(setValue);
		Robot.compressors.com1.set(setValue);
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}

}
