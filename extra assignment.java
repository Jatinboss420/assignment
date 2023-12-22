//queston 1. a
public class PrimitiveTypesExample {
    public static void main(String[] args) {
        // Integer
        int intValue = 42;

        // Double
        double doubleValue = 3.14;

        // Char
        char charValue = 'A';

        // Boolean
        boolean booleanValue = true;

        // Print values
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
    }
}



//questin 1 b
public class IntToDoubleConversion {
    public static void main(String[] args) {
        // Declare and initialize an int variable
        int intValue = 42;

        // Convert int to double
        double doubleValue = (double) intValue;

        // Print the result
        System.out.println("Converted double value: " + doubleValue);
    }


//question 2 a
 class Person:
    def _init_(self, name, age):
        self.name = name
        self.age = age

# Instantiate an object and set values
person1 = Person("John Doe", 25)

  
//question 2 b
public class MyClass {
    public static void printMessage() {
        System.out.println("Hello, this is a static message!");
    }

    public static void main(String[] args) {
        // Calling the static method without creating an object
        MyClass.printMessage();
    }
}


//question 3 a
public class AddIntegers {
    public static void main(String[] args) {
        // Check if there are exactly two command line arguments
        if (args.length != 2) {
            System.out.println("Please provide two integers as command line arguments.");
            return;
        }

        // Parse the command line arguments as integers
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Add the two integers
            int sum = num1 + num2;

            // Print the result
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integers as command line arguments.");
        }
    }
}


//question 3 b
package utilities;

public class Calculator {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}

//question 4 a
class MyClass:
    def _init_(self, attribute1, attribute2):
        self.__attribute1 = attribute1
        self.__attribute2 = attribute2

    def set_attribute1(self, value):
        self.__attribute1 = value

    def set_attribute2(self, value):
        self.__attribute2 = value

    def get_attribute1(self):
        return self.__attribute1

    def get_attribute2(self):
        return self.__attribute2

# Example usage:
obj = MyClass("value1", "value2")

# Accessing attributes using public methods
print(obj.get_attribute1())  # Output: value1
print(obj.get_attribute2())  # Output: value2

# Modifying attributes using public methods
obj.set_attribute1("new_value1")
obj.set_attribute2("new_value2")

# Accessing modified attributes
print(obj.get_attribute1())  # Output: new_value1
print(obj.get_attribute2())  # Output: new_value2

  //question 4 b
  class MyClass:
    def _init_(self, attribute1, attribute2):
        self.attribute1 = attribute1
        self.attribute2 = attribute2

# Example usage:
obj = MyClass("value1", "value2")

# Accessing attributes
print(obj.attribute1)  # Output: value1
print(obj.attribute2)  # Output: value2

  //question 5 a
  class Animal:
    def make_sound(self):
        pass  # Placeholder method to be overridden by derived classes

class Dog(Animal):
    def make_sound(self):
        return "Woof!"

# Example usage:
animal_instance = Dog()
sound = animal_instance.make_sound()
print(sound)  # Output: "Woof!"

  //question 6 a
  public class MyClass {
    private int instanceVariable;

    public void setInstanceVariable(int value) {
        // Using 'this' to refer to the instance variable
        this.instanceVariable = value;
    }

    public int getInstanceVariable() {
        // Returning the value of the instance variable
        return this.instanceVariable;
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Setting the instance variable using the method
        myObject.setInstanceVariable(42);

        // Getting and printing the instance variable
        System.out.println("Instance Variable: " + myObject.getInstanceVariable());
    }
}

//question 6 b
class BaseClass {
    public void baseMethod() {
        System.out.println("Base class method");
    }
}

class DerivedClass extends BaseClass {
    public void derivedMethod() {
        // Using 'super' to call the method from the base class
        super.baseMethod();
        System.out.println("Derived class method");
    }
}

public class MainApp {
    public static void main(String[] args) {
        DerivedClass derivedObject = new DerivedClass();

        // Calling the method from the derived class
        derivedObject.derivedMethod();
    }
}


//question 6 c
// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Concrete class Circle extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Concrete method to calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class Rectangle extending Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor for Rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Concrete method to calculate area for Rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class MainApp {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calculating and printing the areas
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
