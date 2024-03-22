package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class ShooterIntake extends SubsystemBase{
    private final TalonSRX motor;
    private final double MAX_SPEED = 0.7; // 10% max speed

    public ShooterIntake(int motorCANId) {
        this.motor = new TalonSRX(motorCANId);
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
}
