
package trees;

public class ValidBST {

	static boolean checkBST(Node root) {
		return checkBST(root, null, null);
	}

	static boolean checkBST(Node root, Integer min, Integer max) {
		if (root == null) {
			return true;
		}
		if (min != null && root.data <= min 
				|| max != null && root.data >= max) {
			return false;
		}
		return checkBST(root.left, min, root.data) && checkBST(root.right, root.data, max);
	}

	public static void main(String args[]) {
		Node root = new Node(10);
		root.insert(5);
		root.insert(15);
		root.insert(12);
		root.insert(25);
		if (checkBST(root)) {
			System.out.println("valid BST");
		} else {
			System.out.println("Not a valid BST");
		}
	}

}

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
	}

	public void insert(int value) {
		if (value <= data) {
			if (left == null) {
				left = new Node(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new Node(value);
			} else {
				right.insert(value);
			}
		}
	}
}
