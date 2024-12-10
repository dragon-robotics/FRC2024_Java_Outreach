package frc.robot.commands;

import frc.robot.subsystems.RomiDrivetrain;
import frc.robot.subsystems.Shooter;

import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;

public class moveShooterA extends Command {

    public Shooter m_shooter;
    public DoubleSupplier m_speed;

    public void moveShooterB(ShooterSubsystem subsystem, DoubleSupplier speed)
    {
        m_shooter = subsystem;
        m_speed = speed;

    Shooter(Shooter ShooterSubsystem, DoubleSupplier speed) {
        m_speed = speed;
        addRequirements(m_shooter);
    }

    @Override
    public void initialize() {
        m_shooter.Setspeed(0);
    }

    @Override
    public void execute() {
        m_shooter.Setspeed(0.5);
    }

    @Override
    public void end(boolean interrupted) {
        m_shooter.Setspeed(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

}

}