package comp210.L01.AccessModifiers;

public class AnotherClass {
    public static void main(String[] args) {
        Fields f = new Fields();
        int a;
        a = f.pub;
//        a = f.priv;
        a = f.prot;
        a = f.def;
    }
}
