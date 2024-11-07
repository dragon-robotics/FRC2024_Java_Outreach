package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class Intake extends SubsystemBase{


    private final Spark IntakeMotor = new Spark(4);
    

    public double IntakeForward(double speed)
    {
        IntakeMotor.set(ClampSpeed(speed));
        return speed;
    }
    public double IntakeReverse(double speed)
    {
        IntakeForward(-speed);
        return speed; 
    }
    public void stopIntake()
    {
        IntakeMotor.set(0);
    }

    private double ClampSpeed(double speed)
    {
        return Math.max(-1, Math.min(1.0, speed));
    }
    
}
