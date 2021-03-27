package frc.robot.commands;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;

public class ShooterShoot extends Command {
    private boolean isFinished = false;
    public ShooterShoot(){
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void execute() {
        Shooter.shoot();
    }

    @Override
    protected void end() {
        Shooter.stopS();
    }
    public ShooterShoot Stop() {
        isFinished = true;
        return this;
    }
}
