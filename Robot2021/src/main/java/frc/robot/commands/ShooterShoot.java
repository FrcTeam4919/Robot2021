package frc.robot.commands;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ShooterShoot extends Command {
    private boolean isFinished = false;
    public ShooterShoot(){
        requires(Robot.shooter);
    }
    @Override
    protected void initialize(){
        System.out.println("Shooting");
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void execute() {
        Robot.shooter.shoot();
    }

    @Override
    protected void end() {
        Robot.shooter.stopS();
    }
    public ShooterShoot Stop() {
        isFinished = true;
        return this;
    }
}
