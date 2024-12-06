import java.util.ArrayList;

public class O2BinarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static boolean search(Node root, int val){
        if(root==null)return false;
        if(root.data==val)return true;
        if(val<root.data){
            return search(root.left, val);
        }
        else{
         return search(root.right, val);
        }
        
    }
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left, val);
        }
        else if(root.data<val){
            root.right=delete(root.right, val);
        }

        else{
            //root.data==val

            //case1
            if(root.left==null && root.right==null)return null;
            //case 2
            if(root.left==null) return root.right;
            if(root.right==null)return root.left;
            //case 3
    Node IS= inorderSuccessor(root.right);
        root.data=IS.data;
       root.right= delete(root.right, Is.data);
    
        }
        return root;
    }
public static Node inorderSuccessor(Node root){
    while(root.left!=null){
        root=root.left;
    }
return root;
}

// print in range   x->y {INclusively}

public static void printRange(Node root,int x,int y){
    if(root==null)return;
    if(root.data>=x &&root.data<=y){
        printRange(root.left, x, y);
        System.out.print(root.data+" ");
        printRange(root.right, x, y);
    }
    else if(root.data>=y){
        printRange(root.left, x, y);

    }
    else
    printRange(root.right, x, y);
}


// Root to leaf

public static void printroot2leaf(Node root,ArrayList<Integer>path){
    if(root==null)return;
    path.add(root.data);
    if(root.leaf==null&&root.right==null){
        printpath(path);
    }
    else{
        //non-leaf
        printroot2leaf(root.left, path);
        printroot2leaf(root.right, path);
    }
    path.remove(path.size()-1);


}
public static void printpath(ArrayList<Integer>path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+" ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        int value[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);  
        }
        inOrder(root);
       System.out.println(search(root, 9)); 
    }
}
