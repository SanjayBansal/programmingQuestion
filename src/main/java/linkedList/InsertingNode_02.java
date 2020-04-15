package linkedList;

public class InsertingNode_02 {
    //Insertion can be done at front,middle,and last;
    static Node head;
    public static void main(String args[]){
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = forth;

        printLinkedList(head);

        System.out.println();
        System.out.println("After front insertion");

        head = InsertInFront(head,0);
        printLinkedList(head);

        System.out.println();
        System.out.println("Middle insertion");

        InsertInMiddle(head.next.next.next,33);
        printLinkedList(head);

        System.out.println();
        System.out.println("Insertion as last");

        InsertInLast(head,5);
        printLinkedList(head);

    }

    private static void InsertInLast(Node head, int i) {
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        Node last = node;
        Node new_node = new Node(i);
        last.next=new_node;
    }

    private static void InsertInMiddle(Node middleNode, int i) {
        Node node_new = new Node(i);
        node_new.next = middleNode.next;
        middleNode.next=node_new;
        //System.out.println(middleNode.next.data);
    }

    private static Node InsertInFront(Node head, int i) {
        Node front = new Node(i);
        front.next = head;
        head = front;
        return head;
    }

    private static void printLinkedList(Node head) {
        Node n = head;
        while(n != null){
            System.out.print(n.data+ " ");
            n = n.next;
        }
    }
}
