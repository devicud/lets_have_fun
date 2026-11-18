import java.util.Scanner;
	public class PhaseTwoTaskOne{
			public static void main(String [] args){
				Scanner input = new Scanner (System.in);
				for (int counter = 1; counter<=10; counter++){
					System.out.print("Enter Score: ");
					int score = input.nextInt();
					if (score == 1){
						System.out.printf("%d is a prime number\n",score);
					}
					if (score == 2){
						System.out.printf("%d is a prime number\n",score);
					}
					if (score % 2 == 0 && score!=2){
					System.out.println("Invalid input");
					continue;
					}
				for (int primeChecker = 2; primeChecker<=score; primeChecker++){
				  if (score%primeChecker==0){
				System.out.println("Invalid input");
				break;
				}
				else if (primeChecker==score-1){
				System.out.printf("%d is a prime number\n",score);
				break;
				}
				}
			}
		}
	}
