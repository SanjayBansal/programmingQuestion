package linkedList;

public class CreatingAndTraversingLinkedList_01 {
    public static Node head;
    public static void main(String args[]){
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        //Assign nodes
        head.next = second;
        second.next = third;
        //Print linked nodes
        printNode(head);

    }

    private static void printNode(Node head) {
        Node n = head;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
}
