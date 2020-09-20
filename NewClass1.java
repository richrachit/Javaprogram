
package com.mycompany.mycomputerworkshop;

public class NewClass1 
{
     public static void main(String[] args)
    {        
        // first object 
        Marks obj1 = new Marks(); 
        obj1.engMarks = 55; 
        obj1.mathsMarks = 85; 
        obj1.phyMarks = 95; 
        
         // second object 
        Marks obj2 = new Marks(); 
        obj2.engMarks = 80; 
        obj2.mathsMarks = 60; 
        obj2.phyMarks = 70; 
        
        
        // displaying marks for first object 
        System.out.println("Marks for first object:"); 
        System.out.println(obj1.engMarks); 
        System.out.println(obj1.mathsMarks); 
        System.out.println(obj1.phyMarks); 
        
        
        // displaying marks for second object 
        System.out.println("Marks for second object:"); 
        System.out.println(obj2.engMarks); 
        System.out.println(obj2.mathsMarks); 
        System.out.println(obj2.phyMarks); 
        
        
    }

}

class Marks   // we have created this class
{
    // These variables are instance variables. 
    // These variables are in a class 
    // and are not inside any function 
    int engMarks; 
    int mathsMarks; 
    int phyMarks; 
}




