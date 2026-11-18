sum = 0
square_counter = 0
for counter in range (1,11):
	score = int(input("Enter score: "))
	for square_counter in range(1,score+1):
		if square_counter*square_counter==score:
			#print("This is a perfect square!!")
			sum+=score
			square_counter+=1
			break
		elif square_counter==score-1:
			#print("This is not a perfect square!!")
			break
average = sum/square_counter
print (f"The sum is {sum}\nThe average is {average}")
