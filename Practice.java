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
        // System.out.println(naam.contains("SD"));








        




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

        // Scanner first = new Scanner(System.in);
        // System.out.print("What is your name? ");
        // String name = first.nextLine();
        // System.out.printf("Hey %s , how old are you: ", name);
        // int age = Integer.parseInt(first.nextLine());
        // // first.nextLine(); 
        
        // if(age >= 18) {
        //    System.out.printf("You are allowed.");
        // }
        // else {
        //     System.out.println("Beter luck next time bro, you are not allowed , so get the fuck outah here ");
        // }
        // String reply = first.nextLine();
        // System.out.printf("get the fcuk out %s ", reply); 
        // first.close();












    // CONDITIONAL STATEMENTS
    //     Scanner calci = new Scanner(System.in);
    //     System.out.print("Enter the first number: ");
    //     double num1 = calci.nextDouble();
       
    //     System.out.print("Enter the second number: ");
    //     double num2 = calci.nextDouble();
    //     calci.nextLine();

    //     System.out.print("Enter the operation to be performed(sum,sub,multiply,div): ");
    //     String operator = calci.nextLine();

    //     if (operator.equals("sum")) {
    //         System.out.printf("%f + %f = %f",num1 , num2 , num1+num2);
    //     }
    //     else if (operator.equals("sub")) {
    //         System.out.printf("%f - %f = %f",num1 , num2 , num1-num2);
    //     }
    //     else if (operator.equals("multiply")) {
    //         System.out.printf("%f * %f = %f",num1 , num2 , num1*num2);
    //     }
    //     else if (operator.equals("div")) {
    //         if(num2 == 0) {
    //             System.out.printf("%d cannot be divided with zero",num1);
    //         }
    //         else{
    //             System.out.printf("%f / %f = %f",num1 , num2 , num1/num2);
    //         }
    //     }
    //    else {
    //     System.out.println("Enter the valid operator.");
    //    }
    //     calci.close();












    // SWITCH CASE STATEMENTS
        // Scanner calci = new Scanner(System.in);
        // System.out.print("Enter the first number: ");
        // double num1 = calci.nextDouble();
       
        // System.out.print("Enter the second number: ");
        // double num2 = calci.nextDouble();
        // calci.nextLine();

        // System.out.print("Enter the operation to be performed(sum,sub,multiply,div): ");
        // String operator = calci.nextLine();

        // switch (operator) {
        //     case "sum":
        //     System.out.printf("%f + %f = %f",num1 , num2 , num1+num2);
        //     break;
        //     case "sub":
        //     System.out.printf("%f - %f = %f",num1 , num2 , num1-num2);
        //     break;
        //     case "multiply":
        //     System.out.printf("%f * %f = %f",num1 , num2 , num1*num2);
        //     break;
        //     case "div":
        //         if(num2 == 0) {
        //             System.out.printf("%d cannot be divided with zero",num1);
        //         }
        //         else{
        //             System.out.printf("%f / %f = %f",num1 , num2 , num1/num2);
        //         }
        //     break;

        //     default:
        //     System.out.printf("%s is invalid operator.",operator);
        // }
        // calci.close();











        // ARRAY'S
        // char vowels[] = {'e','a','o','u','i'};

        // System.out.println(Arrays.toString(vowels));

        // System.out.println(vowels.length);

        // Arrays.sort(vowels);
        // System.out.println(Arrays.toString(vowels));

        // char key = 'u';
        // int findItemIndex = Arrays.binarySearch(vowels, key);
        // System.out.println(Arrays.toString(vowels));
        // System.out.println(findItemIndex);


        // USING STARTING AND ENDING INDEX
        // int startingIndex = 1;  
        // int endingIndex = 4;
        // Arrays.fill(vowels,startingIndex,endingIndex, 'x');
        // System.out.println(Arrays.toString(vowels));


        // int numbers[] = {1,2,4,7,8};
        // int copyofNumbers[] = numbers;
        // int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

        // Arrays.fill(numbers,0);

        // System.out.println(Arrays.toString(numbers));
        // System.out.println(Arrays.toString(copyOfNumbers));













        // PRINTING TABLES USING FOR LOOP 

        // int number = 10;
        // for(int mul = 1; mul<=10;mul++) {
        //     System.out.printf("%d X %d = %d \n",number,mul,number*mul);
        // }

        // for (int number = 1; number<=10;number++) {
        //     for (int mul = 1; mul <=10;mul++) {
        //         System.out.printf("%d X %d = %d\n",number,mul,number*mul);
        //     }
        // }


        // Printing even number's between 1 ot 100
        // for (int num = 1; num <= 100; num++) {
        //     if (num % 2 == 0) 
        //     System.out.println(num);
        // }

        // Printing odd number's between 1 to 100
        // for (int num = 0; num <= 100; num++) {
        //     if (num % 2 == 1) 
        //     System.out.println(num);
        // }












        // ARRAY LIST    must import ArrayList

        // ArrayList<Integer> numbers  = new ArrayList<Integer>();
        // numbers.add(5);
        // numbers.add(4);
        // numbers.add(2);
        // numbers.add(8);
        // numbers.add(7);
        // numbers.sort(Comparator.naturalOrder());          System.out.println(numbers);
        
        // System.out.println("Before: "+numbers.toString());
        // numbers.forEach(number -> {
        //     numbers.set(numbers.indexOf(number),number*2);
        // });
        // System.out.println("After: "+numbers.toString());


        










        // HASH MAP'S
        // HashMap<String,Integer> examScore = new HashMap<String,Integer>();
        // examScore.put("Kannada", 100);
        // examScore.put("English", 91);
        // examScore.put("Chemistry", 88);
        // examScore.put("Physics", 92);

        // examScore.forEach((subject, score) -> {
        //      System.out.println(subject + "-" + score);
        //     examScore.replace(subject, score - 10);
        //     });
        
        // System.out.println(examScore.toString());            
        
        // System.out.println(examScore.get("Kannada"));
        // System.out.println(examScore.containsKey("Hindi"));
        // System.out.println(examScore.containsValue(Integer.valueOf(100)));












        // NEW / ENHANCED FOR LOOP
        int arr[] = new int[4];
        arr[0] = 3;
        arr[1] = 8;
        arr[2] = 4;
        arr[3] = 7;

        for (int n : arr){
            System.out.println(n);      // This can print only the array elements not theitr index. If you want to print indices you have to use the regular for loop
        }
        System.out.println("\n");
        for (int i = 0 ; i<arr.length; i++) {
            System.out.println(i);                     // This prints out the indices of the Array
        }
    }
}








