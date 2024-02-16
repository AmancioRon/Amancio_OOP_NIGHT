package ivanasolution.ivanaproblemsv2;

import java.util.Scanner;

public class IvanaProblemsV2 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message to Ivana: ");
        String msg = scanner.nextLine();
        int misplaced = 0;
        for (int i = 1; i < msg.length(); i++) {
            char char1 = msg.charAt(i), char2 = msg.charAt(i - 1);
            if (Character.isUpperCase(char1) && !Character.isWhitespace(char2)) {
                misplaced = 1;
                break;
            }
        }
        System.out.println(misplaced == 1 ? "JEJE!" : "uWu");
    }
}