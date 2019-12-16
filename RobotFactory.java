package robo;

public class RobotFactory {
	public static AbstractRobot getRobot(String model, String name) {
		AbstractRobot robot = null;
		if(model == "alpha") {
			robot = new AlphaRobot(model, name);
		}
		else if(model == "beta") {
			robot = new BetaRobot(model, name);
		}
		else if(model == "charlie") {
			robot = new CharlieRobot(model, name);
		}	
		return robot;
	}
}
