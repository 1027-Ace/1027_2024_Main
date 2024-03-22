// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Pneumatics;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class PistonSubsystem extends SubsystemBase {

  private static DoubleSolenoid lowPiston;
  private static DoubleSolenoid midPiston;
  private static DoubleSolenoid highPiston;

  /** Creates a new PistonSubsystem. */
  public PistonSubsystem() {}
   /* 
    lowPiston = RobotContainer.pneumaticsSubsystem.getPneumaticsHub().makeDoubleSolenoid(Claw.clawSolenoidChannels[0], Claw.clawSolenoidChannels[1]);
    midPiston = 
    highPiston =
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    public void enableHighPiston() {

    }

    public void enableMidPiston() {
      
    }

    public void enableLowPiston() {
      
    }
  }
  */
}
