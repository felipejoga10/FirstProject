package Lesson1;

public class Arrays {
    public static void main(String[] args) {
        int [] my_int_array = {100,37,29,45,50};
        int my_int_array2[]={1,2,3,4,5};
        /*int[] myIntArray new int[3];
        int[] myIntArray = {1,2,3};
        int[] myIntArray= new int[] {1,2,3};
        */
        int index=0;
        while(index < 5) {
            System.out.println(my_int_array[index]);
            index++;
        }
    }
}