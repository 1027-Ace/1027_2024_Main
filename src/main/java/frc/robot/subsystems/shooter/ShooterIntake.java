package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class ShooterIntake extends SubsystemBase{
    private final TalonSRX motor;
    private final XboxController driver;
    private final double MAX_SPEED = 0.10; // 10% max speed

    public ShooterIntake(int motorCANId, XboxController driver) {
        this.motor = new TalonSRX(motorCANId);
        this.driver = driver;
    }

    public void Intake() {
        motor.set(ControlMode.PercentOutput, -MAX_SPEED);
    }

    public void Outtake() {
        motor.set(ControlMode.PercentOutput, MAX_SPEED);
    }

    public void stop() {
        motor.set(ControlMode.PercentOutput, 0);
    }

    public void controlShooterPlatform() {
        if (driver.getLeftBumperPressed()) { // Example button for intake
            Intake();
        } else if (driver.getRightBumperPressed()) { // Example button for outtake
            Outtake();
        } else {
            stop();
        }
    }
}
