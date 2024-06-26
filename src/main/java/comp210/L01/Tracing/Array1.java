package comp210.L01.Tracing;

public class Array1 {
  public static void main(String[] args) {
    String[] names = {"Joe", "Bob", "Bill"};

    int longest = 0;
    for (int i = 1; i < names.length; i++) {
      if (isLonger(names[i], names[longest])) {
        longest = i;
      }
    }

    System.out.println("Longest: " + names[longest]);
  }

  static boolean isLonger(String a, String b) {
    return a.length() > b.length();
  }
}
