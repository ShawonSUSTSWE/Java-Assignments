/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//This is the example of recursion. It is related to Fibonacci.java 

package Assignment_1;

/**
 *
 * @author Shawon
 */
public class Recursion {
    
    public static void main(String[] args) {
        
        Fibonacci fibs = new Fibonacci();
        
        System.out.println("Fibonacci Series : ");
        
        for ( int i = 1; i <= 40; i++ )
        {
            System.out.println(fibs.fibonacci(i));
        }
    }
}
