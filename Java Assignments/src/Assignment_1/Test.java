/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//This file is related to ObjPass1.java

package Assignment_1;

/**
 *
 * @author Shawon
 */
public class Test {
    
    int height, width;
    
    Test(int height, int width) {
        this.height = height;
        this.width = width;
    }
    
    //Passing objects using them as the data type
    boolean isEqual ( Test obj ) {
        if ( obj.height == height && obj.width == width )
            return true;
        else return false;
    }
}

