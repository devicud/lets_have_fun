import java.util.Scanner;
	public class TaskEight{
		public static void main (String [] args){
			Scanner input = new Scanner (System.in);
			int sum= 0;
			for (int counter=1; counter<=10; counter++){
				System.out.print("Enter Score: ");
				int score = input.nextInt();
				while (score<0 || score>100){
				  System.out.println("Invalid input");
				  System.out.print("Enter Score: ");
				  score = input.nextInt();
				}
				sum+=score;
			}
			System.out.println("The sum is "+sum);
		}
	}
