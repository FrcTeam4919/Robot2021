/*package frc.robot.commands;

import frc.robot.subsystems.*;
import frc.robot.subsystems.WheelDrive;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;

public class limelightAim extends Command {
    static double kp = -0.1f;
    double min_command = 0.05f;
    double tx = Limelight.tx.getDouble(0.0);
    double y = OI.joystick.getY();
    double x = OI.joystick.getX();

    public limelightAim() {
        
    }
    protected void initialize(){
        System.out.println("Aiming");
    }

    protected void execute(){
        double heading_error = -tx;
        double steering_adjust = 0.0f;
        if(tx > 1.0){
            steering_adjust = kp*heading_error - min_command;
        } else if(tx < 1.0){
            steering_adjust = kp*heading_error + min_command;
        }
        WheelDrive.WheelDrive.Drive(y+=steering_adjust, x+=steering_adjust));
    }

    protected boolean isFinished(){
        return false;
    }
}*/