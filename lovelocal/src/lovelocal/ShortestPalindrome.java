package lovelocal;

import java.util.Scanner;

public class ShortestPalindrome {
	    public static String shortestPalindrome(String s) {
	        int n = s.length();
	        if (n <= 1) {
	            return s;
	        }

	        int i = 0;
	        for (int j = n - 1; j >= 0; j--) {
	            if (s.charAt(i) == s.charAt(j)) {
	                i++;
	            }
	        }

	        if (i == n) {
	            return s;
	        }

	        String suffix = s.substring(i);
	        String prefix = new StringBuilder(suffix).reverse().toString();
	        String middle = shortestPalindrome(s.substring(0, i));

	        return prefix + middle + suffix;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();
	        String result = shortestPalindrome(userInput);
	        System.out.println("Shortest palindrome: " + result);
	        scanner.close();
	    }
}

