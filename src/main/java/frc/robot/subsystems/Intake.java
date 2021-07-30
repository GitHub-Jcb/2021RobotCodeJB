package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase 
{
    SpeedController inSC;
    public Intake(SpeedController inSC)
    {
        this.inSC = inSC;
    }

    public void MoveIntake(double speed)
    {
        inSC.set(speed);
    }

    public void StopIntake()
    {
        inSC.stopMotor();
    }


}
