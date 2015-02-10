// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1735.RecycleRush2015.commands;

import org.usfirst.frc1735.RecycleRush2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class  Lifter1ToteSetpointGo extends Command {
    
    public Lifter1ToteSetpointGo() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.lifter);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        
        // We need the setpoint value in a variable rather than the hard-coded construct that RobotBuilder generates.
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        // DO NOT BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=INITIALIZE
        //Robot.lifter.enable();
        //Robot.lifter.setSetpoint(1.0);
        // DO NOT END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=INITIALIZE
    	
    	//Make sure the fingers are engaged before lifting
    	Robot.lifter.fingerEngage();
    	Robot.lifter.lifterMove(1.0);// arg is the desired setpoint.  Activates PID subsystem.
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=ISFINISHED
        return Robot.lifter.onTarget();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=ISFINISHED
    }

    // Called once after isFinished returns true
    protected void end() {
    	// FIXME:  Just for safety, Should we engage the ratchet after completing the operation?
    	// Robot.lifter.ratchetMove(Robot.m_ratchetEngagePosition);
    	// TODO:  Find out if the subsystem is automatically disabled when reaching the setpoint.
    	//        I suspect it is not, and keeps running to maintain the setpoint until disabled.
    	//		  If so, then with the ratchet engaged we can disable the PID subsystem:
    	// Robot.lifter.disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
