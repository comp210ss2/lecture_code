package comp210.L01.ThisKeyword;

public class ThisKeyword {
    private int a;
    private int b;

    public ThisKeyword(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "" + a + ", " + b;
    }

    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword(1, 2);
        System.out.println(tk);  // 1, 2
    }
}
