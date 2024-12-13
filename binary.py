n =  39
remainders  = []
while n > 0
  remainder = n % 2 #  remainder of division by 2
  remainders.append(remainder)  #we keep track of remainders 
  n //= 2 #we divide n by 2
  
  #reassign the list to its reversed copy and print it
  remainders = remainders[::-1]
  print(remainders)