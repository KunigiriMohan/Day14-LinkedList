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
     * add() method to add data to Linked List
     * */
    void add(int data){
        Node add1 = new Node(data);
        if (head==null)
        {
            head=add1;
            tail=add1;
        }
        else
        {
            add1.next=head;
            head=add1;
        }
    }
    /*
     * searchElement() method for searching element in a LinkedList
     * */
    public boolean searchElement(int data){
        Node temp = head;
        while (temp!=null){
            if(temp.data==data)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    /*
     * addElement() method adding element to LinkedList
     * */
    public void addElement(int number){
        Node temp = head;
        Node num = new Node(number);
        while (temp!=null)
        {
            if (temp.data==30)
            {
                Node newNode=temp.next;
                temp.next=num;
                num.next=newNode;
            }
            temp =temp.next;
        }
    }
}