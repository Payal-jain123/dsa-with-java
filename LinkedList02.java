class Node {
    int data;         // Data stored in the node
    Node next;        // Reference to the next node in the linked list
    // Constructor
    public Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    // Constructor
    public Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class LinkedList02 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        // Create a Node 'x' with the first element of the array
        Node x = new Node(arr[0]);
        // Create a reference 'y' pointing to the same Node 'x'
        Node y = x;
        // Print the reference 'y', which represents the memory address of the Node 'x'
        System.out.println(y);
    }
}
