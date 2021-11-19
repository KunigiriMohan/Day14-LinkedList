public class StackMain {

    public static void main(String[] args){
        Stack obj =new Stack();             //Creating object of Stack class
        obj.enQueUe(56);                //Inserting data in LinkedList in queue
        obj.enQueUe(30);
        obj.enQueUe(70);

        System.out.println("Elements in LinkedList in Queue");

        obj.printStack();               //printing data present inLinkedList in Queue order

    }
}
