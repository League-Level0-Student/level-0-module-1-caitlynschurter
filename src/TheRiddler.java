import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer =JOptionPane.showInputDialog("What kind of room has no doors or windows?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equals("mushroom")) {
	JOptionPane.showMessageDialog(null, "Dat's correct!");
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "Sorry, but dat's wrong");	

}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " +score);
		
		// 6. Add some more riddles
		answer =JOptionPane.showInputDialog("What gets wetter and wetter the more it dries? ");
		if(answer.equals("a towel")) {
			JOptionPane.showMessageDialog(null, "Dat's correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, but dat's wrong");	
		}
		JOptionPane.showMessageDialog(null, "Your score is " +score);
		
		answer =JOptionPane.showInputDialog("I have a bank, but no money. I have a bed, but don't sleep. I have a fork, but I never eat. What am i? ");
		if(answer.equals("a river")) {
			JOptionPane.showMessageDialog(null, "Dat's correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, but dat's wrong");	
		}
		JOptionPane.showMessageDialog(null, "Your score is " +score);
		 
		
		
	}	
}

