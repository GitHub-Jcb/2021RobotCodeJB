package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.DigitalInput;

public class MoveElevator extends CommandBase{
    public double speed;

    public MoveElevator(double speed)
    {
        this.speed = speed;
    }


    @Override
    public void initialize()
    {
        Robot.m_robotContainer.getElevator().MoveElevator(speed);
    }   

    @Override
    public void execute()
    {
        Robot.m_robotContainer.getElevator().MoveElevator(speed);
    }

    @Override 
    public boolean isFinished()
    {   
        if(speed < 0 && Robot.m_robotContainer.getElevSwitch().get())
        {
        return true;
        } 
        if(speed > 0 && Robot.m_robotContainer.getElevEncOne().getDistance() > Constants.ELEVATOR_ENC_ONE_LIMIT && Robot.m_robotContainer.getElevEncTwo().getDistance() > Constants.ELEVATOR_ENC_TWO_LIMIT)
        {
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void end(boolean interrupted)
    {
        Robot.m_robotContainer.getElevator().StopElevator();
    }

    
    
    
}