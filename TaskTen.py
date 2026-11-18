sum = 0
even_counter = 0
for counter in range(1,11):
	score = int(input("Enter Score: "))
	
	if score>0 and score <100:
		sum+=score
		even_counter+=1
average = sum/even_counter
print(f"The sum is {sum}")
