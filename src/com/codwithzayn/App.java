package com.codwithzayn;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * App
 */
public class App {

    public static void main(String[] args) {

    // Initiate a scanner and collect the user input to a word.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");

     // the inputted word is stored in the variable word   
        String word = scanner.next();
        String reverse ="";
        char ch;

        
       
      // The following for loop, returns the inverse of the inputted word.  This inversed word is stored into the reverse variable.
        for (int i = word.length(); i >=0 ; i--) {
            ch = word.charAt(i);
            reverse = reverse + ch;
        }


        System.out.println(word);
        System.out.println(reverse);


        // This is an if else statement, saying that if both the inputted word and the reversed word are the same, then it is a palindrome, otherwise it is not a palindrome. 
        // The program is not case sensitive.
        if (word.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println("Input string is palindrome");
        } else {
            System.out.println("Input string is not palindrome");
            
        }

       

       

        }


    }
