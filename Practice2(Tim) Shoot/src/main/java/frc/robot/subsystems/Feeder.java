// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder extends SubsystemBase {

  VictorSPX m_motor = new VictorSPX(2);
  

  /** Creates a new Feeder. */
  public Feeder() {}

  public void Drive(double speed){
    m_motor.configClosedloopRamp(0);
    m_motor.set(ControlMode.PercentOutput, speed);
  }

  public void ChangeRampTime (double time){
    m_motor.configClosedloopRamp(time);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
