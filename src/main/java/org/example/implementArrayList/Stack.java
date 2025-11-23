package org.example.implementArrayList;

public class Stack {

    int size;

    //points towards the next available position
    int top;
    String[] arr;

    public Stack() {
        size = 4;
        arr = new String[size];
        top = 0;
    }

    public void push(String str) {

        if (top < size) {
            arr[top] = str;
            top++;
        } else {
            System.out.println("Stack OverFlow!!");
        }
    }

    public String peek() {

        if (top > 0) {
            return arr[top - 1];
        }

        return null;
    }

    public String pop() {

        if (top == 0) {
            System.out.println("Stack OverFlow!");
        }

        top--;
        String temp = arr[top];
        arr[top] = null;

        return temp;
    }


}
