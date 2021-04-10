package frc.robot.commands;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;

public class TowerR extends Command{
    private boolean isFinished = false;
    private TowerRetract towerRetract;
    public TowerR(){
    }

    @Override
    protected void initialize(){
        towerRetract = new TowerRetract();
    }

    @Override
    protected void execute() {
        towerRetract.retract();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void end() {
        towerRetract.stop();
    }
    public TowerR Stop() {
        isFinished=true;
        return this;
    }
}
