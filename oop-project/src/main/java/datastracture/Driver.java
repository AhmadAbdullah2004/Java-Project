
package datastracture;

import datastracture.Queue;

public class Driver {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enque('A');
        q.enque('B');
        q.enque('C');
        q.display();
        char removed = q.deque();
        System.out.println("Removed item: " + removed);
        q.display();
        q.enque('D');
        q.display();
        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.deque());
        }
        q.display();
    }
}
