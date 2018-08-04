
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "July 5th";
		String dadsBirthday = "September 19th";
		String myBirthday = "August 27th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String birthday = JOptionPane.showInputDialog("Which birthday do you want? Mom, dad, or me?");

		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		if (birthday.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		else if (birthday.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
		// print dad's birthday
		// 6. if user asked for your name
		else if (birthday.equalsIgnoreCase("you")) {
			System.out.println(myBirthday);
		}
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, I don't remember that person's birthday!");
		}
	}

	private static void println(String birthday) {
		// TODO Auto-generated method stub

	}
}
