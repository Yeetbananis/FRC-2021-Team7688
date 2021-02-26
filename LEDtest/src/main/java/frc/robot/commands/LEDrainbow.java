// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.LED;

public class LEDrainbow extends CommandBase {
  /** Creates a new LEDrainbow. */
  private final Timer time = new Timer();
  private LED led;
  public LEDrainbow(LED ledd) {
    
    led = ledd;
    addRequirements(ledd);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    time.reset();
    time.start();
    led.ShootRainbow();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    led.Speed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if(time.get()<Constants.RAMP_UP_TIME*2+Constants.WAIT_TIME){
      return false;

    } else {
      return true;

    }
    
  }
}
