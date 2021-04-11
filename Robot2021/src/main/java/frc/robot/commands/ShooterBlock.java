package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;
import frc.robot.Robot;

public class ShooterBlock extends Command{
    private boolean isFinished = false;
    public ShooterBlock(){
        requires(Robot.shooter);
    }
    @Override
    protected void initialize(){
        System.out.println("Blocking");
    }
    @Override
    protected void execute() {
        Robot.shooter.block();
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

    public ShooterBlock Stop() {
        isFinished = true;
        return this;
    }
}
