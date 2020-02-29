/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// ObjPass1 and ObjPass2 both shows the same methods of passing objects

package Assignment_1;

/**
 *
 * @author Shawon
 */
public class Objpass1 {
   
    public static void main(String[] args) {
        
        Test test1 = new Test(100, 200);
        Test test2 = new Test(100, 200);
        Test test3 = new Test(10, 20);
        
        System.out.println("test1 = test2 :: " + test1.isEqual(test2));
        System.out.println("test1 = test3 :: " + test1.isEqual(test3));
        
    }
}
