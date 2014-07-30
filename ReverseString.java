package test;

import java.util.Scanner;

public class ReverseString {
	public static void main (String [] args)
	{
		//String regularString = "nicole daniels";
		Scanner reader = new Scanner(System.in);
		String regularString = reader.nextLine();
		reader.close();
		String reversedString = new String();
		
		for (int i = regularString.length()-1;i >= 0;i--)
		{
			reversedString += regularString.charAt(i);
		}
		System.out.println(reversedString);
	}

}
