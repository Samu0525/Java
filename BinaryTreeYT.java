import java.util.*;
public class BinaryTreeYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
             newNode.right=BuildTree(nodes);
             return newNode;

        }

        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root==null){
                return;
            }
           inorder(root.left);
           System.out.println(root.data);
           inorder(root.right);
        }

        public static void postorder(Node root){
            if(root==null){
                return;
            }
           postorder(root.left);
           postorder(root.right);
           System.out.println(root.data);
        }

        //level order traversal->BFS in trees
        public static void levelorder(Node root){
            Queue<Node> q =new LinkedList<>();
            if(root==null){
                return;
            }
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            
        }
    }

    //count of nodes
    public static int countofnodes(Node  root){
    if(root==null){
        return 0;
    }
    int leftnodes=countofnodes(root.left);
    int rightnodes=countofnodes(root.right);
    return leftnodes+rightnodes+1;

    }    
    //Sum of Nodes
    public static int sumofnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftnodes=sumofnodes(root.left);
        int rightnodes=sumofnodes(root.right);
        return leftnodes+rightnodes+root.data;
    }

    //height of tree
    public static int height(Node root){
        if(root ==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        int myheight=Math.max(leftheight, rightheight);
        return myheight+1;
    }

    //Diameter of a Tree
    //Case1: Diameter passing through root
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }

    //Approach2
    static class TreeInfo{
        int ht;//ht is height
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
           return  new TreeInfo(0, 0);
            
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myheight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;
        int mydiam=Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo=new TreeInfo(myheight,mydiam);
        return myInfo;


    }

    //subtree of Another tree
    public static boolean isIdentical(Node root,Node subroot){
        if(subroot==null && root==null){
            return true;
        }
         if(subroot==null || root==null){
            return false;
        }
         if(subroot.data==root.data){
            return subroot.left==root.left && subroot.right==root.right;
        }
       return false;
        
        
    }
    public static boolean subtreeoftree(Node root,Node subroot){
        if(subroot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(isIdentical(root, subroot)){
            return true;
        }else{
            return false;
        }

    }

    //Sum of Kth level
    public static void sumofkthlevel(Node root,int k){
        if(root==null){
            return;
        }
        Queue<Node> qk=new LinkedList<>();
        qk.add(root);
        int level=0;
        int sum=0;
        while(!qk.isEmpty()){
            int size=qk.size();
            for(int i=0;i<size;i++){
                 Node cuNode=qk.remove();
                 if(level==k){
                    sum=sum+cuNode.data;
                 }

                   if(cuNode.left!=null){
                    qk.add(cuNode.left);
                }
                if(cuNode.right!=null){
                    qk.add(cuNode.right);
                }

            }
          // Important: increment level AFTER processing current level
        level++;

        // Optional: Break early if we just finished level k
        if (level > k) break;
            
            }
             System.out.println("Sum of level " + k + " is: " + sum);  
        }
           
        

    

    public static void main(String[] args) {
       /*  int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        System.out.println(root.data);
        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println("Postorder Traversal:");
        postorder(root);
         System.out.println("Level-order Traversal:");
        levelorder(root);
        System.out.print("Count of Nodes:");
        System.out.println(countofnodes(root));
        System.out.print("Sum of Nodes:");
        System.out.println(sumofnodes(root));
         System.out.print  ("Height of tree:");
        System.out.println(height(root));
        System.out.print  ("Length of longest diameter of tree passing through root:");
        System.out.println(diameter(root));
         System.out.print  ("Length of longest diameter of tree without passing through root:");
        System.out.println(diameter2(root).diam);
         System.out.print  ("Subtree of a tree");
        System.out.println(subtreeoftree(root, root));//incomplete*/
        System.out.println("sum of kth level node data");
       Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        sumofkthlevel(root,2);//incomplete
       

    }
    
}}
