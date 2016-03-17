package week2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Fib {
  private static long calc_fib(int n) {

    long[] F = new long[n+1]; int i;
    F[0] = 0;
    F[1] = 1;
    for(i = 2; i <= n; i ++){
    	F[i] = F[i - 1] + F[i - 2];
    }
    return F[n];
  }

  public static void main(String args[]) {
	  SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    System.out.println(calc_fib(n));
    System.out.println(format.format(new Date(System.currentTimeMillis())));
  }
}
