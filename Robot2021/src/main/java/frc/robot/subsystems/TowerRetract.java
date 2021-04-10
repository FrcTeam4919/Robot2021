package frc.robot.subsystems;

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

    public void retract() {
        towerRetractA.set(-1.0);
        towerRetractB.set(-1.0);
    }

    public void stop(){
        towerRetractA.set(0.0);
        towerRetractB.set(0.0);
    }
    
}
