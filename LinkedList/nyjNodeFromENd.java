
public class nyjNodeFromENd {

    public static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNodeFromEnd(Node head, int n) {
        int size = 0;
        Node temp = head;

        // Calculate the size of the linked list
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Check if n is within bounds
        if (n > size || n <= 0) {
            System.out.println("Invalid value of n: " + n);
            return null; // or throw an exception if you prefer
        }

        // Find the (size - n + 1)th node from the start
        int m = size - n + 1;
        Node ans = head;

        for (int i = 1; i < m; i++) {
            ans = ans.next;
        }
        
        return ans;
    }
    public static Node nthfromLast2nd(Node head, int n){
        Node slow=head;
        Node fast= head;
        for(int i=1;i<=n;i++){
            fast= fast.next;
        }
        while(fast!=null){
            slow= slow.next;
            fast= fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(43);
        Node b = new Node(53443);
        Node c = new Node(4343);
        Node d = new Node(343);
        Node e = new Node(3);
        Node f = new Node(455463);
        Node g = new Node(73);

        // Linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node temp = nthNodeFromEnd(a, 3);
        if (temp != null) {
            System.out.println(temp.data);
        }
        Node temp2= nthfromLast2nd(a, 3);
        System.out.println(temp2.data);
    }
}
