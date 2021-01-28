numberOfTest = int(input())
while(numberOfTest > 0):
	fact = 1
	number = int(input())
	if(number <= 0):
		print(fact)
	else:
		while(number > 0):
			fact *= number
			number -= 1
		print(fact)
	numberOfTest -= 1
