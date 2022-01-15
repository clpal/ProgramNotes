package linkedList;

public class LinkedList {
    // head of linked list
    Node head;

    // Created a node
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // push data in node
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head; //  head node is reference to next node
        head = new_node; // this is pointer
    }
    // https://www.youtube.com/watch?v=4tU7d0TTiZQ&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=37

    public void insertAtPosition(int data, int pos) {
        Node toAdd = new Node(data);
        if (pos == 0) {
            toAdd.next = head;
            head = toAdd;
            return;
        }
        Node pre = head;
        for (int i = 0; i < pos - 1; i++) {
            pre = pre.next;

        }
        toAdd.next = pre.next;
        pre.next = toAdd;

    }

    public void delete(int pos) {
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node pre = head;
        for (int i = 0; i < pos - 1; i++) {
            pre = pre.next;

        }
        pre.next = pre.next.next;
    }

    public Node deleteHead() {
        if (head == null)
            return null;
        else return head.next;

    }

    public void insertAfter(Node head, int new_data) {
        if (head == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = head.next;
        head.next = new_node;
    }

    Node reverse() {
        Node curr = head;
        Node pre = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public void printlist() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        System.out.println("Created List: ");
        // list.printlist();
        // list.insertAfter(list.head, 8);
        // list.insertAtPosition(9,1);
        // list.delete(2);
        // System.out.println();
        //list.deleteHead();
        list.reverse();
        list.printlist();

    }

}
