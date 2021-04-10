package frc.robot.commands;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;

public class ShooterShoot extends Command {
    private boolean isFinished = false;
    private Shooter shooter;
    public ShooterShoot(){
    }
    @Override
    protected void initialize(){
        shooter = new Shooter();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void execute() {
        shooter.shoot();
    }

    @Override
    protected void end() {
        shooter.stopS();
    }
    public ShooterShoot Stop() {
        isFinished = true;
        return this;
    }
}
