/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackqueue1;

/**
 *
 * @author sehan
 */
public class Stack {
     private int[] arr;    // Array to store stack elements
    private int tos;      // Points to the top element
    private int capacity; // Maximum size of the stack

    // Constructor to initialize the stack
    public Stack(int size) {
        arr = new int[size];
        tos = -1; // Stack is initially empty
        capacity = size;
       
    }

    // Push an element onto the stack
    public void push(int x) {
        if (tos == capacity - 1) { // Stack overflow
            throw new IllegalStateException("Stack Overflow");
        }
        arr[++tos] = x; // Increment top and add element
    }

    // Pop the top element from the stack
    public int pop() {
        if (isEmpty()) { // Stack underflow
            throw new IllegalStateException("Stack Underflow");
        }
        return arr[tos--]; // Return top element and decrement top
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return arr[tos];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return tos == -1;
    }
}
