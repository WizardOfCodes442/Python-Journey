#the for loop has different construct and they are as below
surnames = ['Rivest', 'Shamir', 'Adleman']
for position in range(len(surnames)):
  print(position, surnames[position])

#this can also be in the form 
surnames = ['Rivest', 'Shamir', 'Adleman']
for surname in surnames:
  print(surname)

# you can use the enumerate built-in function to print and the list content
surnames = ['Rivest', 'Shamir', 'Adleman']
for position, surname in enumerate(surnames):
  print(position, surname)
  