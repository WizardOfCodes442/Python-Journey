#Extracts a collection of birth dates from the user and dertimes
# if each individual is at least 21 years of age

from date import Date

def main():
    #Date before which a person must have been born to be 21 or older 
    bornBefore = Date(6, 1, 1988)
    print(bornBefore.day())

    #Extract burthdates from the user and determine if 21 or older
'''    date = promptAndExtractDate()
    while date is not None :
        if date.le(bornBefore) :
            print("Enter a birth date.")
            month = int (input("Month(0 to quit): "))
            if month == 00:
                return None
            else:
                day = int(input("day: "))
                year = int(input("year: "))
            return Date(month, day, year)
'''
def promptAndExtractDate():
  print("Enter  a birth date. ")
  month = int( input("month ( 0  to quit: "))
  if month == 0 :
    return None
  else :
    day = int( input("day: ") )
    year = int( input ("year: "))
    return Date(month, day, year)


main()