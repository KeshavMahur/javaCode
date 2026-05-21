package tree;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(Node root){
        this.root = root;
    }

    public BinarySearchTree(){
    }

    public void insert(int data){
        if(root == null){
            root = new Node(data);
            return;
        }

        Node rootNode = root;
        while (rootNode != null){
            int rootData = rootNode.getData();
            if(data < rootData){
                if(rootNode.getLeft() == null) {
                    rootNode.setLeft(new Node(data));
                    return;
                }
                rootNode = rootNode.getLeft();
            } else if(data > rootData) {
                if(rootNode.getRight() == null){
                    rootNode.setRight(new Node(data));
                    return;
                }
                rootNode = rootNode.getRight();
            }else {
                System.out.println("You insert a duplicate value");
                return;
            }
        }
    }


    public Node insertElementWithRecursion(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.getData()){
            root.setLeft(this.insertElementWithRecursion(root.getLeft(),data));

        } else if(data > root.getData()){
            root.setRight(this.insertElementWithRecursion(root.getRight(),data));
        }
        return root;
    }
    // searching with element and return node
 public Node findMatchingElementNode(Node root,int searchElement){
        if(root == null){
            System.out.println("Tree is empty");
            return null;
        }

        if(root.getData() == searchElement){
            return root;
        }

        if(searchElement < root.getData()){
           return this.findMatchingElementNode(root.getLeft(),searchElement);
        }else if (searchElement > root.getData()){
            return this.findMatchingElementNode(root.getRight(),searchElement);
        }

        return null;
 }

    //search with DSF

    // preOrder

    public Node searchWithPreOrder(Node root,int searchElement){
        if(root == null){
            System.out.println("Tree is empty or element is not present");
            return null;
        }

        if(root.getData() == searchElement){
            return root;
        }

        root = searchWithPreOrder(root.getLeft(),searchElement);
        if(root != null){
            return root;
        }

        root = searchWithPreOrder(root.getRight(),searchElement);
        return root;
    }

    //inOrder
    public Node inOrder(Node root,int searchElement){
        if(root == null){
            System.out.println("BST Tree is empty");
            return null;
        }

        Node leftRoot = inOrder(root.getLeft(),searchElement);
        if(leftRoot != null){
            return leftRoot;
        }

        if(root.getData() == searchElement){
            return root;
        }

        root = inOrder(root.getRight(),searchElement);
        return root;
    }


    // post order
    public Node postOrder(Node root,int searchElement){
        if(root == null){
            System.out.println("BST Tree is empty");
            return null;
        }

        Node leftResult = postOrder(root.getLeft(),searchElement);
        if(leftResult != null){
            return leftResult;
        }

        Node rightResult = postOrder(root.getRight(),searchElement);
        if(rightResult != null){
            return rightResult;
        }

        return root.getData() == searchElement ? root : null;
    }


    public Node deletion(Node root,int data){
        if(root == null){
            System.out.println("BST is empty or element is not present");
            return root;
        }

        if( data < root.getData()){
           root.setLeft(deletion(root.getLeft(),data));
        }else if(data > root.getData()){
            root.setRight(deletion(root.getRight(),data));
        }else {
            if(root.getLeft()==null && root.getRight() == null){
                return null;
            }
            if(root.getLeft() == null){
                return root.getRight();
            }
            if(root.getRight() == null){
                return root.getLeft();
            }

            // find inorder successor
            Node findInOrderSuccessor = findMinNode(root.getRight());
            root.setData(findInOrderSuccessor.getData());
            root.setRight(deletion(root.getRight(),findInOrderSuccessor.getData()));
            return root;
        }

        // if element are not  then return root
        return root;
    }

    private Node findMinNode(Node node){
        if(node.getLeft() != null){
            return findMinNode(node.getLeft());
        }
        return node;
    }

}
