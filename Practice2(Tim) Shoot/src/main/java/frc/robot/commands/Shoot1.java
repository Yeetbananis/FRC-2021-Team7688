// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Launcher;

public class Shoot1 extends CommandBase {

  Launcher m_launcher;
  
  private final Timer m_timer = new Timer();
  /** Creates a new Shoot1. */
  public Shoot1(Launcher inputLauncher) {
    m_launcher = inputLauncher;
    addRequirements(m_launcher);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_launcher.ChangeRampTime2(5);
    m_timer.reset();
    m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_launcher.Shoot(0.5, 0.5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if(m_timer.get() > 5){
      return true;
    } else {
      return false;
    }
  }
}
