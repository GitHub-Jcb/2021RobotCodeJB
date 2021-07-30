package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;

public class Pulley extends SubsystemBase 
{
    SpeedController pullSC;
    public Pulley(SpeedController pullSC)
    {
        this.pullSC = pullSC;
    }

    public void MovePulley(double speed)
    {
        pullSC.set(speed);
    }

    public void StopPulley()
    {
        pullSC.stopMotor();
    }

    public void ShootAuto(double speed)
    {
        pullSC.set(speed);
        Robot.m_robotContainer.getShooter().MoveShooter(speed);
        Robot.m_robotContainer.getTransport().MoveTransport(speed);
    }

    public void StopShootAuto()
    {
        pullSC.stopMotor();
        Robot.m_robotContainer.getShooter().stopShooter();
        Robot.m_robotContainer.getTransport().StopTransport();
    }
        
}
