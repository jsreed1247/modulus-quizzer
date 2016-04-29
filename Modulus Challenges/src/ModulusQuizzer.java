import java.util.Scanner;
public class ModulusQuizzer 
{
private static int counter;

public static void main(String [] args)
	{
		System.out.println("Hello there, welcome to the modulus quizzer how many questions do you want to do?");
		Scanner userInput=new Scanner(System.in);
		int questions = userInput.nextInt();
		System.out.println("You want a " + questions + " question quiz ");
		for(int i=0; i< questions; i++)
		{
		int questions1=(int)(Math.random()*10)+1;
		int questions2=(int)(Math.random()*10)+1;
		System.out.println(questions1 + " % " + questions2);
		int answer = userInput.nextInt();
		int correct=0;
		if(answer == questions1 % questions2)
			{
				correct = correct + 1; 
				System.out.println("Good job!");
				 counter++;
			}
		else
		{
			System.out.println("Darn your answer is wrong!");
		}
		}
		System.out.println("You have " +counter+ " correct answers! ");
	}

}
