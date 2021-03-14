package frc.robot.commands;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Command;

public class ShooterIntake {
    private static VictorSP intake;

    public ShooterIntake(){
        intake = new VictorSP(0);
    }

    public static Command succ(){
        intake.set(1.0);
        return null;
    }

    public static Command cease(){
        intake.set(0.0);
        return null;
    }

    public static Command unsucc(){
        intake.set(-1.0);
        return null;
    }
}
