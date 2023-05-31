package Sieve;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		// Get number to check
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer to check: ");
		int n = scanner.nextInt();
		scanner.close();
		
		// Get sieve results
		System.out.println("Prime numbers less than or equal to " + n + ":");
		Sieve sieve = new Sieve();
		sieve.getSieve(n);
	}

	protected void getSieve(int n) {
		
		boolean prime[] = new boolean[n+1];
		
        for(int i=0;i<=n;i++) {
            prime[i] = true;
        }
         
        for(int p = 2; p*p <=n; p++) {
        	
            if(prime[p] == true) {
            	
                for(int i = p*p; i <= n; i += p) {
                    
                	prime[i] = false;
                }
            }
        }
         
        for(int i = 2; i <= n; i++) {
            
        	if(prime[i] == true) {
            	
                System.out.print(i + " ");
            }
        }
        
        // Java Program for Sieve of Eratosthenes. (2021). GeeksforGeeks. 
        //    https://www.geeksforgeeks.org/java-program-for-sieve-of-eratosthenes/#
	}
}