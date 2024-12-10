package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
public class IntakeSubsystem extends SubsystemBase{


    private final CANSparkMax IntakeMotor = new CANSparkMax(3,MotorType.kBrushless);
    

    public double Setspeed(double speed)
    {
        IntakeMotor.set(ClampSpeed(speed));
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
