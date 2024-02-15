
package ivanasolution.ivanaproblems;

import java.util.Scanner;

public class IvanaProblems {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message to Ivana: ");
        String message = scanner.nextLine();
        Misplaced(message);
    }
    
    public static void Misplaced(String message) {
        boolean misplaced = false;
        
        for (int i = 1; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            char prevChar = message.charAt(i - 1);
            
            if (Character.isUpperCase(currentChar)) {
                if (!Character.isWhitespace(prevChar)) {
                    misplaced = true;
                    break; 
                }
            }
        }

        if (misplaced) {
            System.out.println("JEJE!");
        } else {
            System.out.println("uWu");
        }
    }
}
            
            
            
           
        
        
           
           
  
