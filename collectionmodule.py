#when general purpose built in containers aren't enough
#we can find specialized container data types in the collection module
# namedtuple()  A factory function for creating tuple subclasses with named fields
# deque A list-like container with fast appends and pops on either end 
# ChainMap  A dict-like class for creating a single view of multiple mappings
# Counter A dict subclass for counting hashable objects
# OrderDict A dict subclass that remember the order the entries were added
# defaultdict A dict subclass that calls a factory function to supply missing values
# UserDict A wrapper around dictionary objects for easier dict subclassing
# UserList A wrapper around list objects for easier list subclassing
# UserString A wrapper around string objects for easier string subclassing


# Named tuples 
#A namedtuple is a tuple-like object that has fields accessible  by attribute lookup
# as well as being indexable and iterable 

from collections import namedtuple
Vision = namedtuple('Vision', ['left', 'right'])
vision = Vision(9.5, 8.8)
vision.left  #same as vision[0]
vision.right #same as vision[1] but explicit

# if there is a sudden change to the structure of data stored by vision
# the code vbase that relies on it, will still remain solid and it is 
# only a little refactoring that we will need to do
Vision = namedtuple('Vision', ['left', 'combined', 'right'])
vision = Vision(9.5, 9.2, 8.8)
vision.left # still perfect
vision.right #still perfect (though now vision[2])
vision.combined #the new vision[1]


# Defaultdict
# The defaultdict data type
# It allows you to avoid checking, if a key is in dictionary by simply inserting it for you
# for you on your first access attempt, the type is useful and shorten code
# Let's see a quick example: say we are updating the value of age, by adding one year
# If age is not ther, we assume it was zero and we update it to 1
d = {}
d['age'] = d.get('age', 0) + 1 # age not there, we get 0 + 1
d
d = {'age': 39}
d['age'] = d.get('age', 0) + 1 # age is there, we get 40
d
#Now let's see how it would work with a defaultdict data type
#The second line is actually the short version of a 4-lines long if clause
# that we would have write if the dictionaries didn't have the get method.

from collections import defaultdict
dd = defaultdict(int) # int is the default type (0 the value)
dd['age'] += #short for dd['age'] = dd['age'] + 1
dd
dd['age'] = 39
dd['age'] += 1
dd


# ChainMap
#The ChainMap is an extremely nice data type which was introduced in Python 3.3
#It behaves like a normal dictionary but is provided for quickly linking a number 
# of mappings so they can be treated as a single unit
#This is usually much faster than creating one dictionary and running
# multiple update calls on it.
#ChainMap can be used to simulate nested scopes and is useful in templating.
#The underlying mapping are stored in a list, that list is public and can be accessed 
# or updated using the maps attribute. 
# Lookup search the underlying mapping successively until a key is found
#In contrast, writes, updates and deletions only operate on the first mapping
# A very common use case is providing defaults, so let's see an example

from collections import ChainMap
default_connection =  {'host': 'localhost', 'port': 4567}
connection = {'port':5678}
conn = ChainMap(connection, default_connection) #map creation
conn['port'] # port is found in the first dictionary
conn['host'] # host is fetched from the second dictionary
conn.maps #we can see the mapping objects
conn['host'] ='packtpub.com' #let's add host
conn.maps
del conn.maps 
conn['port'] # now port is fetched from the second dictionary
