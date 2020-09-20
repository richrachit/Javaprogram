
package com.mycompany.mycomputerworkshop;

public class NewMain3 {

   
    public static void main(String[] args) 
    {
        // create string using the new keyword
    String example = new String("Hello World");

    // returns the substring World
    System.out.println("Using the subString(): " + example.substring(7));

    // converts the string to lowercase
    System.out.println("Using the toLowerCase(): " + example.toLowerCase());

    // converts the string to uppercase
    System.out.println("Using the toUpperCase(): " + example.toUpperCase());

    // replaces the character '!' with 'o'
    System.out.println("Using the replace(): " + example.replace('!', 'o'));
    }
    
}



