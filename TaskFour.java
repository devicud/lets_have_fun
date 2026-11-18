import java.util.Scanner;
	public class TaskFour{
		public static void main (String [] args){
			Scanner input = new Scanner (System.in);
			int sum= 0;
			for (int counter=1; counter<=10; counter++){
				System.out.print("Enter Score: ");
				int score = input.nextInt();
				if (counter%2 == 0){
				sum+=score;
				}
			}
			System.out.println("The Sum is of the even indexes is "+sum);
		}
	}
