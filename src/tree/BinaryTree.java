package tree;

public class BinaryTree {
    public Node root ;

    public BinaryTree(Node root){
        this.root = root;
    }

    public BinaryTree(){
        this.root = null;
    }

    public void  preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.getData()+" ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void inOrder(Node root){
        if(root == null)
            return;
        preOrder(root.getLeft());
        System.out.print(root.getData()+" ");
        preOrder(root.getRight());
    }

    public void postOrder(Node root){
        if(root ==null){
            return;
        }
        postOrder(root.getLeft());
        preOrder(root.getRight());
        System.out.print(root.getData()+" ");
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
