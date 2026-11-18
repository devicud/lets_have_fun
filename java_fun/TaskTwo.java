import java.util.Scanner;
	public class TaskTwo{
		public static void main (String [] args){
			Scanner input = new Scanner (System.in);
			int sum= 0;
			for (int counter=1; counter<=10; counter++){
				System.out.print("Enter Score: ");
				int score = input.nextInt();
				sum+=score;
			}
			int average = sum/10;
			System.out.println("The Average is "+ average);
		}
	}
