class DriverException(Exception):
  pass
people  = [('James', 18), ('kirk', 9), ('Lars', 13), ('Robert', 8)]
driver = None
for person, age in people:
  if age >= 18:
    driver = (person, age)

if driver is None:
  raise DriverException('Driver not found')

else:
  print(driver)