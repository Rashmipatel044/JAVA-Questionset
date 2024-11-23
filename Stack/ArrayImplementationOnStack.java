public class ArrayImplementationOnStack {


 public static class Stack{
  private  int []arr= new int[100];
    private int idx=0;
    void push(int x){
        if(idx==capacity()){System.out.println("Stack is full");}
        arr[idx]=x;
        idx++;
    }
    int pop(){
        if(idx==0) System.out.println("Empty Stack");
       
        idx--;
        return arr[idx];

    }
    int peek(){
        return arr[idx-1];
    }
    void display(){
        if(idx==0)System.out.println("Empty stack");
        for(int i=idx-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    int size(){
        return idx;
    }
    boolean isempty(){
        if(idx==0)return true;
        return false;
    }
   int capacity(){

        int l= arr.length;    
            return (l);
    }
 }

    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(43);
        st.push(43);
        st.push(43);
        st.push(43); st.display();
        st.pop();
        System.out.println("After Pop");
        st.display();
        System.out.println("Peak element");
        System.out.println(st.peek());
        System.out.println("Size");
        System.out.println(st.size());
       
    }
}
