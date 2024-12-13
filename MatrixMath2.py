#program to multiply two matrices using list comprehension

#3*2 matrix 
X = [[1,2], [3,4], [4,5]]

#2* 3 matrix 
Y = [[1,2,3], [4,5,6]]

#resultant matrix
resultant = [[sum(a*b for a,b in zip(X_row, Y_col) for Y_col in zip(*Y)] for X_row in X]

#printing matrix 
for x in resultant:
    print(x)