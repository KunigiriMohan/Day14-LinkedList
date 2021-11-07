public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();         //Creating object of LinkedList class
        list.push(56);

        System.out.println("Before Appending");
        list.show();
        System.out.println("After Appending");
        list.append(30);
        list.append(70);
        list.show();
    }
}