package org.example.implementArrayList;

public class ArrayList {

    private int[] list;

    //points towards the number of added elements in the array
    private int size;

    public ArrayList() {
        this.list = new int[10];
        this.size = 0;
    }

    public void add(int value) {

        if (size == list.length) {
            list = resizeAndCopy(list, size);
        }
        list[size] = value;
        size++;
    }

    public void add(int index, int value) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (size == list.length) {
            list = resizeAndCopy(list, size);

        }

        //move elements to the right;
        if (index < size) {
            for (int i = size - 1; i >= index; i--) {
                list[i + 1] = list[i];
            }
        }

        list[index] = value;
        size++;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }

        size--;
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        return list[index];
    }

    public void set(int index, int value) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        list[index] = value;
    }


    public int[] resizeAndCopy(int[] arr, int currentSize) {
        int newCapacity = (arr.length == 0) ? 1 : arr.length * 2;

        int[] newArr = new int[newCapacity];

        for (int i = 0; i < currentSize; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }


}