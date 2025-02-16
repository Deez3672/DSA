/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackqueue1;

import java.util.NoSuchElementException;
/**
 *
 * @author sehan
 */
public class StackQueue {
    private Stack stack1; 
    private Stack stack2; 

 
    public StackQueue(int size) {
        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }

    // Enqueue an element into the queue
    public void enqueue(int x) {
        stack1.push(x);
    }

    
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty!");
        }

       
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

       
        return stack2.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
