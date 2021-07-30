// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.DriveWithJoystick;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.SteelTalonsController;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Elevator;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DriveWithJoystick;
import edu.wpi.first.wpilibj.Encoder;
import frc.robot.commands.MoveElevator;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private SpeedController leftOne, leftTwo, rightOne, rightTwo;
  private SpeedControllerGroup left, right;
  private DifferentialDrive drive;
  private Drivetrain drivetrain;
  private Joystick joystick;

  private SpeedController elevLeft, elevRight;
  private DigitalInput elevSwitch;
  private Encoder elevEncOne, elevEncTwo;
  private Button elevButtonUp;
  private Button elevButtonDown;
  private Elevator elevator;

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    
    leftOne = new SteelTalonsController(0, false, 1);
    leftTwo = new SteelTalonsController(1, false, 1);
    rightOne = new SteelTalonsController(2, false, 1);
    rightTwo = new SteelTalonsController(3, false, 1);

    left = new SpeedControllerGroup(leftOne, leftTwo);
    right = new SpeedControllerGroup(rightOne, rightTwo);

    drive = new DifferentialDrive(left, right);

    drivetrain = new Drivetrain(left, right, drive);
    drivetrain.setDefaultCommand(new DriveWithJoystick());

    elevLeft = new SteelTalonsController(4, false, 1);
    elevRight = new SteelTalonsController(5, false, 1);
    elevSwitch = new DigitalInput(5);
    elevEncOne = new Encoder(0, 1);
    elevEncTwo = new Encoder(2, 3);
    

    elevator = new Elevator(elevLeft, elevRight, elevSwitch, elevEncOne, elevEncTwo);
    // Configure the button bindings
    configureButtonBindings();

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() 
  {
    joystick = new Joystick(0);
    elevButtonUp = new JoystickButton(joystick, 0);
    elevButtonDown = new JoystickButton(joystick, 1);

    elevButtonUp.whileHeld(new MoveElevator(Constants.ELEVATOR_SPEED_UP));
    elevButtonDown.whileHeld(new MoveElevator(Constants.ELEVATOR_SPEED_DOWN));

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }

  public Drivetrain getDrivetrain()
  {
    return drivetrain;
  }

  public Joystick getJoystick()
  {
    return joystick;
  }

  public Elevator getElevator()
  {
    return elevator;
  }

  public DigitalInput getElevSwitch()
  {
    return elevSwitch;
  }

  public Encoder getElevEncOne()
  {
    return elevEncOne;
  }

  public Encoder getElevEncTwo()
  {
    return elevEncTwo;
  }

}
