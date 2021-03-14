package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Limelight{
    public static NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    //Get the x coordinate of the target
    public static NetworkTableEntry tx = table.getEntry("tx");
    //Get the y coordinate of the target
    private static NetworkTableEntry ty = table.getEntry("ty");
    //Area of the target
    private static NetworkTableEntry ta = table.getEntry("ta");
    //does limelight see the target?
    private static NetworkTableEntry tv = table.getEntry("tv");
    
    //read values periodically
    double x = tx.getDouble(0.0);
    double y = ty.getDouble(0.0);
    double area = ta.getDouble(0.0);
    
    //Returns the visibility of the target
    public boolean isTargetVisible(){
        return tv.getBoolean(false);
    }
    public Limelight(){
        /*SmartDashboard.putNumber("LimelightX", x);
        SmartDashboard.putNumber("LimelightY", y);
        SmartDashboard.putNumber("LimelightArea", area);*/
    }

}