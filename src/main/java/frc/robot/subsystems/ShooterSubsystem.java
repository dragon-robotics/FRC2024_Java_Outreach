package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
    private final CANSparkMax m_motorA = new CANSparkMax(0, MotorType.kBrushless); // Receiving ball
    private final CANSparkMax m_motorB = new CANSparkMax(1, MotorType.kBrushless); // Shooting ball

    // Constructor to initialize subsystem, if needed
    m_motorA.restoreFactoryDefaults();
    m_motorB.restoreFactoryDefaults();

    m_motorA.setIdleMode(CANSparkMax.IdleMode.kBrake);
    m_motorB.setIdleMode(CANSparkMax.IdleMode.kBrake);
    }

    // First motor spin
    public void spinMotor1(double speed) {
        m_motorA.set(speed); // Set motor 1 speed
    }

    // Second motor spin
    public void spinMotor2(double speed) {
        m_motorB.set(speed); // Set motor 2 speed
    }

    // Method to stop both motors
    public void stopMotors() {
        m_motorA.set(0); // Stop motor 1
        m_motorB.set(0); // Stop motor 2
    }

    public void Setspeed(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Setspeed'");
    }
