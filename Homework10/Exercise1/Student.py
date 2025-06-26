class Student:
    def __init__(self, age, name):
        self._age = age
        self._name = name

    def toString(self):
        print("Name:", self._name, "Age:", self._age)

if __name__ == '__main__':
    student = Student(20, "Marc")
    student.toString()