#program to multiply two matrices using nested loops

# 3 * 2 matrice
X = [[1,2], [3,4], [4,5]]
# 2 * 3 matrice
Y = [[1, 2, 3], [4, 5, 6]]

#resultant matrix 
result = [[0,0,0], [0,0,0], [0,0,0]]

my_list = []
#iterating  rows of X matrix 

for i in range( len(X)):
    #iterating column of Y matrix 
    for j in range(len(Y[0])):
        # iterating rows of matrix Y 
        for k in range(len(Y)):
            result[i][j] +=  X[i][k] * Y[k][j]

for r in result:
    print(r)  