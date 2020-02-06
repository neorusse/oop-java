// Creating a class

class ClassName { // Class name
  ...

    // Main method
    public static void main(String args[]) {
        ClassName obj = new ClassName(); // className object

    }
}

// Implementation of Car Class

class Car { // Class name

    // Class Data members
    int topSpeed;
    int totalSeats;
    int fuelCapacity;
    String manufacturer;

    // Class Methods

    void refuel();
    void park();
    void drive();
}

// Access Modifier - Private

// Data Members are usually private

class Cop {

    private int gun; // We have explicitly defined that the variable is private
    // ...
}

// Access Modifier - Public

// Member functions are usually public as they provide the interface through which the application can communicate with our private members.

class Cop {
    private int gun; // Private variable

    public int getGun(){
        return gun;  // The private variable is directly accessible over here!
    }
}

// Public members of a class can be accessed by a class object using the . operator. For example,
// if we have an object c of type Cop, we could access getGun() like this:

    Cop c = new Cop(); // Object created
    c.getGun(); // Can access the gun
        c.gun = 0; // This would cause an error since gun is private

// STATIC FIELDS

class Car {

    // static fields
    static int speed;
    static int capacity;

}

// Static fields reside in the class. We don’t need an instance of the class to access static fields.
// We can access the static fields of a class by just writing the class name before the field:

// Static fields are accessible in the main
System.out.println(Car.speed);
System.out.println(Car.capacity);

// NON-STATIC FIELDS

class Car {

    // Non-Static Fields
    int speed;
    int capacity;

}

// As non-static fields doesn’t reside in the class, So we need an instance of the class to access non-static fields.

Car obj1 = new Car();

System.out.println(obj1.speed);
System.out.println(obj1.capacity);

// FINAL FIELDS

class Car {
    // Final field of capacity = 4
    // Now Capacity can nerver be changed from 4
    // to some other value throught the program
    final int capacity = 4;
}

class Demo {

    public static void main() {

        Car car = new Car();
        car.capacity = 5; // Trying to change the capacity value
    }

}

// Car class has the capacity equals to 4 which can’t be changed. If you try to do so, you will get a compilation error:
// can't assign a value to final variable capacity.

// METHOD

class Car {

    // Public method to print speed
    public void printSpeed(int speed) {
        System.out.println("Speed: " + speed);
    }

}

class Demo {

    public static void main(String args[]) {
        Car car = new Car();
        car.printSpeed(100); // calling public method
    }

}

// SET & GET METHOD

class Car {

    private int speed; // member field speed

    // Setter method to set the speed of the car
    public void setSpeed(int x) {
        speed = x;
    }

    // Getter method to get the speed of the car
    public int getSpeed() {
        return speed;
    }

}

class Demo {

    public static void main(String args[]) {
        Car car = new Car();
        car.setSpeed(100); // calling the setter method
        System.out.println(car.getSpeed()); // calling the getter method
    }

}

// METHOD OVERLOADING

class Calculator {

    public double product(double x, double y) {
        return x * y;
    }

    // Overloading the function to handle three arguments
    public double product(double x, double y, double z) {
        return x * y * z;
    }

    // Overloading the function to handle int
    public int product(int x, int y){
        return x * y;
    }

}

class Demo {

    public static void  main(String args[]) {
        Calculator cal = new Calculator();

        double x = 10;
        double y = 20;
        double z = 5;

        int a = 12;
        int b = 4;

        System.out.println(cal.product(x, y));
        System.out.println(cal.product(x, y, z));
        System.out.println(cal.product(a, b));
    }

}

// Default Constructor

class Date {

    private int day;
    private int month;
    private int year;


    // Default constructor
    public Date() {
        // We must define the default values for day, month, and year
        day = 0;
        month = 0;
        year = 0;
    }

    // A simple print function
    public void printDate(){
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

}

class Demo {

    public static void main(String args[]) {
        // Call the Date constructor to create its object;
        Date date = new Date(); // Object created with default values!
        date.printDate();
    }

}