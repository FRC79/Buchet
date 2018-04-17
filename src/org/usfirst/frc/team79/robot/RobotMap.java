/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team79.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Motor controllers
	public static final int frontLeftTalon = 0;
	public static final int frontRightTalon = 1;
	public static final int backLeftTalon = 2;
	public static final int backRightTalon = 3;
	
	//Solenoids
	public static final int CHARGE0 = 0;
	public static final int CHARGE1 = 1;
	public static final int CHARGE2 = 2;
	public static final int CHARGE3 = 3;
	public static final int RELEASE0 = 4;
	public static final int RELEASE1 = 5;
	public static final int RELEASE2 = 6;
	public static final int RELEASE3 = 7;
	
	//Relay
	public static final int COMPRESSOR0 = 0;
	public static final int COMPRESSOR1 = 1;
	
	//DigitalIO
	public static final int COMPRESSOR_SWITCH = 0;
	
}
