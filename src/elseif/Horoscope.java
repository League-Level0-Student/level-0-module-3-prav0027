package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String horoscope = JOptionPane.showInputDialog("What is your star sign?");
		if(horoscope.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Today you will who those who don't believe it that you can learn something new and be good at it today.");
		}
		else if(horoscope.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "You will deal with your vulnerability today and reditect your clinginess to something positive.");
	}
		else if(horoscope.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Today you will work well with children and others will notice.");
		}
		else if(horoscope.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "Two pairs of hands will be better than one today.");
		}
		else if(horoscope.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "While The Sun focuses your attention on money, Venus urges you to follow your heart today.");
		}
		else if(horoscope.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "You are preparing for big things to come in your career, but you can have some fun along the way.");
		}
		else if(horoscope.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "If you think your slow energy makes it a bad time to leap into new activities, just go for it and find out.");
		}
		else if(horoscope.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Don't worry about the details today, ask the big questions in your life and you'll find answers.");
		}
		else if(horoscope.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "When a casual conversation turns serious today, find a positive way forward by sharing your thoughts.");
		}
		else if(horoscope.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "When you struggle to understand something today, don't waste your energy, just let it settle.");
		}
		else if(horoscope.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, "No matter how tempting, don't dive into something today without asking yourself some questions.");
		}
		else if(horoscope.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "When someone asks you to do something you feel is wrong today, go with your conscience, you have to live with it.");
		}
		else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}

}
}
