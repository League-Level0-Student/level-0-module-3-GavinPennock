package _04_are_you_happy;
import javax.swing.JOptionPane;

public class are_you_happy {
public static void main(String[] args) {
	String jerry=JOptionPane.showInputDialog(null, "are you sad?");
	if(jerry .equals ("yes")) {
		String berry=JOptionPane.showInputDialog(null, "did a pet die?");
		
		if(berry.equals("no")) {
			JOptionPane.showMessageDialog(null, "then you are not sad!!");
		}
		
		if(berry.equals("yes")) {
			JOptionPane.showMessageDialog(null, "I will let you die in peace");
		}
	}
	
	if(jerry.equals("no")) {
		JOptionPane.showMessageDialog(null, "then begone");
	}
		
























}
	
}

