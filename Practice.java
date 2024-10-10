import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // int num1 = 5.8;
        // double num2 = num1; IMPLICIT CONVERTION

        // double num1 = 5.8;
        // int num2 = (int)num1; //EXPLICIT CONVERTIOIN

        // int nums[] = {1,8,4,9,6,7,5,3};
        // int n = nums.size();
        // for(int i=0;i<n;i++) {
        // if (nums[i] % 2 == 0)
        // System.out.println(nums[i]); //Did'nt get output
        // }

        // int num1 = 16;
        // int num2 = 9;
        // System.out.println(num1 + num2);
        // System.out.println(num1 % num2);

        // int number = 10;
        // number += 5;
        // number -= 5;
        // number *= 5;
        // number %= 3;
        // number /= 5;
        // System.out.println(number);

        // Arithmetic Operators

        // int num1 = 15;
        // int num2 = 12;
        // System.out.println(num1 == num2);
        // System.out.println(num1 != num2);
        // System.out.println(num1 < num2);
        // System.out.println(num1 <= num2);
        // System.out.println(num1 > num2);
        // System.out.println(num1 >= num2);

        // Logical Operator's

        // int age = 45;
        // System.out.println(age >= 18 && age <= 45); // AND operator
        // boolean isStudent = true;
        // boolean isMember = false;
        // System.out.println(isStudent || isMember); // OR operator

        // STRING'S

        // String name = "Sathvik";
        // String name2 = new String("Sathvik");
        // System.out.println(name2 == name);

        // String name = "Sathvik Dixit";
        // int age = 20;
        // String company = "asdf";
        // double gpa = 9.1;
        // char grade = 'A';
        // String formattedString = String.format("Hey my name is %s I am %d years old,
        // I work in %s my gpa is %f and grade is %c.",name,age,company,gpa,grade);
        // System.out.println(formattedString);

        // String hesaru = "Sathvik Dixit";
        // String hesaru2 = new String("Sathvik dixit");
        // System.out.println(hesaru.length());
        // System.out.println(hesaru.toUpperCase());
        // System.out.println(hesaru.toLowerCase());
        // System.out.println(hesaru2 == hesaru);

        // String name = new String("Sathvik Dixit");
        // String name2 = new String("sathvik dixit");
        // System.out.println(name.equalsIgnoreCase(name2));

        // String naam = "Sathvik VP";
        // System.out.println(naam.replace(" ", " Dixit"));
        // System.out.println(naam.contains("VP"));

        // USER INPUT

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("What is your name?");
        // String name = scanner.nextLine();
        // System.out.println("Your name is "+name+".");
        // scanner.close();

        // Scanner input = new Scanner (System.in);
        // System.out.println("Enter you age ");
        // int age = input.nextInt();
        // System.out.println("You are "+ age +" years old.");
        // input.close();

        Scanner first = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = first.nextLine();
        System.out.printf("Hey %s , how are you.", name);

    }
}
