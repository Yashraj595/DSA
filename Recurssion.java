package DSA;
import java.util.Scanner;
public class Recurssion {
  public static int factorial(int n) {

    if (n == 0) {
      return 1;
    }

    int factNminus1 = factorial(n - 1);
    int fact = n * factNminus1;

    return fact;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int n = sc.nextInt();
    int ans = factorial(n);

    System.out.println("Factorial is: " + ans);
     
  }
}
