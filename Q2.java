import java.util.*;
class Q2{
  public static void main ( String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a day : (1-7)");
    int day = sc.nextInt();

    switch(day){
      case 1 : 
        System.out.println("Monday");
        break;
      case 2 : 
        System.out.println("Tuesday");
        break;
      case 3 :
        System.out.println("Wednesday");
        break;
      case 4 :
        System.out.println("Thursday");
    }
  }
}