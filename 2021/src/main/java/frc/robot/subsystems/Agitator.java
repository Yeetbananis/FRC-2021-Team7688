// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Agitator extends SubsystemBase {
  /** Creates a new Agitator. */
  private final CANSparkMax agitator = new CANSparkMax(Constants.AGITATOR_MOTOR_PORT,MotorType.kBrushless);
  public Agitator() {}

  public void Set_Ramp_up_time(double time){
    agitator.setOpenLoopRampRate(time);
  }

  public void Speed(int Speed){
    agitator.set(Speed);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
