import java.util.Scanner;
	public class PhaseTwoTaskTwo{
			public static void main(String [] args){
				Scanner input = new Scanner (System.in);
				int sum = 0;
				int primeCounter = 0;
				for (int counter = 1; counter<=10; counter++){
					System.out.print("Enter Score: ");
					int score = input.nextInt();
					if (score == 2){
						System.out.println(score);
					}
					if (score % 2 == 0){
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
				sum+=score;
				primeCounter++;
				break;
				}
				}
			}
			double average = sum/primeCounter;
			System.out.println("The Average of the prime numbers are "+ average+"\nThe Sum is "+ sum);
		}
	}
