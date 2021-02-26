package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Launcher extends SubsystemBase {
  private final WPI_VictorSPX upperLauncher = new WPI_VictorSPX(11);
  private final WPI_VictorSPX lowerLauncher = new WPI_VictorSPX(12);
  
  /** Creates a new Launcher. */
  public Launcher() {
    upperLauncher.configOpenloopRamp(Constants.LAUNCHER_RAMP);
    lowerLauncher.configOpenloopRamp(Constants.LAUNCHER_RAMP);
  }

  public void Launch(){
    upperLauncher.set(ControlMode.PercentOutput, Constants.LAUNCHER_UPPER_SPEED);
    lowerLauncher.set(ControlMode.PercentOutput, Constants.LAUNCHER_LOWER_SPEED);
  }

  public void Stop(){
    upperLauncher.set(ControlMode.PercentOutput, 0);
    lowerLauncher.set(ControlMode.PercentOutput, 0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
