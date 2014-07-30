package test;

import java.util.Scanner;

public class PalindromeTest {
	public static void main (String [] args)
	{
		Palindrome pali = new Palindrome();
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a word to find out if it's a palindrome: ");
		String originalWord = reader.nextLine();
		String word = originalWord.replaceAll("\\s+","").toLowerCase();
		reader.close();
		
		String reversedWord = pali.getReversedWord(word);
		if (pali.isPalindrome(word, reversedWord) == true)
		{
			System.out.println(originalWord + " is a palindrome!");
		}
		else {
			System.out.println("Bummer, " + originalWord + " is not a palindrome.");
		}
	}
}
