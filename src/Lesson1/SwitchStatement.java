package Lesson1;

public class SwitchStatement {
    public static void main(String[] args) {
        int score = 100;
        // byte, shot, int, or char
        switch (score)
        {

            case 100:
            case 90:
            case 80:
                System.out.println("Very good");
                break;
            case 70 :
                System.out.println("good");
                break;
            case 50 :
                System.out.println("OK");
                break;
            case 40 :
                System.out.println("bad");
                break;
            case 20 :
                System.out.println("Very BAD");
                break;
            default:
                System.out.println("The grades are not defined.");

        }
    }
}
