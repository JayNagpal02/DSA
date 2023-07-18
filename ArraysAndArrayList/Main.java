package ArraysAndArrayList;

public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        // int a = 10;

        // Q: store a person's name
        // String name = "Jay Nagpal";

        // Q: store 5 roll numbers
        // int rno1 = 23;
        // int rno2 = 55;
        // int rno3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers
        // int[] rnos = new int[5];
        // or directly
        // int[] rnos2 = { 23, 12, 45, 32, 15 };

        // 1. 'int' this datatype represents what type of data is being stored in array
        // (as mentioned array is a collection of datatype)
        // 2. all the type of data in the array should be same datatype

        int[] ros; // declaration of array. ros is getting defined in the stack memory // compile
                   // time
        ros = new int[5]; // initialisation: actually here object is being created in the heap memory //
                          // runtime (dynamic memory allocation)

        System.out.println(ros[0]);

        // array objects are in heap => heap objects are not continuos => DMA => Hence:
        // array may not be continuos => Depends on JVM
        // new keyword is used to create an object

        String[] arr = new String[4];
        System.out.println(arr[0]);

    }
}
