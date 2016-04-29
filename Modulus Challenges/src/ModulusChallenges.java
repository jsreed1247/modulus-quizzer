import java.util.Scanner;
public class ModulusChallenges 
{
public static void main(String [] args)
	{
	evenOrOdd();
	leapYear();
	everynumber();
	fizzBuzz();
	}
public static void evenOrOdd()
	{
	System.out.println("Please type in a number");
	Scanner userInput = new Scanner(System.in);
	int x = userInput.nextInt();
	if(x % 2 == 0)
		{
		System.out.println(x + " is an even number ");
		}
	else
		{
		System.out.println(x+ " is an odd number ");
		}
	}
public static void leapYear()
	{
	System.out.println("Please put in a year ");
	Scanner userInput = new Scanner(System.in);
	int x = userInput.nextInt();
	if(x % 4 == 0)
	{
		System.out.println(x + " is a leap year ");
	}
	else
		{
			System.out.println(x + " is not a leap year ");
		}
	}
public static void everynumber()
{
	int[] everyNumber={2, 5, -7, 1, 3, 12, 19, -16, 4, 20};
	int i= 1;
	for (i=1; i<10; i++)
	{
		if(i % 3==0)
		{
			System.out.println(everyNumber[i]);
		}
	}
}
public static void fizzBuzz()
{
int i=1;
for(i=1; i<100; i++)
{
	if(i % 3==0 && i % 5==0)
	{
		System.out.println("FizzBuzz");
	}
	else if(i % 3==0)
	{
		System.out.println("Fizz");
	}
	else if(i % 5==0)
	{
		System.out.println("Buzz");
	}
	else
	{
		System.out.println(i);
	}
}
{
}
}}

