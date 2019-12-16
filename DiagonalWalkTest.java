package tests;

import robo.CharlieRobot;

public class DiagonalWalkTest {
	public static int SimpleDiagonalWalkTest(CharlieRobot robot) {
		
		int percentage = 0;
		
		if(robot.moveUpRight()) {
			System.err.println("Move test failed\nREASON: moveUpRight() out of bounds!");
			return percentage;
		}
		percentage += 25;
		
		robot.setY(100);
		if(robot.moveUpLeft()) {
			System.err.println("Move test failed\nREASON: moveUpLeft() out of bounds!");
			return percentage;
		}
		percentage += 25;
		
		robot.setX(25);
		robot.setY(100);
		if(robot.moveDownRight()) {
			System.err.println("Move test failed\nREASON: moveDownRight() out of bounds!");
			return percentage;
		}
		percentage += 25;
		
		robot.setX(0);
		robot.setY(50);
		if(robot.moveDownLeft()) {
			System.err.println("Move test failed\nREASON: moveDownLeft() out of bounds!");
			return percentage;
		}
		percentage += 25;
		
		return percentage;
	}

}
