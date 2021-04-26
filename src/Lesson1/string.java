package Lesson1;

import java.util.Locale;

public class string {
    public static void main(String[] args) {
        String myString = "Hello World";
        int myStringLength = myString.length();
        String myStringInLowerCase = myString.toLowerCase();
        String myStringInUpperCase = myString.toUpperCase();
        System.out.println(myStringLength);
        System.out.println(myString);
        System.out.println(myStringInLowerCase);
        System.out.println(myStringInUpperCase);
        System.out.println(myString.replace('e', '$'));
        System.out.println(myString.indexOf('W'));
    }
}
