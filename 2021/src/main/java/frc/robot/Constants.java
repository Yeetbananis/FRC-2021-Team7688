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
    AGITATOR
    */
    public final static int AGITATOR_MOTOR_PORT = 2;
    public final static double AGITATOR_RAMP_TIME = 0.9;
    public final static double AGITATOR_MOTOR_SPEED = 0.3;
    public final static double AGITATOR_WAIT_TIME = 5;

    /*
    LED
    */
    public final static int LED_LENGTH = 59;
    public final static int LED_PORT = 2;
    public final static int HSV_SATURATION = 255;
    public final static int HSV_VALUE = 128;
  
    /*
    LAUNCHER
    */
    public static final double LAUNCHER_RAMP_TIME_DEFAULT = 1;
    public static final double FEEDER_RAMP_TIME_DEFAULT = 1;
    
    /*
    LIMELIGHT ROTATOR
    */
    public static final double LIMELIGHT_ACTUATOR_ROTATE_MAX = 180;
    public static final double LIMELIGHT_ACTUATOR_ROTATE_MIN = 0;
    public static final double LIMELIGHT_ACTUATOR_PITCH_MAX = 0;
    public static final double LIMELIGHT_ACTUATOR_PITCH_MIN = 180;
    
    public static final int LIMELIGHT_ACTUATOR_PITCH_CHANNEL = 0;
    public static final int LIMELIGHT_ACTUATOR_ROTATE_CHANNEL = 1;

    public static final int LIMELIGHT_ACTUATOR_ROTATE_TRIGGER = 7;
    public static final int LIMELIGHT_ACTUATOR_PITCH_TRIGGER = 8;

    /*
    DRIVETRAIN
    */
    public static final int DRIVETRAIN_DRIVE_DIRECTION = 1; //1 or -1
    public static final double DRIVETRAIN_RAMP = 1;

    public static final int DRIVETRAIN_LEFT_FRONT_TOP_CHANNEL = 7;
    public static final int DRIVETRAIN_LEFT_FRONT_BOTTOM_CHANNEL = 8;
    public static final int DRIVETRAIN_LEFT_BACK_TOP_CHANNEL = 9;

    public static final int DRIVETRAIN_LEFT_BACK_BOTTOM_CHANNEL = 10;
    public static final int DRIVETRAIN_RIGHT_BACK_BOTTOM_CHANNEL = 3;

    public static final int DRIVETRAIN_RIGHT_FRONT_TOP_CHANNEL = 4;
    public static final int DRIVETRAIN_RIGHT_FRONT_BOTTOM_CHANNEL = 5;
    public static final int DRIVETRAIN_RIGHT_BACK_TOP_CHANNEL = 6;

    public static final int DRIVETRAIN_JOYSTICK_AXIS_SPEED = 4;
    public static final int DRIVETRAIN_JOYSTICK_AXIS_ROTATION = 1;
    public static final int DRIVETRAIN_DRIVE_TRIGGER = 12;
}
