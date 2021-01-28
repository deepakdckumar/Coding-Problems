numberOfTest = int(input())
while(numberOfTest > 0):
	firstNumber, secondNumber, thirdNumber = raw_input().split(" ")
	firstNumber = int(firstNumber)
	secondNumber = int(secondNumber)
	thirdNumber = int(thirdNumber)
	if(firstNumber >= secondNumber and firstNumber >= thirdNumber):
		if(secondNumber > thirdNumber):
			print(secondNumber)
		else:
			print(thirdNumber)
	elif(secondNumber >= firstNumber and secondNumber >= thirdNumber):
		if(firstNumber > thirdNumber):
			print(firstNumber)
		else:
			print(thirdNumber)
	else:
		if(secondNumber > firstNumber):
			print(secondNumber)
		else:
			print(firstNumber)
	numberOfTest -= 1
