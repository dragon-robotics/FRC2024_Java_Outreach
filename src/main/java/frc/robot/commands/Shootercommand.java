// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.RomiDrivetrain;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;

public class Shootercommand extends Command {

    public Shootercommand(Shooter subsystem, BooleanSupplier button){

    }
    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() 
    {
        m_motor1
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
    return false;
    }  
    
}

