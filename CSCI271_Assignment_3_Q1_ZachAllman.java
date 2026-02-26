/*************************************************************************
* Assignment 3, Question 1 for CSCI 271-001 Spring 2026
*
* Author: Zach Allman
* OS: Ubuntu 24.04.3 LTS
* Compiler: javac 21.0.9
* Date: February 25 2026
*
* Purpose
* This program reads a string S from the user and displays its length
* using a recursive function. The recursive function takes S as an
* argument and returns the number of characters in S without using
* any loops.
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

public class CSCI271_Assignment_3_Q1_ZachAllman
{
	public static int recursionLength(String s)
	{
		//Base Case: If the string is empty, then the length will = 0
		if (s.equals(""))
		{
			return 0;
		}

		//Recursive Case: Returns 1 and the length of string without the first character
		return 1 + recursionLength(s.substring(1));
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		//Read the input from the user
		System.out.print("Enter a string: " );
		String uString = input.nextLine();

		//Displays the length using the recursion function
		int length = recursionLength(uString);
		System.out.println(uString + " Length is: " + length);
	}
}

