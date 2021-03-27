package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TowerRetract extends Subsystem {
    private static PWMSparkMax towerRetractA;
    private static PWMSparkMax towerRetractB;
    
    public TowerRetract(){
        towerRetractA = new PWMSparkMax(11);
        addChild("towerRetractA", towerRetractA);
        towerRetractB = new PWMSparkMax(12);
        addChild("towerRetractB", towerRetractB);
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }

    @Override
    public void periodic() {

    }

    public static void retract() {
        towerRetractA.setSpeed(-1.0);
        towerRetractB.setSpeed(-1.0);
    }

    public static void stop(){
        towerRetractA.setSpeed(0.0);
        towerRetractB.setSpeed(0.0);
    }
    
}
