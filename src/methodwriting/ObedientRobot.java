package methodwriting;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What shape do you want: square, triangle, or circle?");
		if (answer.equalsIgnoreCase("square")) {
			drawSquare();
		}
		if (answer.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		if (answer.equalsIgnoreCase("circle")) {
			drawCircle();
		}
	}

	public static void drawSquare() {
		rob.penDown();
		rob.setSpeed(100);
		for (int i = 1; i < 5; i++) {
			rob.move(50);
			rob.turn(90);
		}
	}

	public static void drawTriangle() {
		rob.penDown();
		rob.setSpeed(100);
		for (int i = 1; i < 4; i++) {
			rob.move(100);
			rob.turn(120);
		}
	}

	public static void drawCircle() {
		rob.penDown();
		rob.setSpeed(1000000000);
		for (int i = 1; i < 10000000; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}
