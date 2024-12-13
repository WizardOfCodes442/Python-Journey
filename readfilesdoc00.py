#it is also possible to read file line by line with a while
f = open('script1.py')
while True:
    line = f.readline()
    if not line: break
    print(line.upper(), end='')

#or using the iterator based for-loop version
#use file iterators to read files, lines by lines
# calls __next__, catches StopIteration

for line in open('script1.py'):
    print(line.upper(), end="")

# The older, original way to achieve the same effect with a for loop 
# is to call the file readlines method to load the file's content
# into memory as a list of line strings

for line in open('script1.py').readlines():
    print(line.upper(), end="")


#but this approach performs poorly in terms of memory usage