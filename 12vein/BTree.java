import java.util.Random;

public class BTree<E> {
    public static final int PRE_ORDER = 0;
    public static final int IN_ORDER = 1;
    public static final int POST_ORDER = 2;

    private TreeNode<E> root;
    private Random randy;

    public BTree() {
	this(Math.random() * 10000);
    }

    public BTree(int seed) {
	root = new TreeNode<E>();
	randy = new Random(seed);
    }

    public void add(E data) {

    }

    public void add(TreeNode<E> parent, TreeNode<E> child) {
	if (randy.nextInt(2) == 0)
	    if (parent.hasLeft())
		add(parent.getLeft(), child);
	    else
		parent.setLeft(child);
	else if (parent.hasRight())
	    add(parent.getRight(), child);
	else
	    parent.setRight(child);
    }
}