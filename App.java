public class App {

  public static void main(String[] args) {
    PersonalData person = new PersonalData("John", 30, "123 Main St");

    // Accessing and modifying name
    System.out.println("Original Name: " + person.getName());
    person.setName("Dikri");
    System.out.println("Updated Name: " + person.getName());

    // Accessing and modifying age
    // Since age is private, you can't do: person.age = 35;
    System.out.println("Original Age: " + person.getAge());
    person.setAge(18);
    System.out.println("Updated Age: " + person.getAge());

    // Accessing and modifying address
    // Since address is private, you can't do: person.address = "456 Elm St";
    System.out.println("Original Address: " + person.getAddress());
    person.setAddress("Cibolang");
    System.out.println("Updated Address: " + person.getAddress());

    // Displaying personal data
    person.displayPersonalData();
  }
}
