package Lesson1;

public class ForLoops {
    public static void main(String[] args) {
        int [] myIntArray = {100,31,22,44,55};

        for (/* init; expression; increment*/int index = 0; index < 5; index++){
        System.out.println(myIntArray[index]);
        }

        for (int element : myIntArray)
        {
            System.out.println(element);
        }
    }
}
