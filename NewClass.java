
package com.mycompany.mycomputerworkshop;

public class NewClass 
{
    public void studentage()
    {        
    int age = 0; 
        age = age + 5; 
         System.out.println("Student Age is ="+age);
}
 public static void main(String[] args)
    {           
        NewClass obj= new NewClass();
        obj.studentage(); 
        // local variable age
        int age=10;
        System.out.println("Student Age is ="+age);
    }

}



