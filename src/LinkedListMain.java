public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();         //Creating object of LinkedList class
        list.push(70);
        list.push(30);
        list.push(56);

        System.out.println("Before Deleting Last element");
        list.show();
        System.out.println();
        System.out.println("After Deleting Last element");
        list.popLast();
        list.show();
    }
}