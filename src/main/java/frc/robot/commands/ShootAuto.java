package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ShootAuto extends CommandBase 
{
    double speed;
    public ShootAuto(double speed)
    {
        addRequirements(Robot.m_robotContainer.getPulley());
        this.speed = speed;
    }    

    @Override
    public void initialize()
    {
        Robot.m_robotContainer.getPulley().ShootAuto(speed);
    }

    @Override 
    public void execute()
    {
        Robot.m_robotContainer.getPulley().ShootAuto(speed);
    }

    @Override
    public boolean isFinished()
    {
        return true;
    
    }

    @Override
    public void end(boolean interrupted)
    {
        Robot.m_robotContainer.getPulley().StopShootAuto();
    }
}
