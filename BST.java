import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }

    }

    public static Node insert(Node root,int val){//here return type we took node because we are goining to recursively return root 
        //TC=O(H)
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree insert
           root.left= insert(root.left, val);
        }
        else{
            root.right=insert(root.right, val);
        }
        return root;
    }
  
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    //search valTC->O(H)
      public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
           return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }else  {
            return search(root.right,key);
        }
        
    }

    //Deletetion on node in BST
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else{//root.data==val
            //case1: leaft node deletion
            if(root.left==null && root.right==null){
                return null;
            }
            //case2:one child 
            if(root.left==null){
                return  root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case3: Two children
            Node IS=InorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node InorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    //Q Print in range
    public static void printinrange(Node root,int x,int y){
        if(root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            printinrange(root.left, x, y);
            System.out.println(root.data);
            printinrange(root.right, x, y);
        }
       else  if(root.data>=y){
            printinrange(root.left, x, y);
        }
        else{
            printinrange(root.right, x, y);
        }
    }
    //Root to leaf paths:
      public static void printroottoleaf(Node root,ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        //leaf
        if(root.left==null && root.right==null){
            printpath(path);
        }
        else{
        printroottoleaf(root.left,path);
        printroottoleaf(root.right,path);
        path.remove(path.size()-1);
      }

      }
      public static void printpath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
            
        }
        System.out.println();
      }
    
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        inorder(root);
       

        if(search(root,1)){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }
        System.out.println();
        delete(root, 4);
        inorder(root);
        System.out.println();
         delete(root, 1);
        inorder(root);
        System.out.println();
       System.out.println("numbers in range 6 to 10 are:");
        printinrange(root, 6, 10);
        System.out.println();
        printroottoleaf(root,new ArrayList<>());

    }
    
}
