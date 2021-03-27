package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;

public class ShooterBlock extends Command{
    private boolean isFinished = false;
    public ShooterBlock(){
    }

    @Override
    protected void execute() {
        Shooter.block();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished();
    }

    @Override
    protected void end() {
        Shooter.blockS();
    }

    public ShooterBlock Stop() {
        isFinished = true;
        return this;
    }
}
