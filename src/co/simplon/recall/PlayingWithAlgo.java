package co.simplon.recall;

import java.util.*;

public class PlayingWithAlgo {

	public static String helloWorld(String name) {
		// TODO Auto-generated method stub
		String message;
		// message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[]) {
		return null;
	}

	public static List<String> selectElementsStartingWithVowel(String array[]) {
		return null;
	}

	public static String[] removeNullElements(String array[]) {
		return null;
	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		return null;
	}

	public static String[] reverseOrderInArray(String array[]) {
		return null;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		return null;
	}

	public static String getFirstHalf(String string) {

		double longueur = string.length();
		double halfL = longueur / 2;

		int halfRound = (int) Math.round(halfL);
		int half = halfRound;

		String firstHalf = string.substring(0, half);

		return firstHalf;
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		return null;
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}

	public static String shortestWord(String text) {
		String shortEstWord = "";
		// String [] words= text.split(" ");

		return shortEstWord;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}

	public static String removeCapitals(String text) {
		String textSansCapital = "";

		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {

			}

		}

		return textSansCapital;
	}

	public static String formatDateNicely(String text) {
		String date = "";
		// SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		// Date date = df.parse(test);

		return date;
	}

	public static String getDomainName(String email) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}

	public static boolean checkForSpecialCharacters(String string) {
		return false;
	}

	public static String[] findAnagrams(String name) {
		return null;
	}

	public static int[] letterPosition(String name) {
		return null;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		long resultat = number1 + number2;
		return resultat;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		long resultat = number1 + number2 + number3;
		return resultat;
	}

	public static long addingSeveralNumbers(final long... numbers) {
		long somme = 0;

		

		return somme;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		return null;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number) {
		return null;
	}

	public static String[] getElementsLowerThanSix(String[] array) {
		return null;
	}

	public static int[] sortTabBySelection(int[] array) {
		return null;
	}

	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}

	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}

	public static int roundUp(float number) {

		float rounded = (int) Math.round(number);

		return (int) rounded;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		int resultat = 1;

		for (int i = 1; i <= number; i++) {
			resultat = resultat * i;

		}

		return resultat;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}

	public static boolean checkIfPair(int number) {
		if (number % 2 == 0) {
			return true;

		}
		return false;
	}

	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		if ((number1 % 2 == 0) && (number2 % 2 == 0) && (number3 % 2 != 0)) {
			return true;
		}
		return false;
	}

	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		if ((number1 + number2 + number3) % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean checkIfAllElementsPair(int[] array) {
		for (int i = 0; i <= array.length; i++) {

			if (array[i] % 2 == 0) {
				return true;
			}
		}
		return false;
	}

	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		return null;
	}

	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}

	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		if ((number1 ^ 2) == (number2 ^ 2 + number3 ^ 2)) {
			return true;
		} else if ((number2 ^ 2) == (number1 ^ 2 + number3 ^ 2)) {
			return true;
		} else if ((number3 ^ 2) == (number1 ^ 2 + number2 ^ 2)) {
			return true;
		}
		return false;
	}

	public static boolean checkSiTuPeuxAcheter(int prix) {
		if (prix < 22 && prix % 2 == 0) {
			return true;

		}
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie,
		// check si tu peux payer
		return false;
	}

	public static boolean checkCase1(double prix, int pourcentDeRemise) {

		double prixAvecRemise = prix - prix * pourcentDeRemise / 100;
		if (prixAvecRemise <= 100) {
			return true;
		}
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		return false;
	}

	public static boolean checkCase2(int number1, int number2) {
		if (number1 % 7 == 0 || number2 % 7 == 0 || (number1 + number2) % 7 == 0) {
			return true;
		}

		// check si une de 2 chiffres, ou leur somme se divise par 7
		return false;
	}

	public static boolean checkCase2a(int number1, int number2) {
		if ((number1 + number2) % 7 != 0) {
			return true;
		} else if (number1 % 7 == 0 || number2 % 7 == 0) {
			return false;
		}
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		return false;
	}

	public static boolean checkCase3(int number1, int number2, int number3) {
		if (number1 > number2 && number2 > number3) {
			return true;
		} else if (number1 < number2 && number2 < number3) {
			return true;
		}
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		return false;
	}

	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {

		return null;
	}

	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		return null;
	}

	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		return null;
	}

	public static ArrayList<Integer> reverseOrder(int array[]) {
		return null;
	}

	public static int[] reverseOrderInt(int array[]) {
		return null;
	}

	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element) {
		return null;
	}

	public static ArrayList<Integer> exportElementsPair(ArrayList<Integer> list) {

		return null;
	}

	public static ArrayList<Integer> exportElementsWithIndexPair(ArrayList<Integer> list) {
		return null;
	}

	public static int Addition(HashMap<String, Integer> addition) {
		return 0;
	}

	public static boolean checkIfStringStartsWithA(String word) {
		if (word.charAt(0) == 'a') {
			return true;
		} else if (word.charAt(0) == 'A') {
			return true;
		}

		return false;
	}

	public static boolean checkIfStringStartsWithVowel(String word) {

		if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o'
				|| word.charAt(0) == 'u' || word.charAt(0) == 'y') {
			return true;
		} else if (word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O'
				|| word.charAt(0) == 'U' || word.charAt(0) == 'Y') {
			return true;
		}

		return false;
	}

	public static boolean checkIfStringEndsWithS(String word) {

		int taille = word.length()-1;

		if (word.charAt(taille) == 's') {
			return true;
		} else if (word.charAt(taille) == 'S') {
			return true;
		}

		return false;
	}

	public static String findShortestWord(String[] array) {
		

		return null;
	}

	public static String swapFirstandLastLetter(String array) {

		return null;
	}

	public static int[] swapFirstandLastElement(int[] array) {

		return null;
	}

}
