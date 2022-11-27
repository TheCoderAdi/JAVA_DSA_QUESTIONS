import java.util.*;

class Main {
  public static void main(String[] args) {
    // Divide Pepole into 3 age groups
    // -> children > Below 12
    // -> Teenager > Between 12 and 18
    // -> Adult > Above 18
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age : ");
    age = sc.nextInt();
    if (age <= 12) {
      System.out.println("You are a children");
    } else if (age > 12 && age < 18) {
      System.out.println("You are a teenager");
    } else {
      System.out.println("You are an adult");
    }
    sc.close();
  }
}