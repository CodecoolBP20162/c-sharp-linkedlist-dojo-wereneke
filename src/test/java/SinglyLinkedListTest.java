import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void testConstructor() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertNull(list.head());
    }

    @Test
    void testAppend1element() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        assertEquals("1", list.toString());
    }

    @Test
    void testLast() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(3, list.last().data);
    }

    @Test
    void testLength() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(3, list.length());
    }
}