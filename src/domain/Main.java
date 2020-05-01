package domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calculation and output of results. Has implementation of static main ()
 * method.
 * 
 * @author Kot_Shredingera
 * @see Main#main
 */
public class Main {

	/**
	 * Runs when compiling a program. Calculation results for different arguments on
	 * the screen.
	 * 
	 * @param args program startup option.
	 */
	public static void main(String[] args) {
		String menu = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		do {
			do {
				System.out.println("Выберите команду");
				System.out.print("1-Проверить слово полидром;, \n" + "2-Выйти, \n");
				try {
					menu = in.readLine();
				} catch (IOException e) {
					System.out.println("Error: " + e);
					System.exit(0);
				}
			} while (menu.length() != 1);
			switch (menu.charAt(0)) {

			case '1': // вихід з програми
				System.out.println("Введите строку");

				try {
					String word = in.readLine();
					Exercise exercise = new Exercise();

					if (exercise.Calculate(word)) {
						System.out.println("Слово полиндром!");
					} else
						System.out.println("Слово не является полиндромом(");

				} catch (IOException e) {
					System.out.println("Error: " + e);
					System.exit(0);
				}
				break;
			case '2': // вихід з програми
				System.out.println("Вихід.");
				break;
			default:
				System.out.print("Невірна команда ");
			}

		} while (menu.charAt(0) != '2');

	}
}