import java.util.Scanner;
	public class TaskTen{
		public static void main (String [] args){
			Scanner input = new Scanner (System.in);
			double sum= 0;
			double evenCounter = 0;
			for (int counter=1; counter<=10; counter++){
				System.out.print("Enter Score: ");
				double score = input.nextInt();
				if (score>0 && score<100){
				sum+=score;
				evenCounter++;
				}
			}
			double average = sum/evenCounter;
			System.out.println("The Average is "+ average);
		}
	}
