// HOW TO CALL THE OVERRIDDEN METHOD OF A SUPERCLASS

// When a method in a derived class overrides a method in a base class,
// it is still possible to call the overridden method using the super keyword.

// If you write super.method(), it will call the method that was defined in the superclass.

// Base Class
class Shape {

  // Private Data Members
  private String name;

  public Shape() { // Default Constructor
    name = "Shape";
  }

  // Getter Function
  public String getName() {
    return name;
  }

}

// Derived Class
class XShape extends Shape {

  private String name;

  public XShape(String name) { // Default Constructor
    this.name = name;
  }

  // Overridden Method
  public String getName() {
    return super.getName() + ", " + this.name;
  }

}

class Demo {

  public static void main(String args[]) {

    Shape circle = new XShape("Circle");
    System.out.println(circle.getName());

  }
}

// Output: Shape, Circle

// Explanation

// Line 36: The super() keyword is used to call the Base Class method getName().
// With the help of the super keyword, the method returns the base class name,
// and then we append it with the derived class name before returning.