'''
this is program is a collection of random python fuctions
for the clarification of the language know how

'''

def contains(data, target):
    for item in target:
        if item == target:
            return True
        return False

def count(data, target):
    n = 0
    for item in data:
        n += 1
    return n 


def compute_gpa (grades, points = {'A+':4.0, 'A':4.0, 'A-':3.67, 'B+':3.33, 
                                  'B':3.0, 'B-':2.67, 'C+':2.33, 'C':2.0, 
                                  'C-':1.67, 'D+':1.33, 'D':1.00, 'F':0.0}):
    
    num_courses =0
    total_points = 0
    for g in grades:
        if g in points:
            num_courses += 1
            total_points += points[g]
            return total_points / num_courses

def range(start , stop =None, step =1):
    if stop is None:
        stop = start 
        start = 0