public class BinarySearchTree {
    private Node root;
    // Node class
    private class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
    }
    }
    // Insert node
    public void insert(int data) {
    root = insertNode(root, data);
    }
    private Node insertNode(Node node, int data) {
    if (node == null) {
        return new Node(data);
}
if (data < node.data) {
node.left = insertNode(node.left, data);
} else if (data > node.data) {
node.right = insertNode(node.right, data);
}
return node;
}
// Search node
public boolean search(int data) {
return searchNode(root, data);
}
private boolean searchNode(Node node, int data) {
if (node == null) {
return false;
}
if (data == node.data) {
return true;
}
if (data < node.data) {
return searchNode(node.left, data);
} else {
return searchNode(node.right, data);
}
}
// Delete node
public void delete(int data) {
root = deleteNode(root, data);
}
private Node deleteNode(Node node, int data) {
if (node == null) {
return null;
}
if (data < node.data) {
node.left = deleteNode(node.left, data);
} else if (data > node.data) {
node.right = deleteNode(node.right, data);
} else {
if (node.left == null && node.right == null) {
return null;
} else if (node.left == null) {
return node.right;
} else if (node.right == null) {
return node.left;
} else {
Node minNode = findMinNode(node.right);
node.data = minNode.data;
node.right = deleteNode(node.right,
minNode.data);
}
}
return node;
}
private Node findMinNode(Node node) {
while (node.left != null) {
node = node.left;
}
return node;
}
// Print tree (inorder traversal)
public void printTree() {
printNode(root);
}
private void printNode(Node node) {
if (node != null) {
printNode(node.left);
System.out.print(node.data + " ");
printNode(node.right);
}
}
public static void main(String[] args) {
BinarySearchTree bst = new BinarySearchTree();
bst.insert(50);
bst.insert(30);
bst.insert(20);
bst.insert(40);
bst.insert(70);
bst.insert(60);
bst.insert(80);
System.out.println("Tree:");
bst.printTree();
System.out.println("\nSearch 40:");
System.out.println(bst.search(40));
System.out.println("Delete 20:");
bst.delete(20);
System.out.println("Tree after deletion:");
bst.printTree();
}
}