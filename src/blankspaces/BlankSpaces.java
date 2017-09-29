/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blankspaces;

import java.util.Scanner;

/**
 * Chapter 4 Exercise 8
 *
 * Write a program that will count the number of blank characters in a given
 * string.
 *
 * @author skiroc
 */
public class BlankSpaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instance variables 
        Scanner kb = new Scanner(System.in);
        String sentence = "";
        int blankSpaceCount = 0;
        
        // Prompting the user to enter a sentence.
        System.out.println("Write a sentence: ");
        sentence = kb.nextLine();
        
        // Looping through the sentence and checking for blank spaces.
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isWhitespace(sentence.charAt(i))) {
                blankSpaceCount++;
                
            }  
        }
        // Displaying number of blank spaces in user's sentence
        System.out.println("Your sentence has " + blankSpaceCount + " blank space(s)!");
    }
}
