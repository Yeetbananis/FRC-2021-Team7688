// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Agitator extends SubsystemBase {
  private final CANSparkMax agitator = new CANSparkMax(Constants.AGITATOR_MOTOR_PORT,MotorType.kBrushless);
  /** Creates a new Agitator. */
  public Agitator() {}

  public void Ro(double speed){
    agitator.set(speed);

  }
  public void SETTIME(double timee){
    agitator.setOpenLoopRampRate(timee);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
