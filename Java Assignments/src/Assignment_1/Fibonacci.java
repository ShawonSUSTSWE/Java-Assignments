/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

/**
 *
 * @author Shawon
 */
public class Fibonacci {
    
    int fibonacci ( int n )
    {
        if ( n == 1 )
            return 0;
        else if ( n == 2 )
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2); 
    }
}
