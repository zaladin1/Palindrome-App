package com.codwithzayn;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your factorial number");
        int fact = scanner.nextInt();
        int result = 1;
       
      
        for (int i = fact; i >=1 ; i--) {
            result = result * i;
        }

        System.out.println(result);


    






        }


    }
