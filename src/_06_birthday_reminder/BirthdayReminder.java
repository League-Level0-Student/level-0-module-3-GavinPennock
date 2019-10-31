
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String fart=JOptionPane.showInputDialog(null, "what is your birthday?");
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = fart;

		// 2. Find out which birthday the user wants and and store their response in a variable
	
		// 3. Print out what the user typed
	String traf=JOptionPane.showInputDialog(null, "whose birthday do you want to see? this computers mom, it's dad, or yours?");
	if (traf .equals("computers mom")) {
	JOptionPane.showMessageDialog(null, momsBirthday);
	}
	else if (traf .equals("computers dad")) {
		JOptionPane.showMessageDialog(null, dadsBirthday);
		}
	else if (traf .equals("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
	}	// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else  {
		JOptionPane.showMessageDialog(null,"i'm sorry but you seem to of put in something that I am not able to answer. try asking about your birthday before I get mad");
		}
	} 
}
