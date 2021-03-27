package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;

public class TowerE extends Command {
    private boolean isFinished = false;
    public TowerE(){
    }

    @Override
    protected void initialize() {

    }
    @Override
    protected void execute() {
        TowerExtend.extend();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void end() {
        TowerExtend.stop();
    }
    public TowerE Stop() {
        isFinished = true;
        return this;
    }
}
