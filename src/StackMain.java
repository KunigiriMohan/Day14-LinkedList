public class StackMain {

    public static void main(String[] args){
        Stack obj =new Stack();             //Creating object of Stack class
        obj.push(70);                   //pushing the data into LinkedList
        obj.push(30);
        obj.push(56);

        System.out.println("Elements Present in LInked List in Stack order are :");
        obj.printStack();                               //Calling printStack() method to print element present in Linked List
        System.out.println();

        obj.peak();                                             //Calling peak and pop method for peak and pop operations
        System.out.println("Elements after peak");
        obj.printStack();
        System.out.println();
        obj.pop();
        System.out.println("Elements after  first pop ");
        obj.printStack();
        System.out.println();
        obj.pop();
        System.out.println("Elements after second pop ");
        obj.printStack();
    }
}
