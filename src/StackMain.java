public class StackMain {

    public static void main(String[] args){
        Stack obj =new Stack();             //Creating object of Stack class
        obj.push(70);                   //pushing the data into LinkedList
        obj.push(30);
        obj.push(56);

        System.out.println("Elements Present in LInked List in Stack order are :");
        obj.printStack();                   //Calling printStack() method to print element present in Linked List
    }
}
