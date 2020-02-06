// Implementation of a Student class using the concepts of encapsulation

// Student Class
class Student {

  // Declare Fields Here
  private String name;
  private String rollNumber;

  // Setter method to set the name of the student
  public void setName(String x) {
    name = x;
  }

  // Getter method to get the name of the student
  public String getName() {
    return name;
  }

  // Setter method to set the rollNumber of the student
  public void setRollNumber(String x) {
    rollNumber = x;
  }

  // Getter method to get the rollNumber of the student
  public String getRollNumber() {
    return rollNumber;
  }
}

public class main {

  public static void main(String[] args) {
    // Instance (Object) of our Student class
    Student x = new Student();
    System.out.println(x.getName());
    x.setName("Samantha");
    String student_name = x.getName();
    System.out.println(student_name);

    System.out.println(x.getRollNumber());
    x.setRollNumber("2211");
    String student_rollnum = x.getRollNumber();
    System.out.println(student_rollnum);


  }
}