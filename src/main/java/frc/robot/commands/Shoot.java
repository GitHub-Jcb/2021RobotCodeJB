package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class Shoot extends CommandBase {
    double speed;
    public Shoot(double speed)
    {
        this.speed = speed;
    }

    @Override 
    public void initialize()
    {
        Robot.m_robotContainer.getShooter().MoveShooter(speed);
    }

    @Override
    public void execute()
    {
        Robot.m_robotContainer.getShooter().MoveShooter(speed);
    }

    @Override 
    public boolean isFinished()
    {
        return false;
    }

    @Override
    public void end(boolean interrupted)
    {
        Robot.m_robotContainer.getShooter().stopShooter();
    }


}
