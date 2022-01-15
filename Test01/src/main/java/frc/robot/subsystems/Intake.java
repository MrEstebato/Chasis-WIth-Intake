package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.motorcontrol.Talon;   


public class Intake extends SubsystemBase{
    
    DoubleSolenoid solenoids;
    Talon intakeMotor;

    //constructor
    public Intake (){
        
        solenoids = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 2, 3);

        intakeMotor = new Talon(RobotMap.IntakeMotorPort);
    }


    //getters
    public Talon getIntakeMotor()
    {
        return intakeMotor;
    }

    public DoubleSolenoid getSolenoids()
    {
        return solenoids;
    }

    //actions
    public void intakeRetractSolenoid(){
        solenoids.set(RobotMap.IntakeRaisedSolenoid);
    }

    public void intakeExtendSolenoid(){
        solenoids.set(RobotMap.IntakeLoweredSolenoid);
    }

    public void IntakeForward(){
        intakeMotor.set(RobotMap.IntakeMotorForwardSpeed);
    }

    public void IntakeReverse(){
        intakeMotor.set(RobotMap.IntakeMotorReverseSpeed);
    }

    public void IntakeOff(){
        intakeMotor.set(RobotMap.IntakeMotorOff);
    }

}

