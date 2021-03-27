package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;

public class Shooter extends Subsystem {
    private static VictorSP shooterBlocker;
    private static Encoder blockerEncoder;
    private static VictorSP shooter;

    public Shooter() {
        shooter = new VictorSP(13);
        shooterBlocker = new VictorSP(14);
        blockerEncoder = new Encoder(2, 3, true, Encoder.EncodingType.k4X);
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }

    @Override
    public void periodic() {

    }

    public static void shoot() {
        shooter.setSpeed(1.0);
    }

    public static void stopS() {
        shooter.setSpeed(0.0);
    }

    public void shootReverse() {
        shooter.setSpeed(-1.0);
    }
    
    public static void block() {
        if (blockerEncoder.getDistance() < 0.25){
            shooterBlocker.setSpeed(0.1);
        } else {
            shooterBlocker.setSpeed(0.0);
        }
    }

    public static void unblock() {
        if (blockerEncoder.getDistance() > 0){
            shooterBlocker.setSpeed(-0.1);
        } else {
            shooterBlocker.setSpeed(0.0);
        }
    }

    public static void blockS() {
        shooterBlocker.setSpeed(0.0);
    }
}
