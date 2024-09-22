import java.util.Scanner;
class Q2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int Height, feet, inches;
    System.out.println("How tall are you in inches?");
    Height = in.nextInt();
    feet = Height/12;
    System.out.println("You are:");
    System.out.println("Feet: " + feet);
    inches = Height%12;
    System.out.println("Inches: " + inches);
  }
}