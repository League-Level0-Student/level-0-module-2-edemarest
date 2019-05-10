package extra;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		
		String height = JOptionPane.showInputDialog("What is your age?");
		
		int i = Integer.parseInt(height);
		
		if (i > 17) {
			
			JOptionPane.showInputDialog("Who should the next president be?");
		}
		else {
			JOptionPane.showInputDialog("Nobody cares what you think.");
		}
		
		
		
	}
}
