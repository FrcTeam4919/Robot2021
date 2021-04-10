package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;

public class ShooterUnblock extends Command{
    private boolean isFinished = false;
    private Shooter shooter;
    public ShooterUnblock(){
    }

    @Override
    protected void initialize(){
        shooter = new Shooter();
    }
    @Override
    protected void execute() {
        shooter.unblock();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void end() {
        shooter.blockS();
    }

    public ShooterUnblock Stop() {
        isFinished = true;
        return this;
    }

}