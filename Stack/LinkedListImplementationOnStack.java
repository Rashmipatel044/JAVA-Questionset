

public class LinkedListImplementationOnStack {

public static class Node{   //user define data type
    int data;
    Node next;
    Node(int data){
       this.data= data; 
    }
}
public static class Stack{     //user define data structure
   private Node head=null;
    void push(int x){
        Node temp= new Node(x);
        temp.next=head;
        head= temp;

    }

    int pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int x= head.data;
        head= head.next;
       return x;
    }
    int peak(){
        return head.data;
    }
void displayreverse(){
        Node temp=head;
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
    }
    void displayrec(Node h){
        if(h==null)return;
    displayrec(h.next);
    System.out.print(h.data+" ");
    }
    void display(){
        displayrec(head);
    }
    int size(){
        Node temp= head;
        int count=0;
        while(temp!=null){
         count++;
        temp=temp.next;
        }
        return count;
    }
}

    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(43);
        st.push(763);
        st.push(45);
        st.push(4365);
        st.push(43564);
        System.out.println("Original:");
         st.display();
        st.pop();
        System.out.println("After poping an element");
        st.display();
       System.out.println("Peak element:"+st.peak()); 
       System.out.println("Size:"+st.size()); 
       st.push(65);
       st.display();
       st.displayreverse();
      

    }
    
}
