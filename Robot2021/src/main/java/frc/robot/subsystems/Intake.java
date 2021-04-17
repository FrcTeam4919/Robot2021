package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;
//import com.ctre.phoenix.motorcontrol.can.VictorSPX;
//import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;

public class Intake extends Subsystem {
    private static VictorSP intake;

    public Intake() {
        intake = new VictorSP(0);
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
    
    @Override
    public void periodic() {

    }

    public void succ() {
        //intake.set(VictorSPXControlMode.PercentOutput, 1.0);
        intake.setSpeed(1.0);
    }

    public void stop() {
        //intake.set(VictorSPXControlMode.PercentOutput, 0.0);
        intake.setSpeed(0.0);
    }

    public void unsucc() {
        //intake.set(VictorSPXControlMode.PercentOutput, -1.0);
        intake.setSpeed(-1.0);
    }
}
