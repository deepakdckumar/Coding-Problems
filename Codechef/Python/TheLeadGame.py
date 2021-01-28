numberOfTest = int(input())
firstLead, secondLead = 0, 0
firstN, secondN = 0, 0
while(numberOfTest > 0):
	firstNumber, secondNumber = raw_input().split(" ")
	firstNumber = int(firstNumber)
	firstNumber = firstNumber + firstN
	secondNumber = int(secondNumber)
	secondNumber = secondNumber + secondN
	firstN = firstNumber
	secondN = secondNumber
	testLead = firstNumber - secondNumber
	if(testLead > 0 and testLead > firstLead):
		firstLead = testLead
	elif(testLead < 0):
		testLead *= -1
		if(testLead > secondLead):
			secondLead = testLead
	numberOfTest -= 1
if(firstLead > secondLead):
	print(1, firstLead)
else:
	print(2, secondLead)
