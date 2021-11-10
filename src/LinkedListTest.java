import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    LinkedList linkedList= new LinkedList();
    @Test
    public void searchElement() {
        LinkedList linkedList= new LinkedList();
        linkedList.push(30);
        linkedList.push(30);
        linkedList.push(70);
        boolean output =linkedList.searchElement(30);

        assertEquals(true,output);
    }
    @Test
    public void addElement(){
        linkedList.addElement(40);
        Node temp=linkedList.head;
        Node num = new Node(40);
        while(temp!=null)
        {
            if (temp.data==30)
            {
                assertEquals(30,temp.data);
                Node newNode=temp.next;
                temp.next=num;
                assertEquals(40,num);
                num.next=newNode;
            }
            temp =temp.next;
        }
    }
}