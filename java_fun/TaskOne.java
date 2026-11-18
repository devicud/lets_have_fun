import java.util.Scanner;
	public class TaskOne{
		public static void main (String [] args){
			Scanner input = new Scanner (System.in);
			int sum= 0;
			for (int counter=1; counter<=10; counter++){
				System.out.print("Enter Score: ");
				int score = input.nextInt();
				sum+=score;
			}
			System.out.println("The sum is "+sum);
		}
	}
