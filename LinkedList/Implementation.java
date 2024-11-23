public class Implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;
            }
            tail = temp;
        }
void inssertAtStart(int val){
    Node temp=new Node(val);
     if(head==null){
       
        tail=temp;
     }
     else{
        temp.next=head;

     } head= temp;
}
void inserAtGivenIndex(Node val, int idx){
    Node temp=head;
    if(idx==size())
    insertAtEnd(val.data);
    else if(idx==0)
    inssertAtStart(val.data);
   
  for(int i=0;i<idx-1;i++){
    temp=temp.next;
  }
//  Node temp2=temp.next;         Correct
//   temp.next=val;
//   val.next=temp2;
val.next=temp.next;
temp.next=val;

}
//4 5 6 7 8
int elementAtindex(int idx){
    Node temp=head;
    for(int i=0;i<idx ;i++){
     temp= temp.next;
    }
    return temp.data;
}
    void deleteAt(int idx){
        Node temp=head;
        for(int i=0;i<idx-1;i++){
          temp=temp.next;
        }
        temp.next=temp.next.next;
    }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next; 
            }
        }
        void displayreverse(Node head){
            if(head==null) return;
            displayreverse(head.next);
            System.out.print(head.data+" ");
              
        }
        void displayr(){
            displayreverse(head);
            System.out.println();
        }
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
               count++;
               temp=temp.next;
            }
            return count;
        }
        
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.inssertAtStart(32);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        System.out.println("LINKED LIST:");
        ll.display();
        // System.out.println();
        // System.out.println("LL in reverse order");
        // ll.displayr();
        // System.out.println("Size of the ll:"+ll.size());
        // ll.inssertAtStart(12);
        // ll.display();
        // Node r=new Node(65);
        // ll.inserAtGivenIndex(r, 4);
      
        // System.out.println();
        // ll.display();
        // System.out.println(ll.tail.data);
        // System.out.println(ll.elementAtindex(2));
        ll.deleteAt(1);
        ll.display();
    }
}
