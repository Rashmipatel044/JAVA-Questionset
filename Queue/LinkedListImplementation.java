public class LinkedListImplementation {

    public static class queueL {
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        private Node head = null;
        private Node tail = null;

        public void add(int val) {
            Node temp = new Node(val);
            if (tail == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        public int remove() {
            if (head == null) {
                System.out.println("Queue is empty");
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        public int peek() {
            if (head == null) {
                System.out.println("Queue is empty");
            }
            return head.data;
        }

        public int size() {
            Node temp = head;
            int count = 1;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    

    public static void main(String[] args) {
        queueL q = new queueL();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(0);
        q.display();
        System.out.println(q.remove());
        System.out.println("Aftre remove");
        q.display();

    }
}
