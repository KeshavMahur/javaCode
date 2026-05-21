package tree;

public class TreeMainClass {
    public static void main(String[] args) {
        BinarySearchTreeWithOperations binarySearchTreeWithOperations = new BinarySearchTreeWithOperations(new Node(90));
        binarySearchTreeWithOperations.root = binarySearchTreeWithOperations.insertElementWithRecursion(binarySearchTreeWithOperations.root,80);
        binarySearchTreeWithOperations.root  = binarySearchTreeWithOperations.insertElementWithRecursion(binarySearchTreeWithOperations.root,100);
        binarySearchTreeWithOperations.printBSTTreeWithBFS(binarySearchTreeWithOperations.root);
    }
}
