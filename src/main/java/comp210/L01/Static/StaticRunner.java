package comp210.L01.Static;

public class StaticRunner {
    public static void main(String[] args) {
        Static s1 = new Static(1);
        Static s2 = new Static(1);

        Static.setS(2);
        s2.setI(2);

        System.out.println(Static.getS());

        System.out.println(s1.getI());
        System.out.println(s2.getI());
    }
}
