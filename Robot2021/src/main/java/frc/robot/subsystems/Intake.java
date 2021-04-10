package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;

public class Intake extends Subsystem {
    private static VictorSPX intake;

    public Intake() {
        intake = new VictorSPX(0);
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
    
    @Override
    public void periodic() {

    }

    public static void succ() {
        intake.set(VictorSPXControlMode.PercentOutput, 1.0);
    }

    public static void stop() {
        intake.set(VictorSPXControlMode.PercentOutput, 0.0);
    }

    public static void unsucc() {
        intake.set(VictorSPXControlMode.PercentOutput, -1.0);
    }
}
