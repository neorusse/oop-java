// Calling a Constructor from a Constructor

// A class can have multiple parameterized constructors which can call each other.

// Car class
class Car {

  // Private Fields
  private String carName;
  private String carModel;
  private String carCapacity;

  // Default Constructor
  public Car() {
    this.carName = "";
    this.carModel = "";
    this.carCapacity = "";
  }

  // Parameterized Constructor 1
  public Car(String name, String model) {
    this.carName = name;
    this.carModel = model;
  }

  // Parameterized Constructor 2
  public Car(String name, String model, String capacity) {
    this(name, model); // calling parameterized Constructor 1
    this.carCapacity = capacity; // Assigning capacity
  }

  // Method to return car details
  public String getDetails() {
    return this.carName + ", " + this.carModel + ", " + this.carCapacity;
  }

}

class Demo {

  public static void main(String args[]) {
    // Instance of our Car class above (Object)
    Car car = new Car("Ferrari", "F8", "100");
    System.out.println(car.getDetails());
  }

}

// NB: Nothing stands alone in Java unlike JavaScript. Everything must be wrapped in a class.
// Hence when creating an Instance of our Car class above, we wrap it with a Demo class.


// Calculate the Student's Total Marks

class Student {

  // Private fields
  private String name;
  private double mark1;
  private double mark2;

  // Default Constructor
  public Student() {
    name = "";
    mark1 = 0;
    mark2 = 0;
  }

  // Parameterized Constructor
  public Student(String name, double mark1, double mark2) {
    this.name = name;
    this.mark1 = mark1;
    this.mark2 = mark2;
  }

  // Getter Function
  public double getMarks(int markNumber) {

    if(markNumber == 1)
      return mark1;
    else if(markNumber == 2)
      return mark2;
    return 0;
  }

  public double calcTotal() {
    // Write definition here
    double totalMarks = mark1 + mark2;
    return totalMarks;
  }
}

class Demo {

  public static void main(String args[]) {
    Student student = new Student("Jack", 60, 70);
    System.out.println(student.calcTotal());
  }

}