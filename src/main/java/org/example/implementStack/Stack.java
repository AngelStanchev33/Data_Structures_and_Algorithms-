package org.example.implementStack;

public class Stack {

    int maxSize;
    int top;
    String[] arr;

    public Stack() {
        maxSize = 4;
        arr = new String[maxSize];
        top = 0;
    }

    public void push(String str) {
        if (top < maxSize) {
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
        if (!empty()) {
            String temp = peek();
            arr[top - 1] = null;
            top--;

            return temp;
        }

        return null;
    }

    public boolean empty() {

        return top == 0;
    }
}
