package frc.robot.commands;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.Constants.Swerve;
import frc.robot.subsystems.shooter.ShooterArm;
import frc.robot.subsystems.swerve.SwerveBase;

public class Auto_TwoNote extends SequentialCommandGroup {
    private boolean AllianceColor = false;

    public Auto_TwoNote(SwerveBase swerve){
        addCommands(
            new ShooterArm(39).shootCommand(),
            new WaitCommand(1),
            
            new DriveToPoseCommand(
                swerve, 
                swerve::getPose, 
                new Pose2d(-2, 0, Rotation2d.fromDegrees(180)), 
                AllianceColor)
            
            /*
            new InstantCommand(() -> RobotContainer.intakeobj.Intake()),
            new DriveToPoseCommand(
                swerve, 
                swerve::getPose, 
                new Pose2d(2.5,0,Rotation2d.fromDegrees(0)), 
                AllianceColor),
            new InstantCommand(() -> RobotContainer.intakeobj.stop()),
            new DriveToPoseCommand(
                swerve, 
                swerve::getPose, 
                new Pose2d(0, 0, Rotation2d.fromDegrees(0)), 
                AllianceColor)
            */
            //Commands.runOnce(() -> RobotContainer.autoMoveCommand, RobotContainer.s_Swerve)
            //movement
        );
    }
}
