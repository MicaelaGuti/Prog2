public interface SimpleList {
    int size();

    boolean isEmpty();

    boolean contains(Object element);

    void add(Object element);

    Object add(int index, Object element);

    Object set(int index, Object element);

    boolean remove(Object element);

    Object remove(int index);

    void addAll(SimpleList otherList);

    void clear();

    Object get(int index);

    int indexOf(Object element);
}
