import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        // We use the Deque interface as the reference type
        Deque<String> myDeque = new ArrayDeque<>();

        // --- 1. STACK OPERATIONS (LIFO: Last-In, First-Out) ---
        System.out.println("--- Acting as a STACK ---");
        myDeque.push("Book A"); // Bottom
        myDeque.push("Book B");
        myDeque.push("Book C"); // Top
        
        System.out.println("Stack after pushes: " + myDeque);
        System.out.println("Peeking top: " + myDeque.peek()); // Look at C
        System.out.println("Popping: " + myDeque.pop());     // Remove C
        System.out.println("Stack after pop: " + myDeque);
        System.out.println();

        // Clear the deque for the next demo
        myDeque.clear();

        // --- 2. QUEUE OPERATIONS (FIFO: First-In, First-Out) ---
        System.out.println("--- Acting as a QUEUE ---");
        myDeque.add("Person 1"); // Front of line
        myDeque.add("Person 2");
        myDeque.add("Person 3"); // Back of line
        
        System.out.println("Queue after adds: " + myDeque);
        System.out.println("Peeking front: " + myDeque.peek()); // Look at Person 1
        System.out.println("Polling: " + myDeque.poll());       // Remove Person 1
        System.out.println("Queue after poll: " + myDeque);
        System.out.println();

        // --- 3. THE "DEQUE" SPECIAL (Double-Ended) ---
        System.out.println("--- Using Both Ends ---");
        myDeque.addFirst("VIP Guest");
        myDeque.addLast("Late Arrival");
        System.out.println("Final state: " + myDeque);
    }
}