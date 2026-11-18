import java.util.Scanner;
	public class PhaseTwoTaskFour{
			public static void main(String [] args){
				Scanner input = new Scanner (System.in);
				double sum = 0;
				int squareCounter = 0;
				for (int counter = 1; counter<=10; counter++){
					System.out.print("Enter Score: ");
					int score = input.nextInt();
					for (int squareChecker=1; squareChecker<score; squareChecker++){
						if (squareChecker*squareChecker==score){
							sum+=score;
							squareCounter++;
							break;
						}
				    else if (squareChecker==score-1){
				      break;
				    }
					}
				}
				double average = sum/squareCounter;
				System.out.printf("The sum of the Perfect Squares is %.2f%nThe Average is %.2f%n",sum,average);
		}
		
	}
