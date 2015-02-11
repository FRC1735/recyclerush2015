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
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LifterActiveMode extends CommandGroup {
    
    public  LifterActiveMode() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	//TODO: fix to handle multiple button presses asking for the LifterActive command.
    	// Normally a button press starts a command.  any previously running command using the same
    	// subsystem gets interrupted/aborted.
    	// In this case, since the command is long-running, the operator could press the button a second (or multiple)
    	// times and cause the previously executing command loop to be aborted.  This would cause the lifter
    	// to be re-activated to move to the position it's already at, which could churn the system and cause
    	// the ratchet/pawl system to engage/disengage unnecessarily.
    	// 
    	// For this command, we do want it to be interrupted if the operator needs to override the system to do
    	// something else... but we don't want two copies of this particular command running.
    	// I think the answer is to look at the command queue to determine if a command of the same type is running,
    	// and if it is... abort this instance (or have it exit without doing anything)
    	
    	// The idea is to drive around with the "tote in place" sensor active.
    	// Wait until that sensor fires, and then drop the lifter to grab the tote on the fly...
    	// Start by getting the lifter into place to grab a single tote:
    	addSequential(new Lifter1ToteSetpointGo());
    	
    	// Next, start polling the banner sensor until it fires
    	// FIXME:  There must be a way to do this with interrupts...??
    	addSequential(new WaitForToteSensor());
    	
    	// if we get this far, we have found a tote.  Drop around it...
    	addSequential(new LifterDropOrPickStackSetpointGo());
    	
    	// ... and pick it up
    	addSequential(new Lifter1ToteSetpointGo());
    	
    	// At the end of this state, we are holding a tote and are in position to go do the sequence again
    	// Right now, force the operator to manually trigger the 'wait' state again...
    	// ... Although it might be possible for a commandGroup to reset and start over.  Hmmm.
    	// TODO:  Investigate if CommandGroups can reset and start over without having to terminate and re-invoke.
    }
}
