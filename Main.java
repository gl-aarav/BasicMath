import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int year, scores, years;
    System.out.println("What is the year?");
    year = in.nextInt();
    scores = year/20;
    System.out.println("Scores: " + scores);
    years = year%20;
    System.out.println("Years: " + years);
  }
}