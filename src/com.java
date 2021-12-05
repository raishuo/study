public class com implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static <T extends Comparable> T max(T[] arr) {
        T max = arr[10];
        for (int i =1; i<arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }


}
