#An object capable of returning it members one at a time.
#Examples of iterables include all sequence types (such as list,str, and tuple)
# and some non-sequence types like dict, file objects of any classes you define with
# an __iter__() or __getitem__() method. Iterable can be used in a for loop
# and in many other places where a sequence is needed (zip(), map())
# when an iterable object is passed as an argument to the built-in function iter()
# it returns an iterator for the object. This iterator is good for one pass
# over the set of values
# When using iterables, it is usually not neccessary to call iter() or deal 
# with iterator objects yourself
#The for statement does that automatically for you, creating  a temporary
# unnamed variable to hold the iterator for the duration of the loop

#Python gives us the ability to iterate over iterables, using a type of object called iterator
# According to the official documentation, an iterator is 
#An object representing a stream of data> Repeated calls to the iterator's __next__()
#method (or passing it to the built-in function next()) return succeessive items in the stream.
#When no more data are available, a StopIteration exception is raised instead. At this point,
#the iterator object is exhausted and any further calls to its __next__() method just raise
#StopIteration exception is raised again. Iterators are required to have an __iter__() mmethod
# that returns the iterator object itself so every iterator is also iterable and maybe used in most
#places where other iterable are accepted. One notable exception is code which attempts multiple 
#iteration passes. A container object (such as list) produces a fresh new iterator each time 
# you pass it to the iter() function or use it in a for loop.
#Attempting  this with an iterator will just return the same exhausted iterator object used 
# in the previous iteration pass, making it appear like an empty container

#Let's see an example of how to iterate over two sequence of thesame length
#in order to work on their respective elements in pairs. say we have a list of people
# and a list of numbers representing the age of people in the first list.
#we want to print person/age on one line for all of them 

people = ['Jonas', 'Julio', 'Mike', 'Mez']
ages = [25, 30, 31, 29]
for position in range(len(people)):
  person = people[position]
  age = ages[position]
  print(person, age)

#we can  also have this code written in this form
people = ['Jonas', 'Julio', 'Mike', 'Mez']
ages = [25, 30, 21, 39]
for position, person in enumerate(people):
  age = ages[position]
  print(person, age)

#and we can finally have the code in this form
people = ['Jonas', 'Julio', 'Mike', 'Mez']
ages = [25, 30, 31, 39]
for person, age in zip(people, ages):
  print(person, age)