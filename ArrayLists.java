package ArrayLists;
import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.set(0, 6);
       // Collections.sort(list);
        System.out.println(list);

        System.out.println(list.get(2));

        list.add(1, 4);
        Collections.sort(list);
        System.out.println(list);

        list.remove(1);
        System.out.println(list.size());
    }
}
