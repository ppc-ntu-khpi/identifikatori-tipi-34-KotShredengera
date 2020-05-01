package test;

import domain.Exercise;

/**
 * Tests developed classes.
 * 
 * @author Kot_Shredingera
 *
 */
public class TestResult {
	/**
	 * validation of data calculation
	 * 
	 * @param args program startup option.
	 */
	public static void main(String[] args) {

		String R = "дќхоƒ";
		System.out.println("Input word = " + R + ", is polidrom - " + Exercise.Calculate(R));
	}
}
