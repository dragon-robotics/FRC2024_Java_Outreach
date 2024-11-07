 package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final Spark m_motor1 = new Spark(0); // Receiving ball
    private final Spark m_motor2 = new Spark(1); // Shooting ball
    
    public Shooter() {
        // Constructor to initialize subsystem, if needed
    }

    // First motor spin
    public void spinMotor1(double speed) {
        m_motor1.set(speed); // Set motor 1 speed
    }

    // Second motor spin
    public void spinMotor2(double speed) {
        m_motor2.set(speed);  // Set motor 2 speed
    }

    // Method to stop both motors
    public void stopMotors() {
        m_motor1.set(0);  // Stop motor 1
        m_motor2.set(0);  // Stop motor 2
    }
}
