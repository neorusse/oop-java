// POLYMORPHISM AND METHOD OVERRING EXAMPLE

// Here we consider the example of a Shape class, which is the base class while
// many shapes like Rectangle and Circle extending from the base class are derived classes.
// These classes contain the getArea() method which calculates the area for the respective shape.


// A sample class Shape which provides a method to get the Shape's area
class Shape {

  // overriden method
  public double getArea() {
    return 0;
  }

}

// A Rectangle is a Shape with a specific width and height
class Rectangle extends Shape {   // extended from the Shape class

  // Private data members
  private double width;
  private double height;

  // Constructor
  public Rectangle(double width, double heigh) {
    this.width = width;
    this.height = heigh;
  }

  // base class getArea() method being overriden
  // Public method to calculate Area
  public double getArea() {
    return width * height;
  }

}

// A Circle is a Shape with a specific radius
class Circle extends Shape {

  // Private data member
  private double radius;

  // Constructor
  public Circle(double radius) {
    this.radius = radius;
  }

  // base class getArea() method being overriden
  // Public method to calculate Area
  public double getArea() {
    return 3.14 * radius * radius;
  }

}


class driver {

  public static void main(String args[]) {
    // Creating a Shape class array of size 2
    Shape[] shape = new Shape[2];

    // Append cirlce and reactangle object at index position 0 & 1 respectively of the Shape class array
    shape[0] = new Circle(2); // creating circle object at index 0
    shape[1] = new Rectangle(2, 2); // creating rectangle object at index 1

    // Shape object is calling children classes method
    System.out.println("Area of the Circle: " + shape[0].getArea());
    System.out.println("Area of the Rectangle: " + shape[1].getArea());
  }

}

// output

// Area of the Circle: 12.56
// Area of the Rectangle: 4.0

// In the main function of the driver class, we have declared a Shape class array of size 2 and declared the Rectangle
// and the Circle class objects at index 0 and 1 respectively. Now the getArea() method returns
// the area of the respective shape. This is Polymorphism.