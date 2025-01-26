/*
 * Copyright (c) 2025 Newport Robotics Group. All Rights Reserved.
 *
 * Open Source Software; you can modify and/or share it under the terms of
 * the license file in the root directory of this project.
 */
 
package frc.robot.parameters;

public enum ElevatorLevel {
  STOWED(0, 0), // TO-DO: Determine correct values for height and pivot angles (coral scoring)
  L1(1, 0),
  L2(2, 0),
  L3(3, 0),
  L4(4, 0),

  A2(1.5, 0), //TO-DO: Determine correct values for height and pivot angles (algae removal)
  A3(2.5, 0);

  private final double height;
  private final double pivotAngle;

  /**
   * Constructs a variant of this enum.
   *
   * @param height The desired height in meters.
   * @param pivotAngle The desired pivot angle in radians.
   */
  private ElevatorLevel(double height, double pivotAngle) {
    this.height = height;
    this.pivotAngle = pivotAngle;
  }

  /** Returns the desired height in meters. */
  public double getHeight() {
    return height;
  }

  /** Returns the desired pivot angle in radians. */
  public double getPivotAngle() {
    return pivotAngle;
  }
}
