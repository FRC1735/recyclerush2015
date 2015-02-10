// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1735.RecycleRush2015;
    

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeft;
    public static SpeedController driveTrainRight;
    public static RobotDrive driveTrainRobotDrive21;
    public static SpeedController lifterLifterMotor;
    public static Servo lifterRatchetServo;
    public static Servo lifterFingerServoLeft;
    public static Servo lifterFingerServoRight;
    public static DigitalInput lifterToteReadyIndicator;
    public static Encoder lifterLiftHeightEncoder;
    public static AnalogPotentiometer lifterLiftHeightPot;
    public static DigitalInput lifterFingerLimitSwitchLeft;
    public static DigitalInput lifterFingerLimitSwitchRight;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeft = new Victor(0);
        LiveWindow.addActuator("Drive Train", "Left", (Victor) driveTrainLeft);
        
        driveTrainRight = new Victor(1);
        LiveWindow.addActuator("Drive Train", "Right", (Victor) driveTrainRight);
        
        driveTrainRobotDrive21 = new RobotDrive(driveTrainLeft, driveTrainRight);
        
        driveTrainRobotDrive21.setSafetyEnabled(true);
        driveTrainRobotDrive21.setExpiration(0.1);
        driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);
        driveTrainRobotDrive21.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);        

        lifterLifterMotor = new TalonSRX(2);
        LiveWindow.addActuator("Lifter", "Lifter Motor", (TalonSRX) lifterLifterMotor);
        
        lifterRatchetServo = new Servo(3);
        LiveWindow.addActuator("Lifter", "Ratchet Servo", lifterRatchetServo);
        
        lifterFingerServoLeft = new Servo(5);
        LiveWindow.addActuator("Lifter", "Finger Servo Left", lifterFingerServoLeft);
        
        lifterFingerServoRight = new Servo(4);
        LiveWindow.addActuator("Lifter", "Finger Servo Right", lifterFingerServoRight);
        
        lifterToteReadyIndicator = new DigitalInput(0);
        LiveWindow.addSensor("Lifter", "Tote Ready Indicator", lifterToteReadyIndicator);
        
        lifterLiftHeightEncoder = new Encoder(1, 2, false, EncodingType.k1X);
        LiveWindow.addSensor("Lifter", "Lift Height Encoder", lifterLiftHeightEncoder);
        lifterLiftHeightEncoder.setDistancePerPulse(1.0);
        lifterLiftHeightEncoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
        lifterLiftHeightPot = new AnalogPotentiometer(0, 10.0, 0.0);
        LiveWindow.addSensor("Lifter", "Lift Height Pot", lifterLiftHeightPot);
        
        lifterFingerLimitSwitchLeft = new DigitalInput(3);
        LiveWindow.addSensor("Lifter", "Finger Limit Switch Left", lifterFingerLimitSwitchLeft);
        
        lifterFingerLimitSwitchRight = new DigitalInput(4);
        LiveWindow.addSensor("Lifter", "Finger Limit Switch Right", lifterFingerLimitSwitchRight);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}