package linkedList;

public class RecursiveDisplayList {
    Node head ;
    static class  Node{
        Node next;
        Node(int data){
            next=null;
        }

    }
    public void push(int new_data) {

       Node new_node = new Node(new_data);

        new_node.next = head;
        head = new_node;


    }
 public  Node insertBegin(Node head ,int data){
     Node temp=new Node(10);
     temp.next=head;
      return  head;
 }
    public static void main(String[] args) {
        RecursiveDisplayList list=new RecursiveDisplayList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.insertBegin(list.head, 10);
        printf(list.head);
       System.out.println(list.head);
    }

    private static void printf(Node head) {
        if (head==null)
            return;
        printf(head.next);
       //System.out.print(head.data + " ");
    }
}

