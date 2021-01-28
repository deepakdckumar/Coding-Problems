numberOfTest = int(input())
while(numberOfTest > 0):
	count = 0
	number = int(input())
	while(number > 0):
		test = number % 10
		if(test == 4):
			count += 1
		number /= 10
	print(count)
	numberOfTest -= 1
