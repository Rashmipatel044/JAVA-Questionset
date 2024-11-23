import java.util.Stack;

public class Insertion {
    public static void main(String[] args) {
        Stack<Integer>st= new Stack<>();
        st.push(43);
        st.push(343);
        st.push(843);
        st.push(453);
        st.push(45433);
        st.push(654);
        System.out.println(st);
        int x=6;
        Stack<Integer>gt= new Stack<>();
        // At first index
        while(st.size()>0){
            gt.push(st.pop());

        }
         st.push(x);
         while(gt.size()>0){
            st.push(gt.pop());
         }
         System.out.println(st);
         //At a particular index 
         int p=2;
         while(st.size()>p){
            gt.push(st.pop());
         }
         st.push(p);
         while(gt.size()>0){
            st.push(gt.pop());
         }
         System.out.println(st);
    }
}
