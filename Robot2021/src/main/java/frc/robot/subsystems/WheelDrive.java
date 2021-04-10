package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.controller.PIDController;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

//import edu.wpi.first.wpilibj.controller.PIDController;

public class WheelDrive {
    private VictorSPX angleMotor;
    private VictorSPX speedMotor;
    private PIDController pidController;
    // max voltage the swerve modules take
    private final double MAX_VOLTS = 12.0;

    public WheelDrive(int angleMotor, int speedMotor, int encoder) {
        this.angleMotor = new VictorSPX(angleMotor);
        this.speedMotor = new VictorSPX(speedMotor);
        //pidController = new PIDController(1, 0, 0, new AnalogInput(encoder), (PIDOutput) this.angleMotor);
        pidController = new PIDController (1.0, 0.0, 0.0);
        //pidController.setInputRange(-180, 180);
        //pidController.setOutputRange(-1, 1);
        //pidController.setContinuous();
        //pidController.enable();
    }

    public void drive(double speed, double angle){
        speedMotor.set(VictorSPXControlMode.PercentOutput, speed);

        double setpoint = angle * (MAX_VOLTS * 0.5) + (MAX_VOLTS * 0.5);
        if (setpoint < 0) {
            setpoint = MAX_VOLTS + setpoint;
        } else if (setpoint > MAX_VOLTS){
            setpoint = setpoint - MAX_VOLTS;
        }
        pidController.setSetpoint(setpoint);
    }
}