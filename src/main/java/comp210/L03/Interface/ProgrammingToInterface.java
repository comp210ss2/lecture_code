package comp210.L03.Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProgrammingToInterface {
    public static void main(String[] args) {
        // Try changing ArrayList to LinkedList
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.remove(0);
        l.contains(2);
        l.size();
        l.stream().forEach(System.out::println);
    }
}
