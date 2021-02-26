// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    /*
    DRIVETRAIN
    */

    public static final int DRIVETRAIN_DRIVE_DIRECTION = 1; //1 or -1
    public static final double DRIVETRAIN_RAMP = 1;

    public static final int DRIVETRAIN_LEFT_FRONT_TOP_CHANNEL = 7;
    public static final int DRIVETRAIN_LEFT_FRONT_BOTTOM_CHANNEL = 8;
    public static final int DRIVETRAIN_LEFT_BACK_TOP_CHANNEL = 9;

    //TALON
    public static final int DRIVETRAIN_LEFT_BACK_BOTTOM_CHANNEL = 10;
    public static final int DRIVETRAIN_RIGHT_BACK_BOTTOM_CHANNEL = 3;

    //VICTOR
    public static final int DRIVETRAIN_RIGHT_FRONT_TOP_CHANNEL = 4;
    public static final int DRIVETRAIN_RIGHT_FRONT_BOTTOM_CHANNEL = 5;
    public static final int DRIVETRAIN_RIGHT_BACK_TOP_CHANNEL = 6;

    public static final int DRIVETRAIN_JOYSTICK_AXIS_SPEED = 4;
    public static final int DRIVETRAIN_JOYSTICK_AXIS_ROTATION = 1;
    public static final int DRIVETRAIN_DRIVE_TRIGGER = 12;
}
