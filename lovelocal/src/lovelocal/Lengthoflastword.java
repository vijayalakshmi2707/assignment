package lovelocal;

import java.util.Scanner;

public class Lengthoflastword {

	public static int length_of_last_word(String s) 
	{
		int length=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				length++;
			}
			else if(length>0)
			{
				break;
			}
		}
		return length;
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a string:");;
		String userInput=scanner.nextLine();
		int result=length_of_last_word(userInput);
		System.out.println("length of the last word is " +result);
		scanner.close();	
	}
}
	
		
	
	