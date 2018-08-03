//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot r2d2 = new Robot();
		//3. Ask the user what color they would like the robot to draw
	for(int x=1; x<50; x++) {	
		String color = JOptionPane.showInputDialog("What color do you want?");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equalsIgnoreCase("red")) {
	r2d2.setPenColor(255, 0, 0);
}
else if(color.equalsIgnoreCase("blue")) {
	r2d2.setPenColor(0, 0, 255);
}
else if(color.equalsIgnoreCase("green")) {
	r2d2.setPenColor(0, 255, 0);
}
else if(color.equalsIgnoreCase("white")) {
	r2d2.setPenColor(255, 255, 255);
}
else if(color.equalsIgnoreCase("black")) {
	r2d2.setPenColor(0, 0, 0);
}
else if(color.equalsIgnoreCase("purple")) {
	r2d2.setPenColor(150, 0, 120);
}
        //6. If the user doesn’t enter anything, choose a random color
else {
	r2d2.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		r2d2.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)

r2d2.penDown();
for(int i=1; 1<5; i++) {
r2d2.move(90);
r2d2.turn(90);
}
	}
	}
}
