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
     * popLast() to delete last value in Linked List
     * */
    void popLast() {
        if (head == null)                                       //before deleting last element checking length of Linked List
        {
            System.out.println("List is Empty");
        }
        else if (head != tail)
        {
            Node current = head;
            while (current.next != tail)
            {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
        else
        {
            head = tail = null;
        }
    }
}