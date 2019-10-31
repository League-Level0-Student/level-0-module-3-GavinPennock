//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob=new Robot();
		
		Random ran=new Random();
		int joe=ran.nextInt(40);
		//1. Create a new Robot
	rob.setSpeed(1000);
	rob.penDown();
		//3. Ask the user what color they would like the robot to draw
	String jerry=JOptionPane.showInputDialog(null, "what color do you want to draw with? (red or blue)");
		//5. Use an if/else statement to set the pen color that the user requested
	for(int i=1; i<10; i++) {
if (jerry .equals ("red")) {
	rob.setPenColor(100000,0,0);
}
if (jerry .equals ("blue")) {
	rob.setPenColor(0,0,100000);
}
if (jerry .equals ("")) {
	rob.setPenColor(joe,joe,0);
}
rob.move(200);
rob.turn(90);
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		}

	}
}
