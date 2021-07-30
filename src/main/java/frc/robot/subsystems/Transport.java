package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class Transport extends SubsystemBase 
{
    SpeedController traSC;
    public Transport(SpeedController traSC)
    {
        this.traSC= this.traSC;
    }

    public void MoveTransport(double speed)
    {
        traSC.set(speed);
    }

    public void StopTransport()
    {
        traSC.stopMotor();
    }

}
