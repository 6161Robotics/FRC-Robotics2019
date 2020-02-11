/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team6161.robot.commands;

import frc.team6161.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class SliderSolenoid extends Command {
  public SliderSolenoid() {
    requires(Robot.solenoidBase);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.solenoidBase.sliderOutSole();
    System.out.print("Commencing Special Sauce:");

    for(int i=0; i<875; i++){
      System.out.print(i);
    }
    
    Robot.solenoidBase.sliderInSole();

    /*for(int i=0; i<20000; i++){
      System.out.print(i);
      System.out.print(" lmao, im closed ");
    }*/
  }

  @Override
  protected boolean isFinished() {
    return true;
  }

  @Override
  protected void end() {
    //Robot.solenoidBase.sliderInSole();
  }


  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
