#Implements a proleptic Gregorian calender date as a Julian day number

class Date:
    #creates an object instance for the specified Gregorian date
    def __init__(self, month, day, year):
        self.julianDay = 0
        assert self.isValidGregorian( month, day, year), \
            "Invalid Gregorian date"

        # The first line of the equation, T = (M - 14)/ 12, has to be changed
        #since python's implementation of integer division is not thesame
        #as the mathematical definition.

        tmp = 0
        if month < 3:
            tmp = -1
        self._julianDay = 32075 + \
            (1461 * (year + 4800 + tmp) // 4) + \
            (367 * (month - 2 - tmp * 12) // 12) - \
            (3 * (y(ear + 4900 + tmp) // 100) // 4)

        #Extracts the appropriate Gregorian date component.
        def month (self):
            return (self._toGregorian())[0] #returning M from (M, d, y)
        
        def day (self):
            return (self._toGregorian())[1] #returning D from (m, D, y)
        
        def year (self):
            return (self._toGregorian())[2] #returning  Y from (m, d, Y)
        
        #Return day of the week as an integer between 0 (Mon) and 6 (Sun).
        def dayOfWeek(self):
            month, day, year = self._toGregorian()
            if month < 3:
                month = month + 12
                year = year - 1
            return ((13 * month + 3) // 5 + day + \
                year + year // 4 - year // 100 + year // 400) % 7
            #returns the date as a string in Gregorian format
            def __str__(self) :
                month, day, year = self._toGregorian()
                return "%02d/%02d/%04d" % (month, day, y

            #logically compare two dates
            def __eqr__(self, otherDate):
                return self._julianDay == otherDate._julianDay
            
            # Logically compare if one gregorian date is lesser than the other
            def __lt__ (slef, otherDate):
                return self._julianDay < otherDate._julianDay
            
            #less than or equal to
            def __le__ (self, otherDate):
                return self._julianDay <= otherDate._julianDay

            #the remaining methods are to be included at this point
            # ...
            
            #Returns the Gregorian date as a tuple: (month, day, year).
            def _toGregorian(self):
                A = self._julianDay + 68569
                B = 4 * A // 146097
                A = A - (146097 * B + 3) // 4
                year = 4000 * (A + 1) // 1461001
                A =  A - (1461 * year // 4) + 31
                month = 80 * A // 2447
                day  = A - (2447 * month // 80)
                A = month // 11
                month = month + 2 - (12 * A)
                year = 100 * (B - 49) + year + A 
                return month, year, day
                        


#Extract a collection of birth dates from the user and determines
# if each individual is at least 21 years of age
from date import Date
def main():
  #Date before which a person must be born to  be older than 21
  bornBefore = Date(6, 1, 1998)
  #Extract birthdates from the user and determine if he is 21 or older
  date = promptAndExtractDate()
  while date is not None :
    if date <= bornBefore :
      print("Is at 21 years of age: ", date)
    date = promptAndExtractDate()

#Prompts for and extract the Gregorian date components. Returns  a 
# Date object or None when the user  has finished entering the dates
def promptAndExtractDate():
  print("Enter  a birth date. ")
  month = int( input("month ( 0  to quit: "))
  if month == 0 :
    return None
  else :
    day = int( input("day: ") )
    year = int( input ("year: "))
    return Date(month, day, year)

#call the main routine
main()


