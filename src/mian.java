import java.util.ArrayList;
import java.util.Random;

public class mian {
    public static void main(String[] args) {
        DynamicArray<Double> arr = new DynamicArray<>();
        Random rnd = new Random();
        int size = 1 + rnd.nextInt(100);
        for (int i = 0; i < size; i++) {
            arr.add(Math.random());
        }
        Double d = arr.get(rnd.nextInt(size));

        // 输出数组前十个
        for (int j = 0; j <= 10 && j < size; j++)
        System.out.println(arr.get(j));
        System.out.println("--------------");
        System.out.println(indexOf(new Integer[]{1,1,2}, 3));
    }

    public static <T> int indexOf(T[] arr, T elm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(elm)) {
                return i;
            }
        }
        return -1;
    }


    ArrayList<Integer> a = new ArrayList<>();
}
