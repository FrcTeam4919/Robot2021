package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;

public class ShooterUnblock extends Command{
    private boolean isFinished = false;
    public ShooterUnblock(){
    }

    @Override
    protected void execute() {
        Shooter.unblock();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void end() {
        Shooter.blockS();
    }

    public ShooterUnblock Stop() {
        isFinished = true;
        return this;
    }

}