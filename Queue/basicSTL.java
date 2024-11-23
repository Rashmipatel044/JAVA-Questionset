import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        // Initialize the queue
        Queue<Integer> mainQueue = new LinkedList<>();
        mainQueue.add(43);
        mainQueue.add(12);
        mainQueue.add(90);
        mainQueue.add(67);
        mainQueue.add(87);
        mainQueue.add(87);

        // Temporary queue to hold elements
        Queue<Integer> temporaryQueue = new LinkedList<>();

        // Print and transfer elements from mainQueue to temporaryQueue
        while (!mainQueue.isEmpty()) {
            System.out.println(mainQueue.peek());
            temporaryQueue.add(mainQueue.remove());
        }

        // Restore elements from temporaryQueue back to mainQueue
        while (!temporaryQueue.isEmpty()) {
            mainQueue.add(temporaryQueue.poll());
        }
    }
}
