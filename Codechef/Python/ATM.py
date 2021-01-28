withDrawAmount=int(input())
totalAmount=float(input())
if(withDrawAmount % 5 != 0 or withDrawAmount >= totalAmount):
	print(totalAmount)
else:
	print(totalAmount-withDrawAmount-0.5)
