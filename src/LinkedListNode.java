
public class LinkedListNode {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head =null;
    public Node tail =null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next = newNode;
            tail=newNode;
        }
    }

    public int countNodes(){
        int count =0;
        Node current = head;

        while(current != null){
            count ++;
            current = current.next;
        }
        return count;
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while(current != null){
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public void removeLast(){
        Node current = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        System.out.println("Nodes After delete:");

        while(current.next.next != null){
            System.out.println(current.data+" ");
            current = current.next;
        }
        current.next=null;
//        System.out.println("Last Element"+current.data+" ");
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Linked list is empty...");
            return;
        }
        head =head.next;

    }


    public static void main(String []args){
        LinkedListNode sList = new LinkedListNode();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        sList.display();
        System.out.println("Count of nodes present in list "+sList.countNodes());
        sList.removeLast();
        System.out.println("After Remove last");
        sList.display();
        sList.removeFirst();
        System.out.println("After Remove first");
        sList.display();


    }
}
