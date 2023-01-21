package Task2;

import java.util.LinkedList;

public class ImmutableList extends MainClassList<Integer> {

    public ImmutableList(LinkedList<Integer> lst) {
        super(lst);
    }

    @Override
    public void getSize() {
        System.out.println(lst.size());
    }

    @Override
    public void get(int i) {
        System.out.println(lst.get(i));
    }

}
