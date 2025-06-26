import math
from abc import ABC, abstractmethod


class Shape(ABC):
    @abstractmethod
    def getArea(self):
        return 0.0

class Circle(Shape):
    def __init__(self, radius):
        self._radius = radius

    def getArea(self):
        return math.pi * self._radius * self._radius


if __name__ == '__main__':
    circle = Circle(5.0)
    print(circle.getArea())
    