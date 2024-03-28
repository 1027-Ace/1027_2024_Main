package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Auto_OneNoteMove;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.Timer;

public class ShooterArm extends SubsystemBase{
    //private final TalonSRX motor;
    private final TalonFX motor;
    private final double MAX_SPEED = 0.8; // 100% max speed
    private final double delay = 0.1;

    public ShooterArm(int motorCANId) {
        //this.motor = new TalonSRX(motorCANId);
        this.motor = new TalonFX(motorCANId);
    }

    public void shoot() {
        //motor.set(ControlMode.PercentOutput, MAX_SPEED);
        motor.set(MAX_SPEED);
        //motor.setPosition(3);
        //motor.setControl(0.5);
        // Schedule a task to stop the motor after 0.05 seconds
        Timer.delay(delay);
        //motor.set(ControlMode.PercentOutput, 0); 
        /* 
        Timer.delay(1);
        motor.set(ControlMode.PercentOutput, -MAX_SPEED);
        Timer.delay(delay);
        motor.set(ControlMode.PercentOutput, 0);
        */
        motor.stopMotor(); // Stop te motor
        Timer.delay(0.1);
        motor.set(-MAX_SPEED/6);
        Timer.delay(delay*5);
        motor.stopMotor();
    }

    public Command shootCommand(){
        //return this.runOnce(()-> shoot());
        return new InstantCommand(() -> shoot()) .withTimeout(4);
    }
    public void stopShooter(){
        motor.stopMotor();
    }
}
