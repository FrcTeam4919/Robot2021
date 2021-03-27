package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
    private static VictorSP intake;

    public Intake() {
        intake = new VictorSP(0);
        addChild("intake", intake);
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
    
    @Override
    public void periodic() {

    }

    public static void succ() {
        intake.setSpeed(1.0);
    }

    public static void stop() {
        intake.setSpeed(0.0);
    }

    public static void unsucc() {
        intake.setSpeed(-1.0);
    }
}
