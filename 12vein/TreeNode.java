public class TreeNode<T> {
    private T self;
    TreeNode<T> left, right;
    private int c;

    public TreeNode() {
	this(null, null, null);
    }

    public TreeNode(T data) {
	this(data, null, null);
    }

    public TreeNode(T data, TreeNode<T> leftChild) {
	this(data, leftChild, null);
    }

    public TreeNode(T data, TreeNode<T> leftChild, TreeNode<T> rightChild) {
	self = data;
	left = leftChild;
	right = rightChild;
    }

    public String toString() {
	return getLeft().getData() + " " + getData() + " " + getRight().getData();
    }

    public void setData(T data) {
	self = data;
    }

    public T getData() {
	return self;
    }

    public void setLeft(TreeNode<T> child) {
	left = child;
    }

    public TreeNode<T> getLeft() {
	return left;
    }

    public void setRight(TreeNode<T> child) {
	right = child;
    }

    public TreeNode<T> getRight() {
	return right;
    }

    public boolean hasData() {
	return self != null;
    }

    public boolean hasLeft() {
	return left != null;
    }

    public boolean hasRight() {
	return right != null;
    }
}