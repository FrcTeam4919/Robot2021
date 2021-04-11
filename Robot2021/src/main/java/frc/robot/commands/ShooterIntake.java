package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Intake;
import frc.robot.Robot;

public class ShooterIntake extends Command{
    private boolean isFinished = false;
    public ShooterIntake(){
        requires(Robot.intake);
    }

    @Override
    protected void initialize(){
        System.out.println("Intaking");
    }
    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void execute() {
        Robot.intake.succ();
    }

    @Override
    protected void end() {
        Robot.intake.stop();
    }
    public ShooterIntake Stop() {
        isFinished = true;
        return this;
    }
}
