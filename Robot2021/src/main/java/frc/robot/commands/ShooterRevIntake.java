package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;

public class ShooterRevIntake extends Command{
    private boolean isFinished = false;
    public ShooterRevIntake(){
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void execute() {
        Intake.unsucc();
    }

    @Override
    protected void end() {
        Intake.stop();
    }
    public ShooterRevIntake Stop() {
        isFinished = true;
        return this;
    }
}
