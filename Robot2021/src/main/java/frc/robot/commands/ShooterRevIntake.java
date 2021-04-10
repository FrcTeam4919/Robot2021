package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;

public class ShooterRevIntake extends Command{
    private boolean isFinished = false;
    private Intake intake;
    public ShooterRevIntake(){
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
        intake.unsucc();
    }

    @Override
    protected void end() {
        intake.stop();
    }
    public ShooterRevIntake Stop() {
        isFinished = true;
        return this;
    }
}
