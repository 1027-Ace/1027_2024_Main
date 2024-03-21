package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class ShooterPlatform extends SubsystemBase{
    private final TalonSRX motor1;
    private final TalonSRX motor2;
    private final XboxController driver;
    private final double MAX_SPEED = 0.10; // 10% max speed

    public ShooterPlatform(int motor1CANId, int motor2CANId, XboxController driver) {
        this.motor1 = new TalonSRX(motor1CANId);
        this.motor2 = new TalonSRX(motor2CANId);
        this.driver = driver;
    }

    public void moveUp() {
        motor1.set(ControlMode.PercentOutput, MAX_SPEED);
        motor2.set(ControlMode.PercentOutput, MAX_SPEED);
    }

    public void moveDown() {
        motor1.set(ControlMode.PercentOutput, -MAX_SPEED);
        motor2.set(ControlMode.PercentOutput, -MAX_SPEED);
    }

    public void stop() {
        motor1.set(ControlMode.PercentOutput, 0);
        motor2.set(ControlMode.PercentOutput, 0);
    }

    public void controlShooterPlatform() {
        if (driver.getLeftBumperPressed()) { // Example button for moving up
            moveUp();
        } else if (driver.getRightBumperPressed()) { // Example button for moving down
            moveDown();
        } else {
            stop();
        }
    }
}
