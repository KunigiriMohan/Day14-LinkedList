import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    public void searchElement() {
        LinkedList linkedList= new LinkedList();
        linkedList.push(30);
        linkedList.push(30);
        linkedList.push(70);
        boolean output =linkedList.searchElement(30);

        assertEquals(true,output);
    }
}