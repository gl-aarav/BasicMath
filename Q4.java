import java.util.Scanner;
public class Q4{
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    Float miles, gallons, milespergallon;
    System.out.println("In miles, what is the distance from your office to your house (One way)?");
    miles = in.nextFloat();
    System.out.println("How many gallons of gasoline do you purchase each 5-day week?");
    gallons = in.nextFloat();
    milespergallon=miles*10/gallons;
    System.out.println("Your average miles per gallon is " + milespergallon);
  }
}