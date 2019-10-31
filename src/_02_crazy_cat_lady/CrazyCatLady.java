//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _02_crazy_cat_lady;


import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String jerry=JOptionPane.showInputDialog(null, "how many cats do you have?");
		// 2. Convert their answer into an int
Object parse;
int bob=Integer.parseInt(jerry);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
if (bob >2) {
	JOptionPane.showMessageDialog(null, "my my my you are the crazy cat lady on the block. I'm not coming to your house ever again");
} 
if(bob<3&&bob>0) {
playVideo("https://www.youtube.com/watch?v=94PLgLKcGW8");
}
if (bob<1) {
	playVideo("https://www.youtube.com/watch?v=oj_yLBltPE8");
}

		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video

		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

