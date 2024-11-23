public class removenthnodefromend {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void remove(Node x) {
        x.data = x.next.data;
        x.next = x.next.next;
    }

    public static void removefromend(Node head, int n) {
        // 43 53 4 453 23 543
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        remove(slow);

    }
    public static Node seconddmethod(Node head, int x){
        Node slow= head;
        Node fast= head;
        for(int i=1;i<=x;i++){
            fast= fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow= slow.next;
            fast= fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static Node intersectingNode(Node head1, Node head2){
      Node temp1=head1;
      Node temp2=head2;
      int m=0,n=0;
      while (temp1 != null) {
        m++;
        temp1 = temp1.next;
    }
    while (temp2 != null) {
        n++;
        temp2 = temp2.next;
    }

      if(m>n){
        for(int i=0;i<m-n;i++){
            head1=head1.next;
        }
      }
      else{
        for(int i=0;i<n-m;i++){
            head2=head2.next;
        }
      }
     while(head1!=null&&head2!=null){
        if(head1==head2)
            return head1;
        head1=head1.next;
        head2=head2.next;
       }
    return null;
    }

    public static Node middleOne(Node head) {
        if (head == null) return null; // Edge case for empty list
    
        Node slow = head;
        Node fast = head;
    
        // Move `fast` two steps and `slow` one step until `fast` reaches the end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
    
        return slow; // `slow` will be at the middle node
    }
    
    public static void main(String[] args) {
        Node a = new Node(43);
        Node b = new Node(53);
        Node c = new Node(4);
        Node d = new Node(453);
        Node e = new Node(23);
        Node f = new Node(543);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
     display(a);
    //     removefromend(a, 2);

    //     display(a);
    //    a= seconddmethod(a, 5);
    //     display(a);
       
        Node p= new Node(12);
        Node q= new Node(142);
        Node r= new Node(493);
        Node s= new Node(23);
        p.next=q;
        q.next=r;
        r.next=s;
        s.next=c;
       Node ans= intersectingNode(a, p);
       System.out.println("COMMON:"+ans.data);
       Node ans1= middleOne(a);
       System.out.println("Middle:"+ans1.data);
       display(p);

    }
}
