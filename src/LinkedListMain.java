public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();         //Creating object of LinkedList class
        list.push(70);

        System.out.println("Before Adding");
        list.show();
        System.out.println("After Adding");
        list.add(30);
        list.add(56);
        list.show();
    }
}