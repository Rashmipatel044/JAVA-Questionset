import java.util.Stack;

public class Displayelements {


    // public static void test(int[]arr){
    //     arr[2]=43;
    // }
    public static void dispalayreverserec(Stack<Integer>st){
        if(st.size()==0)return;
        int top=st.pop();
        System.out.print(top+" ");
        dispalayreverserec(st);
        st.push(top);
    }
    public static void pushAtBottomRec(Stack<Integer> st, int element) {
        if (st.size() == 0) { 
            st.push(element);
            return;           
        }
        int top = st.pop();          
        pushAtBottomRec(st, element);
        st.push(top);                 
    }
   public static void main(String[] args) {
    // int[]arr=new int[3];
    // arr[2]=90;
    // System.out.println(arr[2]);
    // test(arr);
    // System.out.println(arr[2]);
       Stack<Integer>st= new Stack<>();
        st.push(43);
        st.push(343);
        st.push(843);
        st.push(453);
        st.push(45433);
        st.push(654);
        System.out.println(st);
        // Stack<Integer>gt= new Stack<>();
        // while(st.size()>0){
        //     gt.push(st.pop());

        // }
        // while(gt.size()>0){
        //     int x= gt.pop();
        //     System.out.print(x+" ");
        
        //     st.push(x);
        // }
        // System.out.println();
        // System.out.println(st);

//    int n= st.size();
//    int []arr= new int[n];
//    for(int i=n-1;i>=0;i--){
//     arr[i]=st.pop();
//    }
//    for(int i=0;i<n;i++){
//     System.out.print(arr[i]+" ");
//     st.push(arr[i]);
//    }
//    System.out.println();
//    System.out.println(st);
System.out.println(st);
dispalayreverserec(st);
System.out.println(st);
pushAtBottomRec(st,100);
System.out.println(st);
   } 
}
