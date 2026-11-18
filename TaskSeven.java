import java.util.Scanner;
	public class TaskSeven{
		public static void main (String [] args){
			Scanner input = new Scanner (System.in);
			double evenCounter = 0;
			double sum= 0;
			for (int counter=1; counter<=10; counter++){
				System.out.print("Enter Score: ");
				double score = input.nextInt();
				if (score%2 == 0){
				evenCounter++;
				sum+=score;
				}
			}
			double average = sum/evenCounter;
			System.out.println("The Sum of the even numbers is "+ sum+"\nThe Average is of the even numbers is "+average);
		}
	}
