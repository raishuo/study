import java.util.Arrays;

public class DynamicArray<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] elementDate;


    // 初始化数组
    public DynamicArray() {
        this.elementDate = new Object[DEFAULT_CAPACITY];
    }

    // 更新数组长度
    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elementDate.length;
        if (oldCapacity >= minCapacity) {
            return;
        }
        int newCapacity = oldCapacity * 2;
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        elementDate = Arrays.copyOf(elementDate, newCapacity);
    }

    // 添加数据
    public void add(E e) {
        ensureCapacity(size + 1);
        elementDate[size++] = e;
    }

    // 返回数据
    public E get(int index) {
        return (E)elementDate[index];
    }

    // 返回数组长度
    public int size() {
        return size;
    }

    // 修改数据
    public E set(int index, E element) {
        E oldValue = get(index);
        elementDate[index] = element;
        return oldValue;
    }
}
