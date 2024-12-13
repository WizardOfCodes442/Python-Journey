# using range to generate the offsets of items in a string, rather
# than those item at those offsets.
#but in some programs, though, we need both; the item to use
# plus an offset as we go
#Traditionally this was coded with a simple for loop that also kept 
#a counter of the current offset

S = 'spam'
offset = 0
for item in S:
    print(item, 'appears at offset', offset)
    offset += 1

#This works, but in recent Python releases, a new built-in named enumerate
# does the job for us

S = 'spam'
for (offset, item) in enumerate(S):
    print(item, 'appears at offset', offset)

# The enumerate function returns a generator object - a kind of object
# that support the iteration protocol, it has a __next__ method 
# called by the next built-in function, which returns an (index, value)
# tuple each time through the loop. we can unpack these tuples 
# with tuple assignment in the for loop

