package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

//import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Towers extends Subsystem {
    private static CANSparkMax towerL1;
    private static CANSparkMax towerL2;
    private static CANSparkMax towerR1;
    private static CANSparkMax towerR2;

    public Towers() {
        towerL1 = new CANSparkMax(9, MotorType.kBrushed);
        towerL2 = new CANSparkMax(10, MotorType.kBrushed);
        towerR1 = new CANSparkMax(11, MotorType.kBrushed);
        towerR2 = new CANSparkMax(12, MotorType.kBrushed);

    }
    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
    @Override
    public void periodic() {

    }

    public void extend() {
        System.out.println("Set Speed to -0.25");
        towerL1.set(-1.00);
        towerL2.set(-1.00);
        towerR1.set(-1.00);
        towerR2.set(-1.00);
    }

    public void stop() {
        System.out.println("Set Speed to 0.0");
        towerL1.set(0.0);
        towerL2.set(0.0);
        towerR1.set(0.0);
        towerR2.set(0.0);
    }

    public void retract() {
        System.out.println("Set Speed to 0.25");
        towerL1.set(1.00);
        towerL2.set(1.00);
        towerR1.set(1.00);
        towerR2.set(1.00);
    }
    
}
