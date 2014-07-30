package test;

import java.util.Scanner;

public class PigLatin
{
	
	public static void main (String [] args)
	{
		String pigLatin;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter words/a passage to be translated into Pig Latin: ");
		String word = reader.nextLine();
		
		reader.close();
		
		String[] arr = word.split(" ");
		for (String words: arr)
		{
			char firstLetter = words.charAt(0);
			String firstLetterToString = Character.toString(firstLetter);
			
			if (!(firstLetterToString.equalsIgnoreCase("a") || firstLetterToString.equalsIgnoreCase("e") || 
					firstLetterToString.equalsIgnoreCase("i") || firstLetterToString.equalsIgnoreCase("o") 
					|| firstLetterToString.equalsIgnoreCase("u"))){
			String s = words.substring(1, words.length());
			pigLatin = s + firstLetterToString + "ay";
			}
			
			else {
				pigLatin = words + "way";
			}
			
			
			System.out.print(pigLatin + " ");
		}
	}
}
