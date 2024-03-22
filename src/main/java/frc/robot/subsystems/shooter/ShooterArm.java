package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Timer;

public class ShooterArm extends SubsystemBase{
    private final TalonSRX motor;
    private final double MAX_SPEED = 1; // 100% max speed

    public ShooterArm(int motorCANId) {
        this.motor = new TalonSRX(motorCANId);
    }

    public void shoot() {
        motor.set(ControlMode.PercentOutput, MAX_SPEED);
        
        // Schedule a task to stop the motor after 0.05 seconds
        Timer.delay(0.05);
        
        motor.set(ControlMode.PercentOutput, 0); // Stop the motor
    }
    public void shootreturn() {
        motor.set(ControlMode.PercentOutput, -MAX_SPEED);
        
        // Schedule a task to stop the motor after 0.05 seconds
        Timer.delay(0.05);
        
        motor.set(ControlMode.PercentOutput, 0); // Stop the motor
    }
}
