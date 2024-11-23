public class ArrayImplementation {
    
    public static class QueueA {
        int arr[] = new int[5];
        int f = -1; // Front pointer
        int r = -1; // Rear pointer
        int size = 0; // Number of elements in the queue

        // Add an element to the queue
        public void add(int val) {
            if (size == arr.length) { // Queue is full
                System.out.println("Queue is full");
                return;
            }

            if (f == -1) { // First element being added
                f = r = 0;
            } else {
                r++;
            }
            
            arr[r] = val;
            size++;
        }

        // Remove an element from the queue
        public int remove() {
            if (size == 0) { // Queue is empty
                System.out.println("Queue is empty");
                return -1;
            }

            int removedValue = arr[f];
            f++;
            size--;

            // Reset pointers when queue becomes empty
            if (size == 0) {
                f = r = -1;
            }

            return removedValue;
        }

        // Peek at the front element
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }

        // Display all elements in the queue
        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.print("Queue elements: ");
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueA queue = new QueueA();

        // Testing the queue
        queue.display(); // Should print "Queue is empty"
        queue.add(4);
        queue.add(8);
        queue.add(15);
        queue.add(16);
        queue.add(23);
        queue.display(); // Should print all elements

        queue.add(42); // Queue full message

        System.out.println("Removed: " + queue.remove()); // Remove an element
        queue.display(); // Print remaining elements
    }
}
