package comp210.L16;

public class Hash {
  public static void main(String[] args) {
    System.out.println(betterHash("cat", 8));
    System.out.println(betterHash("act", 8));
  }

  static int badHash(String key) {
    return (((int) key.charAt(0)) - ((int) 'a'));
  }

  static int betterHash(String key, int tabSize) {
    int hval = 0;
    for (int i = 0; i < key.length(); i++) {
      hval += key.charAt(i);
    }
    return hval % tabSize;
  }

  static int prettyGoodHash(String key, int tabSize) {
    int hval = 7;
    for (int i = 0; i < key.length(); i++) {
      hval = 31 * hval + key.charAt(i);
    }
    hval = hval % tabSize;
    if (hval < 0) {
      hval += tabSize;
    }
    return hval;
  }
}
