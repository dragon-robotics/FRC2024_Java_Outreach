package frc.robot.commands;

import frc.robot.subsystems.RomiDrivetrain;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;

import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommand extends Command {

    private final IntakeSubsystem m_intake;


    public IntakeCommand(IntakeSubsystem intake, DoubleSupplier speed)
    {
        m_intake = intake;
        addRequirements(intake);
    }

    @Override
    public void initialize() {
        m_intake.Setspeed(0);
    }

    @Override
    public void execute() 
    {
        m_intake.Setspeed(0.5);
    }

    @Override
    public void end(boolean interrupted) {
        m_intake.Setspeed(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }  

}
