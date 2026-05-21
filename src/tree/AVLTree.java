package tree;

public class AVLTree {

    private AVLTreeNode avlTreeNode;

    private int getHeight(AVLTreeNode avlTreeNode){
        return avlTreeNode == null ? 0 : avlTreeNode.getHeight();
    }

    private int balanceFactor(AVLTreeNode avlTreeNode){
        return avlTreeNode == null ? 0 : getHeight(avlTreeNode.getLeft()) - getHeight(avlTreeNode.getRight());
    }


}
