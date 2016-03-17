package week2;

import java.util.*;

public class GCD {
  private static int gcd(int a, int b) {
  	int max =(a>b)?a:b;
  	int min =(a<b)?a:b;

    return (max%min!=0)?gcd(min, max%min):min;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd(a, b));
  }
}
//int current_gcd = min;
/*for(int d = 2; d <= a && d <= b; ++d) {
  if (a % d == 0 && b % d == 0) {
    if (d > current_gcd) {
      current_gcd = d;
    }
  }
}*/
