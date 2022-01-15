package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;



public class RobotMap {
    
    public static final int IntakeMotorPort = 0;
    public static final double IntakeMotorForwardSpeed = 1;
    public static final double IntakeMotorReverseSpeed = -1;
    public static final double IntakeMotorOff = 0;

    public static final DoubleSolenoid.Value IntakeLoweredSolenoid = DoubleSolenoid.Value.kReverse;
    public static final DoubleSolenoid.Value IntakeRaisedSolenoid = DoubleSolenoid.Value.kForward;
    
}
