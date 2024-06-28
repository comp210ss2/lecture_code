package comp210.L03.Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NotProgrammingToInterface {
    public static void main(String[] args) {
        // Key difference: type of l is now the concrete implementation LinkedList, not the interface List
        // Try changing LinkedList<>() (the type on left and the constructor on right) to ArrayList<>()
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.peek();
    }

}