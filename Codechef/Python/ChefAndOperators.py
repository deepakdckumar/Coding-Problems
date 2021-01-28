testCases = int(input())
while(testCases > 0):
	firstNumber, secondNumber = raw_input().split(" ")
	firstNumber = int(firstNumber)
	secondNumber = int(secondNumber)
	if(firstNumber > secondNumber):
		print(">")
	elif(firstNumber < secondNumber):
		print("<")
	else:
		print("=")
	testCases -= 1
