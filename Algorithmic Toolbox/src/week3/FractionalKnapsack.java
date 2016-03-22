package week3;
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
    	double temp;
    	int size = values.length;
    	if(capacity ==0) return 0;
    	double[] profits = new double[size];
    	
    	
    	for(int i =0; i < size; i++){
    		profits[i] = (double)values[i]/weights[i];
    	}
    	for(int i =0; i < size-1; i++){
    		for(int j = i+1; j < size; j++){
    			if(profits[j] > profits[i]){
    				temp = profits[j];
    				profits[j] = profits[i];
    				profits[i] = temp;
    				
    				temp = weights[j];
    				weights[j] = weights[i];
    				weights[i] = (int)temp;
    				
    				temp = values[j];
    				values[j] = values[i];
    				values[i] = (int)temp;
    			}
    		}
    	}
    	double currentSum = 0.0; int k=0; 
    	int m = 0; int cap =0;

		for(k =0; k < size; k++){
			cap =0;
			while(m <= capacity){
				m +=1; cap++;
			
				//if(m >= capacity) break;
				
				currentSum += profits[k];
				
				if(m==capacity) return currentSum;
				if(cap == weights[k]) break;
			}

    	}
		
    	
        return currentSum;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
    
} 
