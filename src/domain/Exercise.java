package domain;

/**
 * Calculation and nesting of results
 * 
 * @author Kot_Shredingera
 */
public class Exercise {
	/**
	 * Determining whether a word is a polydrome
	 * 
	 * @param s intput word
	 * @return boolean value (is polydrome - true; none - false)
	 */
	public static boolean Calculate(String s) {

		IsDigit(s);

		s = s.toLowerCase();
		byte flag = 0;
		String wordTest = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == s.charAt(flag)) {
				wordTest = wordTest + s.charAt(i);
				flag++;
			}
		}

		return s.equals(wordTest);
	}

	/**
	 * Checking for numbers in a string
	 * 
	 * @param s input word
	 */
	private static void IsDigit(String s) {
		if (!s.matches("^\\D*$")) { // содержит цифры
			System.out.println("Ошибка в строке, исключите цифры");
			System.exit(0);
		}
	}
}
