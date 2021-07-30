package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class MoveTransport extends CommandBase 
{

    double speed;
    public MoveTransport(double speed)
    {
        this.speed = speed;
    }    

    @Override
    public void initialize()
    {
        Robot.m_robotContainer.getTransport().MoveTransport(speed);
    }

    @Override
    public void execute()
    {
        Robot.m_robotContainer.getTransport().MoveTransport(speed);
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }

    @Override
    public void end(boolean interrupted)
    {
        Robot.m_robotContainer.getTransport().StopTransport();
    }
}
