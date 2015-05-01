public class BSTree<E extends Comparable> {

    private BSTreeNode<E> root;

    public BSTree() {
	root = null;
    }

    public BSTree(E val) {
	root = new BSTreeNode<E>(val);
    }

    public boolean isEmpty() {
	return root == null;
    }

    public boolean isLeaf(BSTreeNode<E> node) {
	return (node.getLeft() == null && node.getRight() == null);
    }

    /**
     * Wrapper for the recursive add method.
     * 
     * @param val
     *            the value to be added to the BSTree
     */
    public void add(E val) {
	root = add(root, new BSTreeNode<E>(val));
    }

    /**
     * Add child to the correct place in the tree rooted at parent.
     * 
     * @param parentF
     *            the BSTreeNode to which tn should be added
     * @param child
     *            the BSTReeNode to be added
     * @return a BSTreeNode that is the child of parent
     */
    private BSTreeNode<E> add(BSTreeNode<E> parent, BSTreeNode<E> child) {
	return null;

    }

    /**
     * Wrapper for the recursive remove method.
     * 
     * @param val
     *            the value to be removed
     */
    public void remove(E val) {
	root = remove(root, val);
    }

    /**
     * Should remove the value val from the tree rooted at parent, if it exists.
     * 
     * @param parent
     *            the root of the tree from which to remove
     * @param val
     *            the value to remove
     */
    private BSTreeNode<E> remove(BSTreeNode<E> parent, E val) {
	return null;
    }


    /**
     * Wrapper for the recursive inOrder method.
     */
    public void inOrder() {
	inOrderHelper(root);
	System.out.println();
    }

    /**
     * Performs an in-order traversal for the tree with root node.
     * 
     * @param node
     *            the root of the tree to traverse
     */
    public void inOrderHelper(BSTreeNode<E> node) {
	if (node == null)
	    return;
	inOrderHelper(node.getLeft());
	System.out.print(node.getData() + " ");
	inOrderHelper(node.getRight());
    }


    public static void main(String[] args) {
	BSTree<Integer> syndrome = new BSTree<Integer>(10);
	syndrome.inOrder();
    }

}