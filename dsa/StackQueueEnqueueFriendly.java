/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.Stack;


public class StackQueueEnqueueFriendly {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue is O(1)
    public void enqueue(int x) {
        s1.push(x);
    }

    // Dequeue is O(n)
    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int dequeued = s2.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return dequeued;
    }
    
    public static void main(String[] args) {
        StackQueueEnqueueFriendly queue = new StackQueueEnqueueFriendly();

        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);

        System.out.println(queue.dequeue()); // 100
        System.out.println(queue.dequeue()); // 200
    }
    
}
