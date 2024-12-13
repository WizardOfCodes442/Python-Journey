class Cclass2:
    def __init__ (self):
        self._x = None

    @property
    def x (self):
        "I'm the property x"

    @x. setter
    def x(self, value):
        self._x = value

    @x. deleter
    def x(self):
        del self._x