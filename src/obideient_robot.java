import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obideient_robot {
public static void main(String[] args) {
	Robot frank=new Robot();
	frank.setSpeed(100);
	String color=JOptionPane.showInputDialog(null, "pick a color! red green or blue");
	String shape=JOptionPane.showInputDialog(null, "pick a shape! triangle, circle, or square!");
	
	if(color .equals("blue")) {
		blue(frank);
	}
			if(color .equals("green")) {
				green(frank);
			}
			if(color .equals("red")) {
				red(frank);
			}

	if(shape .equals ("square")) {
	drawSquare(frank);
}
if(shape .equals ("triangle")) {
	drawTriangle(frank);
}
if(shape .equals ("circle")) {
	
	drawCircle(frank);
}

	}
static void drawSquare(Robot q) {
	q.penDown();
	for(int i=1; i<5;i++ ){
q.move(200);
q.turn(90);
	}
}
static void drawTriangle(Robot q) {
	for(int i=1; i<5;i++ ){
	q.penDown();
	q.move(200);
	q.turn(120);
	}

}
static void drawCircle(Robot q) {
	for(int i=1; i<360;i++ ){
	q.penDown();
	q.move(1);
	q.turn(1);
	}
}
	static void green(Robot q) {
	q.setPenColor(0, 1000000, 0);
	}
	static void red(Robot q) {
		q.setPenColor(1000000, 0, 0);
		}
	static void blue(Robot q) {
		q.setPenColor(0, 0, 1000000);
		}
}


