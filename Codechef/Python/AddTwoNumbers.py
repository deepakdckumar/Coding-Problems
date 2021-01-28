numberOfTest = int(input())
while(numberOfTest > 0):
	firstNumber, secondNumber = raw_input().split(" ")
	firstNumber = int(firstNumber)
	secondNumber = int(secondNumber)
	print(firstNumber + secondNumber)
	numberOfTest -= 1
