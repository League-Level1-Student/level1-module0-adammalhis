package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot Bob = new Robot();
	
	public static void main(String[] args) {
	
		Bob.setSpeed(50);
		Bob.turn(270);
		Bob.move(435);
		Bob.turn(270);
		Bob.move(250);
		Bob.turn(180);
		
		for (int i=0; i<11; i++) {
		Random r= new Random();
		int red= r.nextInt(255);
		int green= r.nextInt(255);
		int blue= r.nextInt(255);
			Color c= new Color(red, green, blue);
			drawHouse(i*50, c);
	
		}
	
	}
	public static void drawHouse(int size, Color theColor) {
		
		Bob.setPenColor(theColor);
		Bob.penDown();
		Bob.move(size);
		
		if (size < 250) {
			drawDiagnalRoof();
		}
		else {
			drawStraightRoof();
		}
		Bob.move(size);
		Bob.turn(270);
		Bob.setPenColor(0,255,0);
		Bob.move(40);
		Bob.turn(270);
		
	}
	public static void drawDiagnalRoof() {
	
		Bob.turn(45);
		Bob.move(40);
		Bob.turn(90);
		Bob.move(40);
		Bob.turn(45);
	
	
	}
	
	public static void drawStraightRoof() {
		
		Bob.turn(90);
		Bob.move(40);
		Bob.turn(90);
	
		
	}
	
	}




