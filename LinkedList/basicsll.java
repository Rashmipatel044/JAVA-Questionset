public class basicsll{
    // createting a new datatype
    public static class Node{
        int data;//value
        Node next;//address of next node

        Node(int data){
            this.data=data;
        }

    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void displayr(Node head){
        
        if(head==null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }
    public static void displayreversse(Node head){
      
        if(head==null)return;
        displayreversse(head.next);
        System.out.print(head.data+" ");
    }

    public static int countll(Node head){
    
      if(head==null) return 0;
      
          return 1+countll(head.next);
    } 
public static int length(Node head){
    int count=0;
    while(head!=null){
        count++;
        head=head.next;
    }
    return count;
}
    public static void main(String[] args) {
        Node a= new Node(2);
        System.out.println(a.next);//null
        Node b= new Node(6);
        Node c= new Node(7);
        Node d= new Node(3);
        Node e= new Node(2);
        Node f=new Node(54);
    
    a.next=b;
    System.out.println(a.next);//basicsll$Node@372f7a8d
    System.out.println(b);//basicsll$Node@372f7a8d
    System.out.println(b.data);//6
    System.out.println(a.next.data);//6
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=f;

    // System.out.println(a.data);
    // System.out.println(a.next.data);
    // System.out.println(a.next.next.data);
    // System.out.println(a.next.next.next.data);
    // System.out.println(a.next.next.next.next.data);
   System.out.println("_____________");
 
    Node temp=a;
    
    System.out.println(a.data);//2
    System.out.println(temp.data);//2
  System.out.println("_____________");
    // for(int i=0;i<5;i++){
    //     System.out.print(temp.data+" ");
    //     temp=temp.next;
    // }


//    while(temp!=null){   //main code to display the linked list
//     System.out.print(temp.data+" ");
//    temp= temp.next;

//    }
  

// display(a);
displayr(a);
displayreversse(a);
System.out.println();
int count=countll(a);
System.out.println(count);
System.out.println(length(a));

    }



} 