/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackqueue1;

/**
 *
 * @author sehan
 */
public class StackQueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackQueue queue = new StackQueue(10);

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue elements
        System.out.println(queue.dequeue()); 
        System.out.println(queue.peek());    

        // Enqueue more elements
        queue.enqueue(4);
        queue.enqueue(5);

        // Dequeue elements
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
    }
    
}
