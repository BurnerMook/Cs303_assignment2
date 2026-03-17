import java.util.Objects;

public class SingleLinkedList <T>{
    //required node class
    private static class Node <T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
    //operations
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        T data = head.data;
        head = head.next;
        size--;
        if (isEmpty()) tail = null;
        return data;
    }

    public T removeLast() {
        if (isEmpty()) return null;
        if (size == 1) return removeFirst();

        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        T data = tail.data;
        current.next = null;
        tail = current;
        size--;
        return data;
    }

    public T getFirst() {
        return isEmpty() ? null : head.data;
    }

    public T getLast() {
        return isEmpty() ? null : tail.data;
    }
    //Index based operations
    public void insert(int index, T item){
        if (index <= 0){
            addFirst(item);
        }
        else if (index >= size){
            addLast(item);
        }
        else{
            Node <T> newNode = new Node<>(item);
            Node <T> prev = head;
            for(int i = 0; i < index-1; i++){
                prev = prev.next;
            } 
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) return false;
        if (index == 0) {
            removeFirst();
        } else {
            Node<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
            if (prev.next == null) tail = prev; // Update tail if last element removed
            size--;
        }
        return true;
    }
    //finds first instance
    public int find(T item) {
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(current.data, item)) {
                return i;
            }
            current = current.next;
        }
        return size;
    }
}
