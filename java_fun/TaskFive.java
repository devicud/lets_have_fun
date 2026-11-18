import java.util.Scanner;
	public class TaskFive{
		public static void main (String [] args){
			Scanner input = new Scanner (System.in);
			int sum= 0;
			for (int counter=1; counter<=10; counter++){
				System.out.print("Enter Score: ");
				int score = input.nextInt();
				if (score%2 == 0){
				sum+=score;
				}
			}
			System.out.println("The Sum is of the even numbers is "+sum);
		}
	}
