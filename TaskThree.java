import java.util.Scanner;
	public class TaskThree{
		public static void main (String [] args){
			Scanner input = new Scanner (System.in);
			double sum= 0;
			for (int counter=1; counter<=10; counter++){
				System.out.print("Enter Score: ");
				int score = input.nextInt();
				sum+=score;
			}
			double average = sum/10;
			System.out.println("The Sum is "+sum+"\nThe Average is "+ average);
		}
	}
