class Student:

    def __init__(self, name):
        self._name = name
        self._grades = {}

    def setGrades(self, course, grade):
        self._grades[course] = grade

    def getAverage(self):
        sum = 0
        for key, values in self._grades.items():
            sum += values
        return sum / len(self._grades)


if __name__ == '__main__':
    student = Student('Marc')
    student.setGrades("oose", 1.0)
    student.setGrades("swt", 1.0)
    student.setGrades("ti", 3.0)
    student.setGrades("ra", 5.0)
    print("Average:", student.getAverage())