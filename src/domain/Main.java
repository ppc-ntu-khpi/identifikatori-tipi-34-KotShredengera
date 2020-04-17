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
				System.out.println("�������� �������");
				System.out.print("1-��������� ����� ��������;, \n" + "2-�����, \n");
				try {
					menu = in.readLine();
				} catch (IOException e) {
					System.out.println("Error: " + e);
					System.exit(0);
				}
			} while (menu.length() != 1);
			switch (menu.charAt(0)) {

			case '1': // ����� � ��������
				System.out.println("������� ������");

				try {
					String word = in.readLine();
					Exercise exercise = new Exercise();

					if (exercise.Calculate(word)) {
						System.out.println("����� ���������!");
					} else
						System.out.println("����� �� �������� �����������(");

				} catch (IOException e) {
					System.out.println("Error: " + e);
					System.exit(0);
				}
				break;
			case '2': // ����� � ��������
				System.out.println("�����.");
				break;
			default:
				System.out.print("������ ������� ");
			}

		} while (menu.charAt(0) != '2');

	}
}