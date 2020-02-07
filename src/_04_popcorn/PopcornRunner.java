package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		Popcorn popcorn = new Popcorn(JOptionPane.showInputDialog("Flavor Of Popcorn?"));
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(Integer.parseInt(JOptionPane.showInputDialog("How Long To Cook?")));
		microwave.startMicrowave();
		popcorn.applyHeat();
	}
}
