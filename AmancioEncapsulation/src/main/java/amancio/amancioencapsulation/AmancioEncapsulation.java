package amancio.amancioencapsulation;

import Ron.Jamelle;
import java.util.Scanner;

public class AmancioEncapsulation {

     public static void main(String[] args) {                   
        Scanner info = new Scanner(System.in);
        System.out.print("Enter test case number: ");
        int stinfo = info.nextInt();

        switch (stinfo) {
            case 1:
                System.out.println("Test Case 1: Student under 18");
                Jamelle student1 = new Jamelle("Jemar Jude", "Maranga", 17, false); 
                System.out.println(student1);
                break;
            case 2:
                System.out.println("Test Case 2: Increase age of student1");
                Jamelle student2 = new Jamelle("Jemar Jude", "Maranga", 17, false); 
                student2.increaseAge();
                System.out.println(student2);
                break;
            case 3:
                System.out.println("Test Case 3: Student over 18");
                Jamelle student3 = new Jamelle("Jose", "Cruz", 19, false); 
                System.out.println(student3);
                break;
            default:
                System.out.println("Invalid test case number.");
        }

        info.close();
    }
}
