package StringsAndStringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";

        System.out.println(a == b);

        String c = new String("Hello");
        String d = new String("Hello");

        System.out.println(c.equals(d));

        System.out.println(c.charAt(0));
    }
}
