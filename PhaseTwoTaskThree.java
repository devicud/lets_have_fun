import java.util.Scanner;
	public class PhaseTwoTaskThree{
			public static void main(String [] args){
				Scanner input = new Scanner (System.in);
				for (int counter = 1; counter<=10; counter++){
					System.out.print("Enter Score: ");
					int score = input.nextInt();
					for (int squareChecker=1; squareChecker<score; squareChecker++){
						if (squareChecker*squareChecker==score){
							System.out.println("This is a perfect square!!");
							break;
						}
				    else if (squareChecker==score-1){
				      System.out.println("This is not a perfect square!!");
				      break;
				    }
						}
					}	
		}
	}
