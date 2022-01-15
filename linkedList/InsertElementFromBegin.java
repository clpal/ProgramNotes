package linkedList;

public class InsertElementFromBegin {
    Node head;
    static class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;

        }

    }
    /* This function is in LinkedList class. Inserts a
    new Node at front of the list. This method is
    defined inside LinkedList class shown above */
    public void push(int new_data)
    {
	/* 1 & 2: Allocate the Node &
			Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        return head;
    }

    private static void printf(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        printf(head.next);

    }

    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head, 10);
        head = insertBegin(head, 20);
        head = insertBegin(head, 30);
        //  printf( head);

        while (head != null) {

            System.out.println(head.data);
            head = head.next;
        }
    }
}

