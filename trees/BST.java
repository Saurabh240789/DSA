package trees;

public class BST {

	int data;
	BST left, right;

	BST(int data) {
		this.data = data;
	}
	
	public static void main(String args[]) {
		
		BST bst = new BST(10);
		bst.insert(5);
		bst.insert(15);
		bst.inOrderTraversal();
		if(bst.contains(5)) {
			System.out.println("true");
		}
		
	}

	public void insert(int value) {
		if (value <= data) {
			if (left == null) {
				left = new BST(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new BST(value);
			} else {
				right.insert(value);
			}
		}
	}

	public boolean contains(int value) {
		if (value == data) {
			return true;
		} else if (value < data) {
			if (left == null) {
				return false;
			} else {
				return left.contains(value);
			}
		} else {
			if (right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		}
	}

	public void inOrderTraversal() {
		if (left != null) {
			left.inOrderTraversal();
		}
		System.out.println(data);
		if (right != null) {
			right.inOrderTraversal();
		}
	}

}
