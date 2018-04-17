package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;
import org.usfirst.frc.team79.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem {
	
	public Talon frontLeft, frontRight, backLeft, backRight;
	public SpeedControllerGroup leftGroup, rightGroup;
	
	
	public DifferentialDrive arcadeDrive;
	
	public DriveTrain() {
		frontLeft = new Talon(RobotMap.frontLeftTalon);
		frontRight = new Talon(RobotMap.frontRightTalon);
		backLeft = new Talon(RobotMap.backLeftTalon);
		backRight = new Talon(RobotMap.backRightTalon);
		
		leftGroup = new SpeedControllerGroup(frontLeft, backLeft);
		rightGroup = new SpeedControllerGroup(frontRight, backRight);
		
		this.arcadeDrive = new DifferentialDrive(leftGroup, rightGroup);
	}
	
	public void arcadeDrive(double forward, double rotate) {
		arcadeDrive.arcadeDrive(forward, rotate);
	}

	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new ArcadeDrive());
	}

}
