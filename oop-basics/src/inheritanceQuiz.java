// Implementing Derived Class function by using the Base Class functions

// Implement a function getDetails(String carName) of the Derived Class Car
// which takes a string carName and appends it with model, name, and speed.
// We have already implemented the Base Class Vehicle with the member functions
// getModel() and getSpeed() which return the model and speed of the car respectively.


// Base Class
class Vehicle {

  // Private Data Members
  private String speed;
  private String model;

  public Vehicle() { // Default Constructor
    speed = "100";
    model = "Tesla";
  }

  // Getter Function
  public String getSpeed() {
    return speed;
  }

  // Getter Function
  public String getModel() {
    return model;
  }

}

// Derived Class
class Car extends Vehicle {

  public String name; //  Name of a Car

  public Car() { // Default Constructor
    name = "";
  }

  // This function sets the name of the car
  public void setDetails(String name) { // Setter Function
    this.name = name;
  }

  // This function calls the Base class functions and append the result with input
  public String getDetails(String carName) {
    String details = carName + ", " + getModel() + ", " + getSpeed(); // calling Base Class Function
    return details;
  }


  public static void main(String args[]) {
    Car car = new Car();
    System.out.println(car.getDetails("X"));
  }

}

// output

// X, Tesla, 100


// Implementing Derived Class Parametrized constructor

// Implement the constructor Dell(String name) of the Derived Class Dell which takes a
// string, name. We have already implemented the Base Class Laptop with the member
// function getName() and a parameterized constructor.


// Base Class
class Laptop {

  // Private Data Members
  private String name;

  public Laptop() { // Default Constructor
    name = "";
  }

  public Laptop(String name) { // Parametrized Constructor
    this.name = name;
  }

  // Getter Function
  public String getName() {
    return name;
  }

}

// Derived Class
class Dell extends Laptop {

  public Dell() { // Default Constructor

  }

  public Dell(String name) { // Parametrized Constructor
    // calling the constructor of the SuperClass: Laptop(String name)
    super(name);
  }

  public String getDetails() {
    return getName();
  }

  public static void main(String args[]) {
    Dell dell = new Dell("Dell Inspiron");
    System.out.println(dell.getDetails());

  }

}

// output: Dell Inspiron