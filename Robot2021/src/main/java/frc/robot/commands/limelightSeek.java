/*package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;
import frc.robot.*;

public class limelightSeek extends Command {
    double tv = Limelight.table.getEntry("tv").getDouble(0.0);
    double tx = Limelight.table.getEntry("tx").getDouble(0.0);
    double kp = limelightAim.kp;
    double steering_adjust = 0.0;
    double x = OI.joystick.getX();
    double y = OI.joystick.getY();

    protected void initialize(){
        System.out.println("Seeking");
    }
    
    public limelightSeek(){

    }
    
    protected void execute(){
        if (tv == 0.0){
            steering_adjust = 0.3;
        } else {
            double heading_error = tv;
            steering_adjust = kp * tx;
        }
        Drivetrain.westCoastTankDrive.arcadeDrive(x+= steering_adjust, y-= steering_adjust);
    }

    protected boolean isFinished(){
        return false;
    }
}*/