package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Intake;

public class ShooterIntake extends Command{
    private boolean isFinished = false;
    private Intake intake;
    public ShooterIntake(){
    }

    @Override
    protected void initialize(){
        intake = new Intake();
    }
    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void execute() {
        intake.succ();
    }

    @Override
    protected void end() {
        intake.stop();
    }
    public ShooterIntake Stop() {
        isFinished = true;
        return this;
    }
}
