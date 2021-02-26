// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LED extends SubsystemBase {
  /** Creates a new LED. */
  private final AddressableLED m_LED = new AddressableLED(Constants.LED_PORT);
  private final AddressableLEDBuffer m_ledb = new AddressableLEDBuffer(Constants.LED_LENGTH);
  private int m_rainbowFirstpixel_hue = 0;
  public LED() {
    m_LED.setLength(m_ledb.getLength());
    m_LED.setData(m_ledb);
    m_LED.start();

  }

  public void Rainbow(){
    for(var i = 0; i < m_ledb.getLength(); i++){
      final var hue = (m_rainbowFirstpixel_hue+(i*180/m_ledb.getLength()))%180;
      m_ledb.setHSV(i, hue, Constants.HSV_SATURATION, Constants.HSV_VALUE);
    }
    m_rainbowFirstpixel_hue += 5;
    m_rainbowFirstpixel_hue %= 180;
    m_LED.setData(m_ledb);
  }

  public void Speed(double controller_y){
    double color = controller_y*255;
    if((int)color >= 0){
      for(var i = 0; i < m_ledb.getLength(); i++){
        m_ledb.setHSV(i, 0, (int)color, Constants.HSV_VALUE);
      }
      m_LED.setData(m_ledb);

    } else {
      for(var i = 0; i < m_ledb.getLength(); i++){
        m_ledb.setHSV(i, 120, (int) -color, Constants.HSV_VALUE);
      }
      m_LED.setData(m_ledb);

    }
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
