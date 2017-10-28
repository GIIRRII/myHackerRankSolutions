import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
        if(initialAge>-1)
            this.age = initialAge;
        else
            {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
  		// Add some more code to run some checks on initialAge
	}

	public void amIOld() {
        String str = "";
        if(this.age<13)
            {
            str = "You are young.";
        }else if(this.age >=13&& this.age<18)
            {
            str = "You are a teenager.";
        } else
            {str = "You are old.";}
  		// Write code determining if this person's age is old and print the correct statement:
        System.out.println(str);
	}

	public void yearPasses() {
        this.age++;
  		// Increment this person's age.
	}


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
