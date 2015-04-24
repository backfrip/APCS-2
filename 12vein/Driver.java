public class Driver {
    public static void main(String[] args) {
	TreeNode<Integer> twig = new TreeNode<Integer>();
	twig.setData(0);
	twig.setLeft(new TreeNode<Integer>());
	twig.getLeft().setData(1);
	twig.setRight(new TreeNode<Integer>());
	twig.getRight().setData(2);
	System.out.println(twig);
    }
}