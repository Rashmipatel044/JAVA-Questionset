import java.util.Stack;
public class basicsOfStack{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(13);
        st.push(43);
        System.out.println(st);
        st.pop();
        System.out.println(st.peek());
        System.out.println("Size:"+st.size());
        //if stack is empty sout(st)->[] size()->0;
        //order of 1->push,pop,peek
        st.push(43);
        st.push(4533);
        st.push(13);
        st.push(534);
        st.push(97);
        st.push(86);
        System.out.println(st);
        //print the first element
       while(st.size()>1){
        st.pop();
       }
       System.out.println(st.peek());
    }
}