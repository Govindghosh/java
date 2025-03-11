package objectOrientedPrograming.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;
    }

    public T remove() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("ArrayList is empty");
        }
        T removed = (T) data[--size];
        data[size] = null; // Prevent memory leak
        return removed;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public T set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        T oldValue = (T) data[index];
        data[index] = value;
        return oldValue;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2]; // Fix: Use Object[] instead of int[]
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(Arrays.copyOf(data, size)) + // Avoid printing null values
                ", size=" + size +
                '}';
    }

}
