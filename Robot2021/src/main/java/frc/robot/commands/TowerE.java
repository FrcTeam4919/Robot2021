package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;
import frc.robot.Robot;

public class TowerE extends Command {
    private boolean isFinished = false;
    public TowerE(){
        requires(Robot.towerExtend);
    }

    @Override
    protected void initialize() {
        System.out.println("Extending");
    }
    @Override
    protected void execute() {
        Robot.towerExtend.extend();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void end() {
        Robot.towerExtend.stop();
    }
    public TowerE Stop() {
        isFinished = true;
        return this;
    }
}
