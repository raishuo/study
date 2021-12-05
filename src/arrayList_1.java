import java.util.ArrayList;
import java.util.Iterator;

public class arrayList_1 {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(456);
        integers.add(789);
        for (Integer a: integers) {
            System.out.println(a);
        }

        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
