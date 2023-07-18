package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(67);
        list.add(23);
        list.add(45);
        list.add(12);
        list.add(90);
        list.add(67);
        list.add(23);
        list.add(45);
        list.add(12);
        list.add(90);
        list.add(67);
        list.add(23);
        list.add(45);
        list.add(12);
        list.add(90);
        list.add(67);
        list.add(23);
        list.add(45);
        list.add(12);
        list.add(90);

        // System.out.println(list.contains(43));
        System.out.println(list);
        list.set(0, 99);
        list.remove(2);
        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));    // pass index here, list[index] will not work here
        }
    }
}

/**
1. Size is fixed internally
2. Say arraylist fills by same amount, then
=> it will create a new arraylist of say, double the size
=> old elements are copied in new arraylist
=> old one is deleted
*/
