package oop;
import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        User youngUser = new User();

        youngUser.name = ("Sathvik Jr.");
        youngUser.birthDay = LocalDate.parse("18/05/2035");

        System.out.printf("%s was born back in %s",youngUser.name , youngUser.birthDay.toString());

    }    
}
