sum = 0
prime_counter = 0

for counter in range (1,11):
	score = int(input("Enter Score: "))
	if score == 1:
		print(f"{score} is a prime number\n")

	if score == 2:
		print(f"{score} is a prime number\n")
		prime_counter+=1	
	if score % 2 == 0 and score!=2:
		print("Invalid input")
		continue
	for prime_checker in range(2,score+1):
		if score%prime_checker==0:
			print("Invalid input")
			break
		elif prime_checker==score-1:
			sum+=score
			prime_counter+=1
			break
			
average = sum/prime_counter
print(f"The Sum is {sum}\nThe Average is {average}")
