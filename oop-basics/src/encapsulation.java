// A Bad Example of Implementing a user login feature

// User Class
class User {

  // Public Fields
  public String userName;
  public String password;

  // Parameterized Constructor to create new users
  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public void login(String userName, String password) {
    //Check if the username and password match
    if (this.userName.toLowerCase().equals(userName.toLowerCase()) && this.password.equals(password)) {
      // .toLowrcase converts all the characters to lowercase & .equals checks if two strings match

      System.out.println("Access Granted against the username: "+this.userName +" and password: "+this.password);
    }
    else System.out.println("Invalid Credentials!"); //Else invalid credentials
  }

}

class Main {

  public static void main(String[] args) {
    // Creating an Instance (Object) of our User class
    User educative = new User("Educative","12345"); //Creates a new user and stores the password and username

    educative.login("Educative","12345"); //Grants access because credentials are valid

    educative.login("Educative", "3456"); //Does not grant access because the credentials are invalid

    educative.password = "3456"; //OOPS SOMEONE ACCESSED THE PASSWORD FIELD

    educative.login("Educative", "3456"); // GRANTS ACCESS BUT THIS SHOULD NOT HAVE HAPPENED!
  }

}

// Output

// Access Granted against the username: Educative and password: 12345
// Invalid Credentials!
// Access Granted against the username: Educative and password: 3456

// In the above coding example, we can observe that anyone can access, change or print the password
// and userName fields directly from the main() method. This is dangerous in the case of this
// User class because there is no encapsulation of the credentials of a user and anyone can access
// their account by manipulating the stored data. So the above code was not a good coding convention.


// A Good Example of Implementing a user login feature

// User Class
class User {

  // Private fields
  private String userName;
  private String password;

  //Parameterzied constructor to create new users
  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public void login(String userName, String password) {
    //Check if the username and password match
    if (this.userName.toLowerCase().equals(userName.toLowerCase()) && this.password.equals(password)) {
      // .toLowrcase converts all the characters to lowercase & .equals checks if two strings match

      System.out.println("Access Granted against the username: "+this.userName +" and password: "+this.password);
    }
    else System.out.println("Invalid Credentials!"); //Else invalid credentials
  }

}

class Main {

  public static void main(String[] args) {
    // Creating an Instance (Object) of our User class
    User educative = new User("Educative","12345"); //Creates a new user and stores the password and username

    educative.login("Educative","12345"); //Grants access because credentials are valid

    educative.login("Educative", "3456"); //Does not grant access because the credentials are invalid

    // educative.password = "3456"; //Uncommenting this line will give an error
    //Fields of User class cannot be accessed now
  }

}