numberOfTest = int(input())
while(numberOfTest > 0):
	sum = 0
	number = int(input())
	while(number > 0):
		sum += number % 10
		number /= 10
	print(sum)
	numberOfTest -= 1
