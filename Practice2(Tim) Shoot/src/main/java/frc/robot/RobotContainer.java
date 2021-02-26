// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.Drive;
import frc.robot.commands.Stop;
import frc.robot.commands.Stop2;
import frc.robot.commands.shoot;
import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Launcher;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  public final static Feeder m_feeder = new Feeder();
  public final static Launcher m_launcher = new Launcher();

  private final Drive m_drivecmd = new Drive(m_feeder);
  private final Stop m_stopcmd = new Stop(m_feeder);
  private final Stop2 m_stopcmd2 = new Stop2(m_launcher);
  private final shoot m_shoot = new shoot(m_launcher);

  private final Joystick m_joystick = new Joystick(0);
  private final JoystickButton j_trigger = new JoystickButton(m_joystick, 1);
  private final JoystickButton j_shootrigger = new JoystickButton(m_joystick, 6);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    j_trigger.whileHeld(m_drivecmd);
    j_trigger.whenReleased(m_stopcmd);

    j_shootrigger.whenPressed(m_shoot);
    j_shootrigger.whenReleased(m_stopcmd2);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 
}
