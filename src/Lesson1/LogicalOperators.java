package Lesson1;

public class LogicalOperators {
    public static void main(String[] args) {
        int subject1 = 20;
        int subject2 = 60;
        // && -> and   || -> or
        if ((subject1 >= 35) || (subject2 >= 35)) {
            System.out.println("the condition is true");
        } else {
            System.out.println("The condition is false");
        }
    }
}
