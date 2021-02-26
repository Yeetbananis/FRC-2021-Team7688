// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
 
  private final WPI_TalonSRX blbot = new WPI_TalonSRX(10);
  private final WPI_VictorSPX bltop = new WPI_VictorSPX(9);
  private final WPI_VictorSPX flbot = new WPI_VictorSPX(8);
  private final WPI_VictorSPX fltop = new WPI_VictorSPX(7);

  private final WPI_TalonSRX brbot = new WPI_TalonSRX(3);
  private final WPI_VictorSPX brtop = new WPI_VictorSPX(6);
  private final WPI_VictorSPX frbot = new WPI_VictorSPX(5);
  private final WPI_VictorSPX frtop = new WPI_VictorSPX(4);

 
  private final DifferentialDrive m_drive = new DifferentialDrive(blbot, brbot);


  public DriveTrain() {

    blbot.configOpenloopRamp(1);
    brbot.configOpenloopRamp(1);

    bltop.follow(blbot);
    flbot.follow(blbot);
    fltop.follow(blbot);
    
    brtop.follow(brbot);
    frbot.follow(brbot);
    frtop.follow(brbot);
  }

  public void ArcadeDrive(double speed, double rotation){
    m_drive.arcadeDrive(speed * 1, rotation * 1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
