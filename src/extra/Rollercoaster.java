package extra;

import javax.swing.JOptionPane;

public class Rollercoaster {

	public static void main(String[] args) {
		
		String height = JOptionPane.showInputDialog("What is your height?");
		
		int i = Integer.parseInt(height);
		
		if (i > 48) {
			
			JOptionPane.showMessageDialog(null, "You can ride the rollercoaster.");
		}
		else {
			JOptionPane.showMessageDialog(null,  "You need to grow more first");
		}
		
		
		
	}
}
