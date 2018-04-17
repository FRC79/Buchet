package org.usfirst.frc.team79.robot.commands;

import org.usfirst.frc.team79.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class FillTank extends Command{

	public int barrel;
	public Timer timer;
	
	public FillTank(int barrel) {
		this.barrel = barrel;
	}
	
	@Override
	protected void initialize() {
		timer = new Timer();
		Robot.shooter.charge[barrel].set(true);
	}
	
	@Override
	protected void end() {
		Robot.shooter.charge[barrel].set(false);
		Robot.shooter.filled[barrel] = true;
	}
	
	@Override
	protected boolean isFinished() {
		return timer.hasPeriodPassed(1);
	}

}
