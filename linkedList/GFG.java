package linkedList;

public class GFG {
    public static void main(String[] args) {
        Node head = new Node();
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        head.data = 1;
        head.next = first;

        first.data = 2;
        first.next = second;

        second.data = 3;
        second.next = third;

        third.data = 4;
        third.next = null;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;

        }
    }

    static class Node {
        int data;
        Node next;
    }
}

