package tree;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);

        //left and right of root node
        Node childNode = new Node(2);
        Node rightNode = new Node(3);
        root.setLeft(childNode);
        root.setRight(rightNode);

        Node subChildLeftNode = new Node(4);
        Node subChildRightNode = new Node(5);
        childNode.setLeft(subChildLeftNode);
        childNode.setRight(subChildRightNode);

        Node rightNodeChildRight = new Node(6);
        rightNode.setRight(rightNodeChildRight);

        BinaryTree binaryTree = new BinaryTree(root);
        System.out.println("PreOrder-> ");
        binaryTree.preOrder(binaryTree.getRoot());
        System.out.println();
        System.out.println("InOrder-> ");
        binaryTree.inOrder(binaryTree.getRoot());
        System.out.println();
        System.out.println("PostOrder-> ");
        binaryTree.postOrder(binaryTree.getRoot());
    }
}
