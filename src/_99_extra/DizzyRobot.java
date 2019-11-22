//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		String dizzy=JOptionPane.showInputDialog("how dizzy do you want your robot to be on a scale from 1-100?");
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
		int duzzy= Integer.parseInt(dizzy);
dance(duzzy);
 // 1. Use the dance method to make the robot spin.
	

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

