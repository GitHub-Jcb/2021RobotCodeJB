package frc.robot.commands;



import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class MoveIntake extends CommandBase 
{   
    double speed;
    public MoveIntake(double speed)
    {   
        addRequirements(Robot.m_robotContainer.getIntake());
        this.speed = speed;
    }    

    @Override 
    public void initialize()
    {
        Robot.m_robotContainer.getIntake().MoveIntake(speed);
    }

    @Override
    public void execute()
    {
        Robot.m_robotContainer.getIntake().MoveIntake(speed);
    }

    @Override
    public boolean isFinished()
    {
        return true;
    }

    @Override
    public void end(boolean interrupted)
    {
        Robot.m_robotContainer.getIntake().StopIntake();
    }
}
