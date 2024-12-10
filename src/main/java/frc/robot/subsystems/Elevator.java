package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Elevator extends SubsystemBase {

   // Declaring motors
   private final CANSparkMax motor1 = new CANSparkMax(1, MotorType.kBrushless);
   private final CANSparkMax motor2 = new CANSparkMax(2, MotorType.kBrushless);

   // Default motor settings
   public Elevator() {
      motor1.setIdleMode(IdleMode.kBrake);
      motor2.setIdleMode(IdleMode.kBrake);

      // Makes motor2 do the same thing as motor1
      motor2.follow(motor1, true);
   }

   // Motor movement
   public void moveElevator(double speed) {
      motor1.set(speed);
   }
}
