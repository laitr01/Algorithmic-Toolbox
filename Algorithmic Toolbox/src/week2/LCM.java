package week2;

import java.util.*;

public class LCM {
  private static int gcd(int a, int b) {
  	int max =(a>b)?a:b;
  	int min =(a<b)?a:b;

    return Math.abs((max%min!=0)?gcd(min, max%min):min);
  }
  private static long lcm(int a, int b) {
    //write your code here

    return ((long)a*b)/gcd(a, b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
  }
}
