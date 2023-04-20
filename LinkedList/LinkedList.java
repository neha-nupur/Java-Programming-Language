public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; // to count size of LL


    // Add First into the list
    public void AddFirst(int data) {
        // step 1. Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step 2. Assign head into it. i.e., newNode.next = head
        newNode.next = head;

        // step 3. Update head
        head = newNode;
    }

    // Add Last into the list
    public void AddLast(int data) {
        // step 1. Create a newNode
        Node newNode = new Node(data);
        size++;
        if(tail == null) {  // if(head == null) 
            head = tail = newNode;
            return;
        }

        // step 2. Assign newNode to the tail.next. i.e., tail.next = newNode
        tail.next = newNode;

        // step 3. Update tail
        tail = newNode;
    }

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }  

        // Create a temp to traverse till the end of the list
        Node temp = head;
        // Loop to traverse by checking temp!= null
        while(temp!= null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // insert at middle
    public void InsertMiddle(int idx, int data) {
        if(head == null) {
            AddFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0; // to track temp's idx

        while(i < idx-1) {  // idx-1 = prev
            temp = temp.next;
            i++;
        }

        // linkage part
        // i = idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.InsertMiddle(2, 3);
        ll.print();

        System.out.println(ll.size);
    }
}