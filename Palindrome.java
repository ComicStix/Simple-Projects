package test;

public class Palindrome {
	
	private boolean isPalindrome;
	private String reversedString = "";
	
	public boolean isPalindrome (String testWord, String reversedWord)
	{
		if (testWord.equals(reversedWord))	
			isPalindrome = true;
		else {
			isPalindrome = false;
		}
		return isPalindrome;
	}
	public String getReversedWord (String testWord)
	{
		for (int i = testWord.length()-1;i >= 0;i--)
		{
			reversedString += testWord.charAt(i);
		}
		return reversedString;
	}
	

}
