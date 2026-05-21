package tree;
import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchTreeWithOperations {

    public Node root;

    public BinarySearchTreeWithOperations(Node rootNode){
        System.out.println("Initlize Binary Search Tree with Root Node");
        this.root = rootNode;
    }

    public BinarySearchTreeWithOperations(){
    }

    public void insertElement(Node root , int data){
        if(root == null){
            root = new Node(data);
            return;
        }

        Node cuurentNode = root;
        while (cuurentNode != null){
            int currentNodeData = cuurentNode.getData();
            if( data < currentNodeData){
                if(cuurentNode.getLeft() == null){
                    cuurentNode.setLeft(new Node(data));
                    return;
                }
                cuurentNode = cuurentNode.getLeft();
            }else if(data > currentNodeData){
                if(cuurentNode.getRight() == null){
                    cuurentNode.setRight(new Node(data));
                    return;
                }
                cuurentNode = cuurentNode.getRight();
            }
        }
    }

    public Node insertElementWithRecursion(Node root,int data){
        if(root == null){
            return new Node(data);
        }

        if(data < root.getData()){
            root.setLeft(insertElementWithRecursion(root.getLeft(),data));
        } else if(data > root.getData() ) {
            root.setRight(insertElementWithRecursion(root.getRight(),data));
        }

        return root;
    }

    public Node searchElementWithLoop(Node root,int searchElement){
        if(root == null){
            System.out.println("BST is empty");
            return root;
        }

        Node currentRoot = root;
        while (currentRoot != null){

            int rootData = currentRoot.getData();
            if(currentRoot.getData() == searchElement){
                break;
            }
            if(searchElement < rootData){
                currentRoot = currentRoot.getLeft();
            }else if(searchElement > rootData){
                currentRoot = currentRoot.getRight();
            }
        }

        if(currentRoot == null){
            System.out.println("Element not found");
            return currentRoot;
        }

        return currentRoot;
    }

    // search element useing recursion
    public Node searchElementWithRecursion(Node node,int searchElement){

        if(node == null){
            System.out.println("BST is empty or element not found");
            return node;
        }

        if(searchElement == node.getData()){
            return node;
        }

        if(searchElement < node.getData()){
            return searchElementWithRecursion(node.getLeft(),searchElement);
        } else if(searchElement > node.getData()){
            return searchElementWithRecursion(node.getRight(),searchElement);
        }

        return null;
    }

    public Node searchElementWithPreorder(Node root,int searchElement){
        if(root == null){
            System.out.println("BST is empty or element not found");
            return null;
        }

        if(root.getData() == searchElement){
            return root;
        }

        Node leftNode = searchElementWithPreorder(root.getLeft(),searchElement);
        if(leftNode != null){
            return leftNode;
        }
        return searchElementWithPreorder(root.getRight(),searchElement);
    }


    public Node searchElementWithInorder(Node root,int searchElement){
        if(root == null){
            System.out.println("BST is empty or element not found");
            return null;
        }

        Node leftNode = searchElementWithInorder(root.getLeft(),searchElement);
        if(leftNode != null){
            return leftNode;
        }

        if(root.getData() == searchElement){
            return root;
        }

        return searchElementWithInorder(root.getRight(),searchElement);
    }


    public Node searchElementWithPostOrder(Node root,int searchElement){
        if(root == null){
            System.out.println("BST is empty or element not found");
            return null;
        }

        Node leftNode = searchElementWithPostOrder(root.getLeft(),searchElement);
        if(leftNode != null){
            return leftNode;
        }

        Node rightNode = searchElementWithPostOrder(root.getRight(),searchElement);
        if(rightNode != null){
            return rightNode;
        }

        return root.getData() == searchElement ? root : null;
    }


    public Node deleteInOrderSuccessor(Node node,int deleteElement){
        if(node == null){
            System.out.println("BST is empty");
            return null;
        }

        int nodeData = node.getData();
        if(deleteElement < nodeData){
            node.setLeft(deleteInOrderSuccessor(node.getLeft(),deleteElement));
        }else if(deleteElement > nodeData){
            node.setRight(deleteInOrderSuccessor(node.getRight(),deleteElement));
        }else {
            if(node.getLeft() == null && node.getRight() == null){
                return null;
            }

            if(node.getLeft() == null){
                return node.getRight();
            }

            if(node.getRight() == null){
                return node.getLeft();
            }

            Node inOrderSuccessor = finInOrderSuccessor(node.getRight());
            node.setData(inOrderSuccessor.getData());
            node.setRight(deleteInOrderSuccessor(node.getRight(),inOrderSuccessor.getData()));
        }
        return node;
    }

    public Node finInOrderSuccessor(Node node){
        if(node.getLeft() != null){
            return finInOrderSuccessor(node.getLeft());
        }
        return node;
    }

    public void printBstInOrder(Node root){
        if(root == null){
            System.out.println("Tree is Empty");
            return;
        }
        printBstInOrder(root.getLeft());
        System.out.print(root.getData()+" ");
        printBstInOrder(root.getRight());
    }

    public void printBstPreOrder(Node root){
        if(root == null){
            System.out.println("Tree is Empty");
            return;
        }
        System.out.print(root.getData()+" ");
        printBstPreOrder(root.getLeft());
        printBstPreOrder(root.getRight());
    }


    public void printBstPostOrder(Node root){
        if(root == null){
            System.out.println("Tree is Empty");
            return;
        }
        printBstPostOrder(root.getLeft());
        printBstPostOrder(root.getRight());
        System.out.print(root.getData()+" ");
    }

    public void printBSTTreeWithBFS(Node root){
        if(root == null){
            System.out.println("BST is empty");
            return ;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
           int size = queue.size();
            while (size-- > 0){
               Node node = queue.poll();
               System.out.print(node.getData() +" ");
               if(node.getLeft() != null){
                   queue.add(node.getLeft());
               }
               if(node.getRight() != null){
                   queue.add(node.getRight());
               }
           }
            System.out.println();
        }
    }
}
