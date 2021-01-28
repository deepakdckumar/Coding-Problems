numberOfTest, testDivisor = raw_input().split(" ")
numberOfTest = int(numberOfTest)
testDivisor = int(testDivisor)
count = 0
while(numberOfTest > 0):
	testNumber = int(input())
	if(testNumber % testDivisor == 0):
		count += 1
	numberOfTest -= 1
print(count)
