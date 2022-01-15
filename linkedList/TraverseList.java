package linkedList;


public class TraverseList {
    static class Node {
        Node next;
        int data;

        Node(int a) {
            data = a;
            next = null;
        }
    }

    public Node push(Node head, int data) {
        Node newNode = new Node(data);
  /*      newNode.next = head;
        head = newNode;*/

             head=newNode.next;
             //head.next=

return head;
    }

    public static void main(String[] args) {
       TraverseList list= new TraverseList();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
      //  list.push(head,6);
        printf(  list.push(head,6));

    }

    private static void printf(Node head) {
        int count = 0;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
            count++;
            //System.out.println(count);
        }
    }
}
