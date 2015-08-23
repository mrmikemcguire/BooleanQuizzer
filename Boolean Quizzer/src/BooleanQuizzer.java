import java.util.Scanner;

public class BooleanQuizzer
	{
		static Scanner userInput;
		static int userAnswer, firstNumber, secondNumber;
		static int questionsAnswered = 0;
		static int numberCorrect = 0;
		
		public static void main(String[] args)
			{
				userInput = new Scanner(System.in);
				while (questionsAnswered < 8)
						{
						firstNumber = (int)(Math.random( ) * 16) + 5;
						secondNumber = (int)(Math.random( ) * 10) + 1 ;
						System.out.println("What is " + firstNumber + " % " + secondNumber + "?");
						userAnswer = userInput.nextInt();
						testAnswer();
						}
				
				firstNumber = (int)(Math.random( ) * 16) + 5;
				System.out.println("What is " + firstNumber + " % " + firstNumber + "?");
				secondNumber = firstNumber;
				userAnswer = userInput.nextInt();
				testAnswer();
				secondNumber = (firstNumber + (int)(Math.random() * 5) + 1);
				System.out.println("What is " + firstNumber + " % " + secondNumber + "?");
				userAnswer = userInput.nextInt();
				testAnswer();
				System.out.println("You scored " + numberCorrect + " out of 10.");
			}
		
		public static void testAnswer()
			{
			if (userAnswer == firstNumber % secondNumber)
				{
				System.out.println("That's correct.");
				numberCorrect++;
				}
			else
				System.out.println("Sorry, but that's not right.");
			questionsAnswered++;
			System.out.println();
			}
		}
	
