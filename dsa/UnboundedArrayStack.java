/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author user
 */
public class UnboundedArrayStack {

    private int[] stack;
    private int top;
    private int capacity;

    public UnboundedArrayStack() {
        capacity = 2;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            resize(capacity * 2);
        }
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = stack[top--];

        if (top > 0 && top == capacity / 4) {
            resize(capacity / 2);
        }

        return value;
    }

    private void resize(int newCapacity) {
        capacity = newCapacity;
        int[] newStack = new int[capacity];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }
    
    public static void main(String[] args) {
        UnboundedArrayStack stack = new UnboundedArrayStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop()); // 4
        System.out.println(stack.pop()); // 3
    }
    
}
