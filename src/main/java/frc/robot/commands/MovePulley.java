package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class MovePulley extends CommandBase 
{
    double speed;
    public MovePulley(double speed)
    {
        this.speed = speed;
    }    

    @Override
    public void initialize()
    {
        Robot.m_robotContainer.getPulley().MovePulley(speed);
    }

    @Override 
    public void execute()
    {
        Robot.m_robotContainer.getPulley().MovePulley(speed);
    }

    @Override
    public boolean isFinished()
    {
        return false;
    
    }

    @Override
    public void end(boolean interrupted)
    {
        Robot.m_robotContainer.getPulley().StopPulley();
    }
}
