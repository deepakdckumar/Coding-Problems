testCases = int(input())
while(testCases > 0):
	fact = 1
	test = int(input())
	if(test <= 0):
		fact = 1
	else:
		while(test > 0):
			fact *= test
			test -= 1
	print(fact)
	testCases -= 1	
