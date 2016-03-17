package week3;

import java.util.Scanner;

public class Change {
	//this is function change money using greedy algorithm
    private static int getChange(int n) {
        int[] xchange = {10,5,1}; 
        int currentSum = 0; int i=0; int count =0;
        for(;i < xchange.length; i ++){
        	currentSum += xchange[i];
        	if(currentSum >= n) break;
        	count++;
        }
        currentSum -= xchange[i-1];
        for(;i < xchange.length; i ++){
        	if(currentSum + xchange[i]==n)
        		return count + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));

    }
}

