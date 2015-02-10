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

import org.usfirst.frc1735.RecycleRush2015.commands.AutonomousCommand;
import org.usfirst.frc1735.RecycleRush2015.commands.DriveWithLimits;
import org.usfirst.frc1735.RecycleRush2015.commands.Lifter1ToteSetpointGo;
import org.usfirst.frc1735.RecycleRush2015.commands.Lifter2ToteSetpointGo;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterContainerSetpointGo;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterDropOrPickStackSetpointGo;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterDropStack;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterFingerEngage;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterFingerDisengage;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterRatchetMove;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterMove;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick leftJoystick;
    public Joystick rightJoystick;
    public JoystickButton liftto1ToteHeight;
    public JoystickButton liftToDropOrPickHeight;
    public Joystick accessoryJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        accessoryJoystick = new Joystick(2);
        
        liftToDropOrPickHeight = new JoystickButton(accessoryJoystick, 3);
        liftToDropOrPickHeight.whenPressed(new LifterDropOrPickStackSetpointGo());
        liftto1ToteHeight = new JoystickButton(accessoryJoystick, 1);
        liftto1ToteHeight.whenPressed(new Lifter1ToteSetpointGo());
        rightJoystick = new Joystick(1);
        
        leftJoystick = new Joystick(0);
        

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());

        SmartDashboard.putData("Drive With Limits", new DriveWithLimits());

        SmartDashboard.putData("Lifter Move", new LifterMove());

        SmartDashboard.putData("Lifter Ratchet Move", new LifterRatchetMove());

        SmartDashboard.putData("Lifter Finger Engage", new LifterFingerEngage());

        SmartDashboard.putData("Lifter Finger Disengage", new LifterFingerDisengage());

        SmartDashboard.putData("Lifter Drop Or Pick Stack Setpoint Go", new LifterDropOrPickStackSetpointGo());

        SmartDashboard.putData("Lifter Drop Stack", new LifterDropStack());

        SmartDashboard.putData("Lifter 1Tote Setpoint Go", new Lifter1ToteSetpointGo());

        SmartDashboard.putData("Lifter 2Tote Setpoint Go", new Lifter2ToteSetpointGo());

        SmartDashboard.putData("Lifter Container Setpoint Go", new LifterContainerSetpointGo());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }

    public Joystick getAccessoryJoystick() {
        return accessoryJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

