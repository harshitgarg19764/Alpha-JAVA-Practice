public class BinaryTrees {
    public class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static int idx = -1;
    public Node treePreorder(int arr[]){
        idx++;
        if(arr[idx]==-1){
            return null;
        }
        Node newNode = new Node(arr[idx]);
        newNode.left = treePreorder(arr);
        newNode.right = treePreorder(arr);
        
        return newNode;

    }

    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

     public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

     public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public int height(Node root){
        if(root==null){
            return 0;
        }
        int ls= 1+height(root.left);
        int rs = 1+height(root.right);

        return Math.max(ls,rs); 
    }

     public int count(Node root){
        if(root==null){
            return 0;
        }
        int ls= count(root.left);
        int rs = count(root.right);

        return 1+ls+rs;
    }

    public int sum(Node root){
        if(root==null){
            return 0;
        }
        int ls= sum(root.left);
        int rs = sum(root.right);

        return root.data+ls+rs;
    }

    




}
