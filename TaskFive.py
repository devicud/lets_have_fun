sum = 0
even_counter = 0;
for counter in range(1,11):
	score = int(input("Enter Score: "))
	
	if score%2 ==0:
		sum+=score
print(f"The Sum is {sum}")
