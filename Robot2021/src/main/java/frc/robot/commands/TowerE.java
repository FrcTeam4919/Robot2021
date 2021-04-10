package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;

public class TowerE extends Command {
    private boolean isFinished = false;
    private TowerExtend towerExtend;
    public TowerE(){
    }

    @Override
    protected void initialize() {
        towerExtend = new TowerExtend();
    }
    @Override
    protected void execute() {
        towerExtend.extend();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void end() {
        towerExtend.stop();
    }
    public TowerE Stop() {
        isFinished = true;
        return this;
    }
}
