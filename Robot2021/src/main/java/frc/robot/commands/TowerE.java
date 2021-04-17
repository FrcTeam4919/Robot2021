package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;
import frc.robot.Robot;

public class TowerE extends Command {
    private boolean isFinished = false;
    public TowerE(){
        requires(Robot.towers);
    }

    @Override
    protected void initialize() {
        System.out.println("Extending");
    }
    @Override
    protected void execute() {
        Robot.towers.extend();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void end() {
        Robot.towers.stop();
    }
    public TowerE Stop() {
        isFinished = true;
        return this;
    }
}
