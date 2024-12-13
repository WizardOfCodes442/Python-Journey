#an exception is thrown or raised by executing the raise statement
#with an appropriate instance of an exception class as an argument
#that designate the problem

def sqrt(x):
    if not isinstance(x, (int , float)):
        raise TypeError('x must be numeric')
    elif x < 0:
        raise ValueError('x cannot be negative')
    #do the real work here


#built in sum function , which computes a sum of a collection of numbers

def sum(values):
    if not isinstance(values, collections.Iterable):
        raise TypeError('parameter must be an iterable type')
    total =0
    for v in values:
        if not isinstance(v, (int, float)):
            raise TypeError('elements must be numeric ')
        total = total + v
        return total