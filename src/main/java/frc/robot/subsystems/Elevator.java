package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;

public class Elevator extends SubsystemBase {
    
    SpeedController left, right;
    DigitalInput elavSwitch;
    Encoder one, two;

    public Elevator(SpeedController left, SpeedController right, DigitalInput elavSwitch, Encoder one, Encoder two)
    {
        this.left = left;
        this.right = right;
        this.elavSwitch = elavSwitch;
        this.one = one;
        this.two = two;
    }

    public void MoveElevator(double speed)
    {
        left.set(speed);
        right.set(speed);
    }

    public void StopElevator()
    {
        left.stopMotor();
        right.stopMotor();
    }


    
}
