package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;
import frc.robot.Robot;

public class ShooterRevIntake extends Command{
    private boolean isFinished = false;
    public ShooterRevIntake(){
        requires(Robot.intake);
    }
    @Override
    protected void initialize(){
        System.out.println("Reversing Intake");
    }
    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void execute() {
        Robot.intake.unsucc();
    }

    @Override
    protected void end() {
        Robot.intake.stop();
    }
    public ShooterRevIntake Stop() {
        isFinished = true;
        return this;
    }
}
