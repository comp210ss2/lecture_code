package comp210.L01.Static;

public class StaticRunner {
    public static void main(String[] args) {
        Static s1 = new Static(1);
        Static s2 = new Static(1);

        Static.setX(2);
        s2.setY(2);

        System.out.println(Static.getX());

        System.out.println(s1.getY());
        System.out.println(s2.getY());
    }
}
