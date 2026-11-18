import java.util.Scanner;
	public class TaskNine{
		public static void main (String [] args){
			Scanner input = new Scanner (System.in);
			int sum= 0;
			for (int counter=1; counter<=10; counter++){
				System.out.print("Enter Score: ");
				int score = input.nextInt();
				if (score>0 && score<100){
				  sum+=score;
				}
			}
			System.out.println("The sum is "+sum);
		}
	}
