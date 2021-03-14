package frc.robot.commands;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.command.Command;

public class TowerRetract {

    private static PWMSparkMax towerRetractA;
    private static PWMSparkMax towerRetractB;

    public TowerRetract(){
        towerRetractA = new PWMSparkMax(11);
        towerRetractB = new PWMSparkMax(12);
    }

    public static Command Retract(){
        towerRetractA.set(1.0);
        towerRetractB.set(1.0);
        return null;
    }

    public static Command Cease(){
        towerRetractA.set(0.0);
        towerRetractB.set(0.0);
        return null;
    }
}
