package tests;

import robo.BetaRobot;

public class ChargeTest {
	public static int SimpleChargeTest(BetaRobot robot) {
		int percentage = 0;
		
		robot.setCharge(-100);
		if(robot.getCharge() == -100) {
			System.err.println("Charge value test failed\nREASON: the value of -100 is not allowed!");
			return percentage;
		}
		percentage += 10;
		
		robot.setCharge(1000);
		if(robot.getCharge() == 1000) {
			System.err.println("Charge value test failed\nREASON: the value of 1000 is not allowed!");
			return percentage;
		}
		percentage += 10;
		
		robot.setCharge(50);
		int i = 0;
		for(; i < 1000; i++) {
			if(!robot.moveRight()) {
				break;
			}
		}
		System.out.printf("The robot took %d steps and the charge value is %d%%\n", i, robot.getCharge());
		percentage += 10;
		
		return percentage;
	}
}
