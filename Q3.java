import java.util.Scanner;
public class Q3{
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    int ounces, pounds, Remainounces;
    System.out.println("Enter the number of ounces:");
    ounces = in.nextInt();
    pounds = ounces/16;
    Remainounces = ounces % 16;
    System.out.println(pounds + " pounds and " + Remainounces + " ounces");
  }
}