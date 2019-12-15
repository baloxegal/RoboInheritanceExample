package main;


import robo.AlphaRobot;
import robo.BetaRobot;
import tests.ChargeTest;
import tests.SimpleTest;


public class Application {

	public static void main(String[] args) {
		System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(new AlphaRobot("Robi_0", "alpha")));
		System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(new BetaRobot("Robo_1", "beta")));
		System.out.printf("Simple test passed %d%%\n", ChargeTest.SimpleChargeTest(new BetaRobot("Robo_2", "beta")));
	}
}
