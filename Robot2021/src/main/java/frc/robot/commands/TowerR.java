package frc.robot.commands;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TowerR extends Command{
    private boolean isFinished = false;
    public TowerR(){
        requires(Robot.towerRetract);
    }

    @Override
    protected void initialize(){
        System.out.println("Retracting");
    }

    @Override
    protected void execute() {
        Robot.towerRetract.retract();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void end() {
        Robot.towerRetract.stop();
    }
    public TowerR Stop() {
        isFinished=true;
        return this;
    }
}
