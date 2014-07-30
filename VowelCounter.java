package test;

import java.util.HashMap;
import java.util.Scanner;

public class VowelCounter {
	public static void main (String [] args)
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int vowelCount = 0;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the word you wish for the vowel to be counted: ");
		String word = read.next();
		word = word.toLowerCase();
		read.close();
		
		char [] chars = word.toCharArray();
		for (char i: chars)
		{
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
			{
				vowelCount+=1;
				if (!hm.containsKey(i)){
					hm.put(i, 1);
				}
				else {
				hm.replace(i, hm.get(i) + 1);
				}
			}
		}
		System.out.println("Total number of vowels: " + vowelCount);
		//System.out.print(vowelCount);
		System.out.println("Quantity of each specific vowel: ");
		for (Character c: hm.keySet())
		{
			String key = c.toString();
			String value = hm.get(c).toString();
			System.out.println(key + " - " + value);
		}
	}

}
