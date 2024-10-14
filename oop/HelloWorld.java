package oop;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        User youngUser = new User();

        youngUser.name = ("Sathvik Jr.");
        youngUser.birthDay = LocalDate.parse("2035-05-18");          // In LocalDate the date order should be in (year-month-date)
 
        System.out.printf("%s was born in %s",youngUser.name , youngUser.birthDay.toString());
    }    
}
