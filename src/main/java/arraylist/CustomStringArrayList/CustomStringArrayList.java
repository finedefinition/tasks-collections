package arraylist.CustomStringArrayList;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
        System.out.println(element);
    }

    private void grow() {

        double doubleCapacity = capacity * 1.5;
        int newCapacity = (int) doubleCapacity;
        String[] array = new String[newCapacity];
        for (int i = 0; i < elements.length; i++) {
            array[i] = elements[i];
        }
        elements = array;
        capacity = newCapacity;
    }

}