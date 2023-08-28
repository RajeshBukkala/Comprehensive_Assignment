import math

class CircleComp:

    def area_of_the_circle(Radius):
        area = Radius ** 2 * math.pi
        return area

    def circumference_of_the_circle(Radius):
        circumference = 2 * math.pi * Radius
        return circumference

    def diameter_of_the_circle(Radius):
        diameter = 2 * Radius
        return diameter

Radius = float(input("Please enter the radius of the given circle: "))
print("The area of the given circle is:", CircleComp.area_of_the_circle(Radius))
print("The circumference of the given circle is:", CircleComp.circumference_of_the_circle(Radius))
print("The diameter of the given circle is:", CircleComp.diameter_of_the_circle(Radius))