//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String bannanas=JOptionPane.showInputDialog("bo you like bannanas boi????");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if(bannanas .equals ("no")) {
			JOptionPane.showMessageDialog(null, "are you bannans boi noy begone before my gang of bannanas does something that they won't regret");
			System.exit(0);
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
if(bannanas.equals("yes")) {
	String hobby=JOptionPane.showInputDialog(null, "what is your fAvOrITE HobbY");
	JOptionPane.showMessageDialog(null, hobby+" is sort of lame it would be so much better if you ate bannas while doing it!!!");
}
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
