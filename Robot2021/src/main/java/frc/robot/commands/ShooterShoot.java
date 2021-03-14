package frc.robot.commands;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Command;

public class ShooterShoot {
    private static VictorSP shoot;

    public ShooterShoot(){
        shoot = new VictorSP(13);
    }

    public static Command shoot(){
        shoot.set(1.0);
        return null;
    }

    public static Command cease(){
        shoot.set(0.0);
        return null;
    }
}
