/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findingtheprimes;

/**
 *
 * @author simmp
 */
public class FindingthePrimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j, k;
        boolean isprime;
        for(i = 2; i <= 100; i++) {
            isprime = false;
            k = 0;
            
            for(j = i; j > 0; j--) {
                if(i % j == 0) k++;
            }
            
            if(k <= 2) isprime = true;
            
            if(isprime == true)
                System.out.println(i + " is a prime number.");
        }
    }
    
}
