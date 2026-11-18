sum = 0
for counter in range(1,11):
	score = int(input("Enter Score: "))
	
	if score>0 and score <100:
		sum+=score
print(f"The sum is {sum}")
