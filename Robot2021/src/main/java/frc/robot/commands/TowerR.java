package frc.robot.commands;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;

public class TowerR extends Command{
    private boolean isFinished = false;
    public TowerR(){
    }

    @Override
    protected void execute() {
        TowerRetract.retract();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void end() {
        TowerRetract.stop();
    }
    public TowerR Stop() {
        isFinished=true;
        return this;
    }
}
