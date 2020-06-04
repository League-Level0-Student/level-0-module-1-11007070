package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("I am not alive, but I grow. I don't have lungs but I need air. I don't have a mouth, but water kills me. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (answer.equals("fire")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "wrong");
			JOptionPane.showMessageDialog(null, "the answer was fire");
		}
		// 6. Add some more riddles
		String answer1 = JOptionPane.showInputDialog("What runs around the whole yard without moving?");
		if (answer1.equals("a fence")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");
			JOptionPane.showMessageDialog(null, "the answer was a fence");
		}
		String answer2 = JOptionPane.showInputDialog("What can you catch but never throw?");
		if (answer2.equals("a cold")){
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");
			JOptionPane.showMessageDialog(null, "the answer was a cold");
		}
		String answer3 = JOptionPane.showInputDialog("How can you leave a room with two legs and return with six legs?");
		if (answer3.equals("bring a chair back with you")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");
			JOptionPane.showMessageDialog(null, "the answer was to bring a chair back with you");
		}
		String answer4 = JOptionPane.showInputDialog("If you were running in a race, and you passed the person in 2nd place, what place would you be in now?");
		if (answer4.equals("2nd place")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");
			JOptionPane.showMessageDialog(null, "the answer was 2nd place");
		}
		String answer5 = JOptionPane.showInputDialog("Railroad Crossing, look out for the cars. Can you spell that, without and R's?");
		if (answer5.equals("that")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");
			JOptionPane.showMessageDialog(null, "the answer was that");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your final score is: " + score);
	}
}

