class LinkedList {

    Node head;
    Node tail;
    /*
     * push() method to push elements to Nodes in linked list
     * */
    public Node push(int data) {
        Node newNode = new Node(data);      //Creating new node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return newNode;
    }
    /*
     * show() method to show elements present in Linked List
     * */
    public void show() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    /*
     * append() method to append elements to Linked List
     * */
    void append(int data){
        Node add1 = new Node(data);
        if (head==null)
        {
            head=add1;
        }
        else
        {
            Node n =head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=add1;
        }
    }
}
