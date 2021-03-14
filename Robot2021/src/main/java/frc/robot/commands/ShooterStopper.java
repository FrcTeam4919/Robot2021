package frc.robot.commands;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Encoder;

public class ShooterStopper {
    private static VictorSP stopper;
    private static Encoder stopperE;

    public ShooterStopper(){
        stopper = new VictorSP(14);
        stopperE = new Encoder(2, 3, true,  Encoder.EncodingType.k4X);
    }

    public static Command block(){
        if (stopperE.getDistance() < 0.25){
            stopper.set(0.1);
        } else {
            stopper.set(0.0);
        }
        return null;
    }

    public static Command unblock(){
        if (stopperE.getDistance() > 0){
            stopper.set(-0.1);
        } else {
            stopper.set(0.0);
        }
        return null;
    }
}
