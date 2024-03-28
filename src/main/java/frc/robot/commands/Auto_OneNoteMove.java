package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.RobotContainer;

public class Auto_OneNoteMove extends SequentialCommandGroup {
    public Auto_OneNoteMove(DriveToPoseCommand movement){
        addCommands(
            new InstantCommand(() -> RobotContainer.shooter.shoot()),
            
            //Commands.runOnce(() -> RobotContainer.autoMoveCommand, RobotContainer.s_Swerve)
            movement
        );
    }
}
