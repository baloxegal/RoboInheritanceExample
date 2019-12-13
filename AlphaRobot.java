package robo;

//import java.util.Scanner;

public class AlphaRobot extends AbstractRobot {
	private String name;
	private String model;
	private int x;
	private int y;
	
	public AlphaRobot() {
		name = null;
		model = null;
		x = 0;
		y = 0;
	}
	
	public AlphaRobot(String name, String model) {
		//super();
		this.name = name;
		this.model = model;
		x = 0;
		y = 0;
	}
	//@Override
	public void setName(String name) {
		if(name == null) {
			//System.err.println("ERROR!!! Insert name!");
			//Scanner in = new Scanner(System.in);
			//this.name = in.next();
			return;
		}
		this.name = name;
	}
	//@Override
	public String getName() {
		return name;
	}
	@Override
	public void setModel(String model) {
		if(model == null) {
			//System.err.println("ERROR!!! Insert model!");
			//Scanner in = new Scanner(System.in);
			//this.model = in.next();
			return;
		}
		this.model = model;
	}
	@Override
	public String getModel() {
		return model;
	}
	@Override
	public void setX(int x) {
		if(x < 0 || x > 100) {
			//System.err.println("ERROR!!! Insert the coordinates from the range 0 ... 100!");
			//Scanner in = new Scanner(System.in);
			//this.x = in.nextInt();
			return;
		}
		this.x = x;
	}
	@Override
	public int getX() {
		return x;
	}
	@Override
	public void setY(int y) {
		if(y < 0 || y > 100) {
			//System.err.println("ERROR!!! Insert the coordinates from the range 0 ... 100!");
			//Scanner in = new Scanner(System.in);
			//this.y = in.nextInt();
			return;
		}
		this.y = y;
	}
	@Override
	public int getY() {
		return y;
	}
	@Override
	public boolean moveRight() {
		if(x + 1 > 100) {
			//System.err.println("ERROR!!! Coordinates is out of the range 0 ... 100!");
			return false;
		}
		x++;
		return true;
	}
	@Override
	public boolean moveLeft() {
		if(x - 1 < 0) {
			//System.err.println("ERROR!!! Coordinates is out of the range 0 ... 100!");
			return false;
		}
		x--;
		return true;
	}
	@Override
	public boolean moveDown() {
		if(y + 1 > 100) {
			//System.err.println("ERROR!!! Coordinates is out of the range 0 ... 100!");
			return false;
		}
		y++;
		return true;
	}
	@Override
	public boolean moveUp() {
		if(y - 1 < 0) {
			//System.err.println("ERROR!!! Coordinates is out of the range 0 ... 100!");
			return false;
		}
		y--;
		return true;
	}
}
