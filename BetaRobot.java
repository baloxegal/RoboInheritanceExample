package robo;

import java.util.Scanner;

public class BetaRobot extends AlphaRobot {
	private byte charge;
	private int oldX;
	private int oldY;
	
	public BetaRobot(String name, String model) {
		super(name, model);
		charge = 0;
		oldX = 0;
		oldY = 0;
	}
	
	public void setCharge(int charge) {
		if(charge < 0 || charge > 100) {
			System.err.println("ERROR!!! Insert the charge value from the range 0 ... 100!");
			Scanner in = new Scanner(System.in);
			this.charge = in.nextByte();
			return;
		}
		this.charge = (byte)charge;
	}
	public byte getCharge() {
		return charge;
	}
	public void setX(int x) {
		super.setX(x);
		oldX = getX();
	}
	private int getOldX() {
		return oldX;
	}
	public void setY(int y) {
		super.setY(y);
		oldY = getY();
	}
	private int getOldY() {
		return oldY;
	}
	public boolean moveRight() {
		if(charge <= 5) {
			return false;
		}
		else if(!super.moveRight()) {
			return false;
		}
		else if (getX() == oldX || getX() - oldX == 2) {
			charge--;
			oldX = getX();
		}
		return true;
	}
	public boolean moveLeft() {
		if(charge <= 5) {
			return false;
		}
		else if(!super.moveLeft()) {
			return false;
		}
		else if (getX() == oldX || oldX - getX() == 2) {
			charge--;
			oldX = getX();
		}
		return true;
	}
	public boolean moveDown() {
		if(charge <= 5) {
			return false;
		}
		else if(!super.moveDown()) {
			return false;
		}
		else if (getY() == oldY || getY() - oldY == 2) {
			charge--;
			oldY = getY();
		}
		return true;
	}
	public boolean moveUp() {
		if(charge <= 5) {
			return false;
		}
		else if(!super.moveUp()) {
			return false;
		}
		else if (getY() == oldY || oldY - getY() == 2) {
			charge--;
			oldY = getY();
		}
		return true;
	}
}
