numberOfTest = int(input())
while(numberOfTest > 0):
	number = str(input())
	firstDigit = int(number[0])
	secondDigit = int(number[len(number) - 1])
	print(firstDigit + secondDigit)
	numberOfTest -= 1	
