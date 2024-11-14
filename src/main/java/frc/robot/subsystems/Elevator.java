import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Timer;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;


public class Elevator extends SubsystemBase{

   //declaring motors
   private final CANSparkMax motor1 = new CANSparkMax(0, MotorType.kBrushless);
   private final CANSparkMax motor2 = new CANSparkMax(1, MotorType.kBrushless);

   public Elevator(){
      motor1.setIdleMode(IdleMode.kBrake);
      motor2.setIdleMode(IdleMode.kBrake);

      motor2.follow(motor1, true);
   }
   
   public void moveElevator(double speed) {
      motor1.set(speed);
   }
}
