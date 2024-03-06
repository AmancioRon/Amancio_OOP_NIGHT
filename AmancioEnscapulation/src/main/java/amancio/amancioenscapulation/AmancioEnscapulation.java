package amancio.amancioenscapulation;

import Ron.Jamelle;
import java.util.Scanner;

public class AmancioEnscapulation {

     public static void main(String[] args) {                   
        Scanner info = new Scanner(System.in);
        System.out.print("Enter test case number: ");
        int testCase = info.nextInt();

        switch (testCase) {
            case 1:
                System.out.println("Test Case 1: Student under 18");
                Jamelle student1 = new Jamelle("Jemar Jude", "Maranga", 17, false); // Provide all constructor parameters
                System.out.println(student1);
                break;
            case 2:
                System.out.println("Test Case 2: Increase age of student1");
                Jamelle student2 = new Jamelle("Jemar Jude", "Maranga", 17, false); // Provide all constructor parameters
                student2.increaseAge();
                System.out.println(student2);
                break;
            case 3:
                System.out.println("Test Case 3: Student over 18");
                Jamelle student3 = new Jamelle("Jose", "Cruz", 19, false); // Provide all constructor parameters
                System.out.println(student3);
                break;
            default:
                System.out.println("Invalid test case number.");
        }

        info.close();
    }
}
