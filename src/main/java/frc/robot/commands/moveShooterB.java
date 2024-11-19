package frc.robot.commands;

import frc.robot.subsystems.RomiDrivetrain;
import frc.robot.subsystems.Shooter;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;

public class moveShooterB extends Command {

    private ShooterSubsystem m_shooter = new Shooter();
    
    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public moveShooterB(Shooter ShooterSubsystem, DoubleSupplier speed, ) {
        m_shooter = shooter;
        addRequirements(shooter);

    }

    @Override
    public void initialize() {
        m_shooter.Setspeed(0);
    }

    @Override
    public void execute() {
        m_shooter.Setspeed(1);
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
