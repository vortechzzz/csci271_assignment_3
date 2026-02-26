/*************************************************************************
* Assignment 3, Question 3 for CSCI 271-001 Spring 2026
*
* Author: Zach Allman
* OS: Ubuntu 24.04.3 LTS
* Compiler: javac 21.0.9
* Date: February 25 2026
*
* Purpose
* This program reads a list of integers from the user and stores them
* into an array A, then finds the maximum integer in A using a
* recursive function max(). No loops are used in finding the maximum.
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

public class CSCI271_Assignment_3_Q3_ZachAllman
{

	public static int max(int[] A, int index)
	{
		//Base Case: Last element in the array
		if(index == A.length - 1)
		{
			return A[index];
		}

		//Recursion Case: Finds the max in the rest of the array
		int maxInArray = max(A, index + 1);

		//Returns the larger of the current element and max of rest
		if (A[index] > maxInArray)
		{
			return A[index];
		}

		else
		{
			return maxInArray;
		}
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Type how many integers you want to enter: ");
		int n = input.nextInt();

		//Reads input from the user and puts integers in array
		int[] A = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter integer: " + (i + 1) + ": ");
			A[i] = input.nextInt();
		}

		//Show the array
		System.out.print("Array: [");
		for (int i = 0; i < A.length; i++)
		{
			System.out.print(A[i]);
			if (i < A.length - 1)
			{
				System.out.print(", ");
			}
		}
		System.out.println("]");

		//Finds and displays the maximum using recursion function
		int maximum = max(A, 0);
		System.out.println("Max value: " + maximum);
	}

}
