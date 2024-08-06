                                
class Node {
    int data;
    Node next;
    Node child;
    Node() {
        this.data = 0;
        this.next = null;
        this.child = null;
    }

    Node(int x) {
        this.data = x;
        this.next = null;
        this.child = null;
    }

    Node(int x, Node nextNode, Node childNode) {
        this.data = x;
        this.next = nextNode;
        this.child = childNode;
    }
}

public class FlatteningLL {
    public static Node merge(Node list1, Node list2) {
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                res.child = list1;
                res = list1;
                list1 = list1.child;
            } else {
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
        }
        if (list1 != null) {
            res.child = list1;
        } else {
            res.child = list2;
        }
        if (dummyNode.child != null) {
            dummyNode.child.next = null;
        }

        return dummyNode.child;
    }
    public static Node flattenLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
   Node mergedHead = flattenLinkedList(head.next);
        head = merge(head, mergedHead);
        return head;
    }
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }
    public static void printOriginalLinkedList(Node head, int t1) {
        while (head != null) {
            System.out.print(head.data);
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, t1 + 1);
            }
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < t1; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Create a linked list with child pointers
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.child = new Node(10);

        head.next.next = new Node(1);
        head.next.next.child = new Node(7);
        head.next.next.child.child = new Node(11);
        head.next.next.child.child.child= new Node(12);

        head.next.next.next = new Node(4);
        head.next.next.next.child = new Node(9);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.child = new Node(6);
        head.next.next.next.next.child = new Node(8);

        // Print the original
        // linked list structure
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten the linked list
        // and print the flattened list
        Node flattened = flattenLinkedList(head);
        System.out.print("\nFlattened linked list: ");
        printLL(flattened);
    }
}


                                
                            