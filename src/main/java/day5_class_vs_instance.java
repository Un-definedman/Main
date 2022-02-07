
import java.io.*;
import java.util.*;

class Person {

    int age;

    public Person(int initialAge) {
        if (initialAge >= 0) {
            age = initialAge;
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;

        }

    }

    public void amIOld() {

        if (age < 13) {
            System.out.print("You are young.");

        } else if (age >= 13 && age < 18) {
            System.out.print("You are a teenager.");
        } else {
            System.out.print("You are old.");
        }
        System.out.println("");
    }

    public void yearPasses() {

        age++;
    }
}

public class day5_class_vs_instance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
