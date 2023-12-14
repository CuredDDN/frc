// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;


import frc.robot.OI;
import frc.robot.subsystems.DriveTrainSubSystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj.Timer;

/** An example command that uses an example subsystem. */
public class TankDriveCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  
  private final DriveTrainSubSystem m_subsystem;
  public final int m_time;
  public Timer timer = new Timer();
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public TankDriveCommand(DriveTrainSubSystem subsystem, int time) {
    m_subsystem = subsystem;
    m_time = time;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    timer.start();
    m_subsystem.motorspeed(0.3, 0.3);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //m_subsystem.motorspeed(-OI.driveController.getLeftY(), OI.driveController.getRightY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.motorspeed(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    boolean finished = (timer.get() > m_time);
    return finished;
  }
}
