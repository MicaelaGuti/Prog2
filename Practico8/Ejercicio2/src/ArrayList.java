import java.util.Arrays;

public class ArrayList implements SimpleList{
    private static final int INITIAL_CAPACITY = 10;
    private Object[] array;
    private int size;

    public ArrayList() {
        this.array = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Object element) {
        ensureCapacity();
        array[size++] = element;
    }

    @Override
    public Object add(int index, Object element) {
        if (index < 0 || index > size) {
            return null;
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
        return element;
    }

    @Override
    public Object set(int index, Object element) {
        if (index < 0 || index >= size) {
            return null;
        }
        Object replacedElement = array[index];
        array[index] = element;
        return replacedElement;
    }

    @Override
    public boolean remove(Object element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Object removedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return removedElement;
    }

    @Override
    public void addAll(SimpleList otherList) {
        for (int i = 0; i < otherList.size(); i++) {
            add(otherList.get(i));
        }
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);
        size = 0;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}