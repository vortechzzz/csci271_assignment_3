/*************************************************************************
* Assignment 3, Question 2 for CSCI 271-001 Spring 2026
*
* Author: Zach Allman
* OS: Ubuntu 24.04.3 LTS
* Compiler: javac 21.0.9
* Date: February 25 2026
*
* Purpose
* This program reads a string S and a single character C from the user
* and displays the number of times C occurs in S using a recursive
* function. The function takes S and C as arguments and returns the
* count recursively without using any loops.
*
*************************************************************************/
/*************************************************************************
*
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
*   instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
*   or any unauthorised sources, including the Internet, either
*   modified or unmodified.
* - If any source code or documentation used in my program was
*   obtained from other sources, like a text book or course notes,
*   I have clearly indicated that with a proper citation in the
*   comments of my program.
* - I have not designed this program in such a way as to defeat or
*   interfere with the normal operation of the supplied grading code.
*
* Zach Allman
********************************************************************/
import java.util.Scanner;

public class CSCI271_Assignment_3_Q2_ZachAllman
{
	public static int charCount(String s, char c)
	{
		//Base Case: If the string is empty, nothing will be counted
		if (s.equals(""))
		{
			return 0;
		}

		//This checks to see if the first character matches c
		int match = 0;

		if (s.charAt(0) == c)
		{
			match = 1;
		}

		//Recursive Case: Returns match and counts in the rest of the string
		return match + charCount(s.substring(1), c);
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		//Reads input from the user
		System.out.print("Enter a string: ");
		String uString = input.nextLine();

		//Reads character from the user
		System.out.print("Enter a character to be counted: ");
		char uChar = input.nextLine().charAt(0);

		//Display the count using recursion function
		int count = charCount(uString, uChar);
		System.out.println(uChar + " shows up " + count + " times in the string: " + uString);

		//Test Cases:
		System.out.println("*** Test Cases ***");

		//Test Case 1: Check to see if the character not in the string gets counted
		String test1 = "Green Bay";
		char char1 = 'z';
		System.out.println(char1 + " shows up " + charCount(test1, char1) + " times in the string: " + test1);

		//Test Case 2: Character shows up more than once + shows if case matters
		String test2 = "Alaska";
		char char2 = 'a';
		System.out.println(char2 + " shows up " + charCount(test2, char2) + " times in the string: " + test2);

		//Test Case 3: Empty string
		String test3 = "";
		char char3 = 'b';
		System.out.println(char3 + " shows up " + charCount(test3, char3)  + " times in the string: " + test3);

		//Test Case 4: String is a single character and checks if that single character matches
		String test4 = "u";
		char char4 = 'u';
		System.out.println(char4 + " shows up " + charCount(test4, char4) + " times in the string: " + test4);

		//Test Case 5: All characters in the string match
		String test5 = "ooooo";
		char char5 = 'o';
		System.out.println(char5 + " shows up " + charCount(test5, char5) + " times in the string: " + test5);

		input.close();
	}
}
