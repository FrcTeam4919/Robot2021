package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;

public class ShooterBlock extends Command{
    private boolean isFinished = false;
    private Shooter shooter;
    public ShooterBlock(){
    }
    @Override
    protected void initialize(){
        shooter = new Shooter();
    }
    @Override
    protected void execute() {
        shooter.block();
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

    public ShooterBlock Stop() {
        isFinished = true;
        return this;
    }
}
