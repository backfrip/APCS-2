public class BSTreeNode<T extends Comparable> {
    private T data;
    private BSTreeNode<T> left;
    private BSTreeNode<T> right;

    public BSTreeNode(T d) {
	data = d;
	left = right = null;
    }

    // Accessors
    public T getData() {
	return data;
    }

    public BSTreeNode<T> getLeft() {
	return left;
    }

    public BSTreeNode<T> getRight() {
	return right;
    }

    // Mutators
    public void setData(T d) {
	data = d;
    }

    public void setLeft(BSTreeNode<T> l) {
	left = l;
    }

    public void setRight(BSTreeNode<T> r) {
	right = r;
    }
}