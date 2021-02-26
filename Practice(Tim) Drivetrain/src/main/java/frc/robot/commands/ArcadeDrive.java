// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends CommandBase {
  /** Creates a new ArcadeDrive. */

  private final DriveTrain m_drivetrain;
  private final Joystick m_joystick;
  
  public ArcadeDrive(DriveTrain i_drivetrain, Joystick i_joystick) {
    m_drivetrain = i_drivetrain;
    m_joystick = i_joystick;
    addRequirements(m_drivetrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.ArcadeDrive(m_joystick.getY(), m_joystick.getX());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.ArcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
