package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TowerExtend extends Subsystem {
    private static PWMSparkMax towerExtendA;
    private static PWMSparkMax towerExtendB;

    public TowerExtend() {
        towerExtendA = new PWMSparkMax(9);
        addChild("TowerA", towerExtendA);
        towerExtendB = new PWMSparkMax(10);
        addChild("TowerB", towerExtendB);
    }
    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
    @Override
    public void periodic() {

    }

    public void extend() {
        towerExtendA.setSpeed(1.0);
        towerExtendB.setSpeed(1.0);
    }

    public void stop() {
        towerExtendA.set(0.0);
        towerExtendB.set(0.0);
    }
    
}
