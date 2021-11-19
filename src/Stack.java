public class Stack {
    private LinkedList linkedList;
/*
* Constructor of Stack Class to initialize Instance Variables
* */
    public Stack (){
        this.linkedList= new LinkedList();
    }
    /*
    * push() method to push data to LinkedList
    * */
    public void push(int data){
        linkedList.add(data);
    }
    /*
    * peak() method to peak data from LinkedList
    * */
    public int peak(){
        return linkedList.head.data;
    }
    /*
    * pop() method to pop the data from LinkedList
    * */
    public int pop(){
        return linkedList.pop();
    }
    /*
    * printStack() method to print data present in Linked list
    * */
    public void printStack(){
        linkedList.show();
    }
    /*
    * enQueue() method to insert data into LinkedList in Queue
    * */
    public void enQueUe(int data){
        linkedList.append(data);
    }
    /*
    * deQueue() method to dequeue data in LinkedList
    * */
    public void deQueue(){
        linkedList.pop();
    }
}
