package comp210.L01.Equality;

public class StringEx {
    public static void main(String[] args) {
        String a = new String("hi");
        String b = new String("hi");

        System.out.println(a == b);
        // inspect .equals in IDE (ctrl+click or cmd+click)
        System.out.println(a.equals(b));
    }
}
