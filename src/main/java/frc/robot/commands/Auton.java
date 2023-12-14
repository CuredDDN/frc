package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.DriveTrainSubSystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
public class Auton {
    private static DriveTrainSubSystem m_subsystem;

    public Auton(DriveTrainSubSystem subsystem) {
        m_subsystem = subsystem;
      }
    public static void autoDrive(double left, double right)  {
        m_subsystem.motorspeed(left, right);
    }
}
