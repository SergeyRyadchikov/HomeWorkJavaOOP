package Task2;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ImmutableList lst = new ImmutableList(new LinkedList<>(Arrays.asList(1, 3, 5, 6 , 8, 43, 234, 7)));

        MutableList lst2 = new MutableList(new LinkedList<>(Arrays.asList(1, 0, 3, 4, 25, 6)));


        lst.get(2);
        lst.getSize();

        System.out.println();

        lst2.get(4);
        lst2.set(2,1309);
        lst2.add(5364);
        lst2.remove(4);

    }
}
