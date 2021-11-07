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
     * insert() method to insert value.
     * */
    void insert(int data) {
        Node toAdd= new Node(data);
        head.next=toAdd;
        toAdd.next=tail;
    }

}