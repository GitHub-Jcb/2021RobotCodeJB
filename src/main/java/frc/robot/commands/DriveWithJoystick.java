package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class DriveWithJoystick extends CommandBase 
{   

    public DriveWithJoystick()
    {
        addRequirements(Robot.m_robotContainer.getDrivetrain());
    }


    @Override
    public void initialize()
    {
        Robot.m_robotContainer.getDrivetrain().takeJoystickInputs(Robot.m_robotContainer.getJoystick());
    }

    @Override
    public void execute()
    {
        Robot.m_robotContainer.getDrivetrain().takeJoystickInputs(Robot.m_robotContainer.getJoystick());
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }

    @Override
    public void end(boolean interrupted)
    {
        Robot.m_robotContainer.getDrivetrain().stop();
    }
    
}
