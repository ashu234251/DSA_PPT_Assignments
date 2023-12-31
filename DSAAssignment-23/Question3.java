package in.ineuron.question;

class Node {

	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

class Max_level {

	int max_level;
}

public class Question3 {
	Node root;
    Max_level max = new Max_level();
    void rightViewUtil(Node node, int level,
                       Max_level max_level)
    {
        if (node == null)
            return;
        if (max_level.max_level < level) {
            System.out.print(node.data + " ");
            max_level.max_level = level;
        }
        rightViewUtil(node.right, level + 1, max_level);
        rightViewUtil(node.left, level + 1, max_level);
    }
 
    void rightView() { rightView(root); }
    void rightView(Node node)
    {
 
        rightViewUtil(node, 1, max);
    }
    public static void main(String args[])
    {
    	Question3 tree = new Question3();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
 
        tree.rightView();
    }
}
