numberOfTest = int(input())
while(numberOfTest):
	test = int(input())
	reverseNumber = 0
	while(test > 0):
		reverseNumber = reverseNumber * 10 + test % 10
		test /= 10
	print(reverseNumber)
	numberOfTest -= 1
