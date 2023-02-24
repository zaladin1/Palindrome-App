package com.codwithzayn;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.next();
        String reverse ="";
        char ch;

        
       
      
        for (int i = word.length(); i >=0 ; i--) {
            ch = word.charAt(i);
            reverse = reverse + ch;
        }

        System.out.println(word);
        System.out.println(reverse);

        if (word.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println("Input string is palindrome");
        } else {
            System.out.println("Input string is not palindrome");
            
        }

       

       

        }


    }
