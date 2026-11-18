sum = 0
for counter in range(1,11):
	score = int(input("Enter Score: "))
	
	while score<0 or score>100:
		print("Invalid input")
		score = int(input("Enter Score: "))
	sum+=score
print(f"The sum is {sum}")
