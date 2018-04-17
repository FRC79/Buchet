package org.usfirst.frc.team79.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class FireShirt extends CommandGroup {
	
	public FireShirt(int barrel) {
		this.addSequential(new ReleaseTank(barrel));
		this.addSequential(new FillTank(barrel));
	}
	
}
