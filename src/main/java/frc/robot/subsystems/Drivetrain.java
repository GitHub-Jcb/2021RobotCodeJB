package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends SubsystemBase
{
    private SpeedControllerGroup right, left;
    private DifferentialDrive drive;

    public Drivetrain(SpeedControllerGroup left, SpeedControllerGroup right, DifferentialDrive drive)
    {
        this.right = right;
        this.left = left;
        this.drive = drive;
    }

    public void takeJoystickInputs(Joystick joy)
    {
        drive.arcadeDrive(joy.getY(), joy.getZ());

    }

    public void moveTankDrive(double leftSpeed, double rightSpeed)
    {
        left.set(leftSpeed);
        right.set(rightSpeed);

    }

    public void stop()
    {
        left.stopMotor();
        right.stopMotor();
    }


}
