// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1735.RecycleRush2015.subsystems;

import org.usfirst.frc1735.RecycleRush2015.RobotMap;
import org.usfirst.frc1735.RecycleRush2015.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class CollectorDeployer extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController deployMotor = RobotMap.collectorDeployerDeployMotor;
    DigitalInput limitDown = RobotMap.collectorDeployerLimitDown;
    DigitalInput limitUp = RobotMap.collectorDeployerLimitUp;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void deployMove(double magnitudeDirection) {
    	//if we are currently at a limit, don't do anything...
    	if (((magnitudeDirection > 0) && reachedUpLimit()) ||
    		((magnitudeDirection < 0) && reachedDownLimit())) return;
    	deployMotor.set(magnitudeDirection);
    }
    
    public boolean reachedUpLimit() {
    	// Digital IO reads a '1'/true when nothing is connected.
    	// If the switch gets ripped out, we want to continue operations, so we want "ok to move" to be ==1
    	// Therefore 'hit limit' should be ==0 (meaning return the opposite of what we read)
    	// Assumes switch wiring is momentary contact = grounded
    	return (!RobotMap.collectorDeployerLimitUp.get());
    }

    public boolean reachedDownLimit() {
    	// Digital IO reads a '1'/true when nothing is connected.
    	// If the switch gets ripped out, we want to continue operations, so we want "ok to move" to be ==1
    	// Therefore 'hit limit' should be ==0 (meaning return the opposite of what we read)
    	// Assumes switch wiring is momentary contact = grounded
    	return (!RobotMap.collectorDeployerLimitDown.get());
    }
    
    public void stop() {
    	deployMotor.set(0);
    }
    
}

