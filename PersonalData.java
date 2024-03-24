public class PersonalData {

  private String name;
  private int age;
  private String address;

  // Constructor
  public PersonalData(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  // Getter for name (public)
  public String getName() {
    return name;
  }

  // Setter for name (public)
  public void setName(String name) {
    this.name = name;
  }

  // Getter for age (private)
  public int getAge() {
    return age;
  }

  // Setter for age (public)
  public void setAge(int age) {
    this.age = age;
  }

  // Getter for address (private)
  public String getAddress() {
    return address;
  }

  // Setter for address (public)
  public void setAddress(String address) {
    this.address = address;
  }

  // Method to display personal data
  public void displayPersonalData() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Address: " + address);
  }
}
