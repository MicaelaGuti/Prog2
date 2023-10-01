public class LinkedList implements SimpleList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
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
        Node current = first;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public Object add(int index, Object element) {
        if (index < 0 || index > size) {
            return null;
        }
        Node newNode = new Node(element);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
            if (isEmpty()) {
                last = newNode;
            }
        } else if (index == size) {
            last.next = newNode;
            last = newNode;
        } else {
            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
        return element;
    }

    @Override
    public Object set(int index, Object element) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Object oldValue = current.data;
        current.data = element;
        return oldValue;
    }

    @Override
    public boolean remove(Object element) {
        Node current = first;
        Node previous = null;
        while (current != null) {
            if (current.data.equals(element)) {
                if (previous == null) {
                    first = current.next;
                    if (first == null) {
                        last = null;
                    }
                } else {
                    previous.next = current.next;
                    if (previous.next == null) {
                        last = previous;
                    }
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = first;
        Node previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }
        Object removedValue = current.data;
        if (previous == null) {
            first = current.next;
            if (first == null) {
                last = null;
            }
        } else {
            previous.next = current.next;
            if (previous.next == null) {
                last = previous;
            }
        }
        size--;
        return removedValue;
    }

    @Override
    public void addAll(SimpleList otherList) {
        for (int i = 0; i < otherList.size(); i++) {
            add(otherList.get(i));
        }
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int indexOf(Object element) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.data.equals(element)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
}