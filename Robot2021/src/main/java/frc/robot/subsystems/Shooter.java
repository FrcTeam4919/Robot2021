package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class Shooter extends Subsystem {
    public static VictorSPX shooterBlocker;
    private static Encoder blockerEncoder;
    private static VictorSPX shooter;

    public Shooter() {
        shooter = new VictorSPX(13);
        shooterBlocker = new VictorSPX(14);
        blockerEncoder = new Encoder(2, 3, true, Encoder.EncodingType.k4X);
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }

    @Override
    public void periodic() {

    }

    public void shoot() {
        shooter.set(VictorSPXControlMode.PercentOutput, 0.25);
    }

    public void stopS() {
        shooter.set(VictorSPXControlMode.PercentOutput, 0.0);
    }

    public void shootReverse() {
        shooter.set(VictorSPXControlMode.PercentOutput, -0.25);
    }
    
    public void block() {
        //if (blockerEncoder.getDistance() < 0.25){
            shooterBlocker.set(VictorSPXControlMode.PercentOutput, 0.1);
        //} else {
            //shooterBlocker.set(VictorSPXControlMode.PercentOutput, 0.0);
        //}
    }

    public void unblock() {
        //if (blockerEncoder.getDistance() > 0){
            shooterBlocker.set(VictorSPXControlMode.PercentOutput, -0.1);
        //} else {
            //shooterBlocker.set(VictorSPXControlMode.PercentOutput, 0.0);
        //}
    }

    public void blockS() {
        shooterBlocker.set(VictorSPXControlMode.PercentOutput, 0.0);
    }
}
