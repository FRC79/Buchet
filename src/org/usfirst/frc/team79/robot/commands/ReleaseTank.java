package org.usfirst.frc.team79.robot.commands;

import org.usfirst.frc.team79.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class ReleaseTank extends Command{
	
	public int barrel;
	public Timer timer;
	
	public ReleaseTank(int barrel) {
		this.barrel = barrel;
	}

	@Override
	protected void initialize() {
		timer = new Timer();
		Robot.shooter.charge[barrel].set(false);
		sleep(20);
		Robot.shooter.release[barrel].set(true);
		Robot.shooter.filled[barrel] = false;
	}
	
	@Override
	protected void execute() {
	}
	
	@Override
	protected void end() {
		Robot.shooter.release[barrel].set(false);
	}
	
	private void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected boolean isFinished() {
		return timer.hasPeriodPassed(1);
	}

}
