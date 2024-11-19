// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.RomiDrivetrain;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import static frc.robot.Constants.*;

//.** An example command that uses an example subsystem. */
public class Drivecommand extends Command {
  private final RomiDrivetrain m_subsystem;

  public DoubleSupplier m_speed;
  public DoubleSupplier m_rotation;
  static CommandJoystick m_driver_controller;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public Drivecommand(RomiDrivetrain subsystem, DoubleSupplier speed, DoubleSupplier rotation) {
    m_subsystem = subsystem;
    m_speed = speed;
    m_rotation = rotation;

    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  @Override
  public void execute() {

    m_subsystem.arcadeDrive(m_speed.getAsDouble(), m_rotation.getAsDouble());

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
