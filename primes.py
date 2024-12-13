primes = [] #this will contain the prime in the end
upto = eval(input("Enter the limit to get prime to... \n")) # the limit inclusive
for n in range(2, upto+1):
  is_prime =True #flag, new at each iteration of outer for 
  for divisor in range(2, n):
    if n % divisor == 0:
      is_prime = False
      break
  if is_prime: #check on the flag
    primes.append(n)
  print(primes)
  