#for example you, say you had the following keys and values list
keys = ['spam', 'eggs', 'toast']
vals = [1,2,3]

#one solution for turning those list into a dictionary would be 
# to zip the lists and step them through them in parallel with 
# a for loop

list(zip(keys, vals))

D2 = {}
for (k, v) in zip(keys, vals): D2[k] = v

D2
