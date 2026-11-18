for counter in range (1,11):
	score = int(input("Enter Score: "))
	if score == 1:
		print(f"{score} is a prime number\n")

	if score == 2:
		print(f"{score} is a prime number\n")
					
	if score % 2 == 0 and score!=2:
		print("Invalid input")
		continue
	for primeChecker in range(2,score+1):
		if score%primeChecker==0:
			System.out.print("Invalid input")
			break
		elif primeChecker==score-1:
			print(f"{score} is a prime number\n")
			break
