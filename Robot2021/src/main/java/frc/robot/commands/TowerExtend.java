package frc.robot.commands;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.command.Command;

public class TowerExtend {

    private static PWMSparkMax towerExtendA;
    private static PWMSparkMax towerExtendB;

    public TowerExtend(){
        towerExtendA = new PWMSparkMax(9);
        towerExtendB = new PWMSparkMax(10);
    }

    public static Command Extend() {
        towerExtendA.set(1.0);
        towerExtendB.set(1.0);
        return null;
    }

    public static Command Cease() {
        towerExtendA.set(0.0);
        towerExtendB.set(0.0);
        return null;
    }
}
