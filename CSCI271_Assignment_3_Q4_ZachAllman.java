/*************************************************************************
* Assignment 3, Question 4 for CSCI 271-001 Spring 2026
*
* Author: Zach Allman
* OS: Ubuntu 24.04.3 LTS
* Compiler: javac 21.0.9
* Date: February 25 2026
*
* Purpose
* This program reads an integer N (as a long) and a single digit D
* from the user and displays the number of times D occurs in N using
* a recursive function. The function takes N and D as arguments and
* returns the count recursively without using any loops. It uses
* arithmetic (N % 10 and N / 10) to extract and remove digits.
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

public class CSCI271_Assignment3_Q4_ZachAllman
{
