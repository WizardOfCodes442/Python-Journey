#itertools module 
#According to the python official documentation, the itertool module is
#A module which implements a number of iterator building blocks inspired 
#by constructs from APL , Haskell, and SML. Each has been recast into a 
# form suitable for python. The Module standardizes a core set of fast
#memory efficient tools, that are useful by themselves or in combination
#Together, they form an iterator algebra making it possible to construct 
#specialized tools succintly and efficiently in python

#In a nutshell it provides you with three  broad categories of iterators 
#Infinite iterator allow you to work with a for loop in a different fashionNS
#like if it was a while loop

from itertools import count
for n in count(5, 3):
  if n > 20:
    break
  print(n, end=", ") #instead of a newline, comma and space