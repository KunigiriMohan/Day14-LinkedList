public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();         //Creating object of LinkedList class
        list.push(56);
        list.push(70);

        System.out.println("Before Inserting");
        list.show();
        System.out.println("After Inserting");
        list.insert(30);
        list.show();
    }
}