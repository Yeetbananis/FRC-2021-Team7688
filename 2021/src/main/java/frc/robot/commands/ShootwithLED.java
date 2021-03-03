// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import frc.robot.RobotContainer;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ShootwithLED extends ParallelRaceGroup {
  /** Creates a new ShootwithLED. */
  public ShootwithLED() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new FeedLaunch(RobotContainer.m_launcher, RobotContainer.m_feeder, RobotContainer.m_agitator),new LEDrainbow(RobotContainer.m_led));
  }
}