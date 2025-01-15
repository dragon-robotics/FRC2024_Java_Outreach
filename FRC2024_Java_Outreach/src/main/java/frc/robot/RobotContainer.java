// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.Drivecommand;
import frc.robot.subsystems.RomiDrivetrain;

import java.lang.invoke.ConstantBootstraps;
import java.sql.Driver;

import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants;
import frc.robot.commands.Auto;

public class RobotContainer {

  // The robot's subsystems and commands are defined here...
  public static final CommandJoystick m_driverController = new CommandJoystick(1); // Assumes port 0

  private final RomiDrivetrain m_romiDrivetrain = new RomiDrivetrain();
  private final Auto AutoCommand = new Auto();
  static final double max_speed = 0.5;
  static final double max_turn_speed = 0.5;
  // JoystickButton exampleButton = new JoystickButton(m_driverController, );

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    m_romiDrivetrain.setDefaultCommand(
        new Drivecommand(
          () -> Constants.m_driverController.getRawAxis(3) - Constants.m_driverController.getRawAxis(2),
          // Rotation: Left stick X-axis (axis 
          () -> Constants.m_driverController.getRawAxis(0)
      )

        )
    );
          
          }

  // autonomous code down here

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return AutoCommand;
  }
  


}

