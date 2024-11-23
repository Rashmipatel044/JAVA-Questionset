
import java.util.Scanner;
import java.util.Stack;
public class CopystackinsameOrder {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        Stack<Integer>st= new Stack<>();
        System.out.println("Enter the no of elements");
        // int n= sc.nextInt();
        // for(int i=0;i<n;i++){
        //     int x= sc.nextInt();
        //     st.push(x);
        // }
        st.push(54);
        st.push(434);
        st.push(764);
        st.push(56);
        st.push(554);
        System.out.println(st);
        Stack<Integer>gt=new Stack<>();
        while(st.size()>0){
          gt.push(st.pop());
        }
        System.out.println(gt);

        Stack<Integer>rv=new Stack<>();
        while(gt.size()>0){
            rv.push(gt.pop());
        }
        System.out.println(rv);
    }
}
