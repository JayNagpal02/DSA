package StringsAndStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 3);
        // this is same as after a few steps: "a" + "3"
        // integer will be converted into Integer that will call toString()
        System.out.println("Jay" + new ArrayList<>());
        System.out.println("Jay" + new Integer(56));
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
}
