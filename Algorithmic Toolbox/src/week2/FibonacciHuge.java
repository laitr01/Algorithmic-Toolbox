package week2;
import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHuge(long n, long m) {
    	long[] F = new long[(int) (n+1)];
    	F[0] = 0;
    	F[1] = 1;
    	for(int i = 2; i <=n; i ++){
    		F[i] = (F[i-1] + F[i-2])%m;
    	}
        return F[(int) n];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n, m));
    }
}

