package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    
    SpeedController left, right;
    double speed;
    public Shooter(SpeedController left, SpeedController right)
    {
        this.left = left;
        this.right = right;
    }

    public void MoveShooter(double speed)
    {
        left.set(speed);
        right.set(speed);
    }

    public void stopShooter()
    {
        left.stopMotor();
        right.stopMotor();
    }

}
