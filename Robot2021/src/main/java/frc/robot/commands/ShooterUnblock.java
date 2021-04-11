package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;
import frc.robot.Robot;

public class ShooterUnblock extends Command{
    private boolean isFinished = false;
    public ShooterUnblock(){
        requires(Robot.shooter);
    }

    @Override
    protected void initialize(){
        System.out.println("Unblocking");
    }
    @Override
    protected void execute() {
        Robot.shooter.unblock();
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void end() {
        Robot.shooter.blockS();
    }

    public ShooterUnblock Stop() {
        isFinished = true;
        return this;
    }

}