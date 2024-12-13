'''
defining dictionary without using excessive quotes
'''
def makedict(**kwargs):
    return kwargs

data = makedict(red=1, green = 2, blue=3)

"""
you might also forgo simplicity to gain more power
"""
def dodict(*args, **kwds):
    d = {}
    for k, v in args: d[k] = v
    d.update(kwds)
    return d

tada = dodict(*data.items( ), yellow=2, green=4)

"""
This recipe presents a technique that avoids having to quote the keys, when they are identifiers that 
you already know at the time you write the code
"""

%dat = (red => 1, green => 2)

"""
you need to obtain a value from a dictionary , without having to handle an exception 
if the key you seek is not in the dictionary
that's what the get method of dictionaries is for 
say you have a dictionary
"""
d = {'key': 'value'}
#you can write a test to pull out the values of 'key'
#from d in an exception safe way

if d.has_key('key'): #or in python 2.2 or later: if 'key' in d:
    print(d['key'])
else:
    print("not found")

#however there is a much simpler syntax

"""
working with a dictionary D , you need to use the entry D[k], if it's already present , or add a 
new D[k] if k isn't yet a key in D

This is what the set default method of dictionary objects is for . 
say we are building a word-to-page numbers index . A key piece of code might be 
"""
theIndex = {}
def addword(word, pagenumber):
    if theIndex.has_key(word):
        theIndex[word].append(pagenumber)
    else:
        theIndex[word] = [pagenumber]

def addword(word, pagenumber):
    try: theIndex[word].append(pagenumber)
    except AttributeError: theIndex[word] = [pagenumber]

#Here is how using setDefault simplifies this further

def addword(word, pagenumber):
    theIndex.setddefault(word, []).append(pagenumber)
