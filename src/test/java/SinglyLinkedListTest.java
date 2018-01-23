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
        list.append(3);
        list.append(2);
        list.append(1);
        assertEquals(3, list.length());
    }

    @Test
    void testDeleteWithValueOn1elemList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(3);
        list.deleteWithValue(3);
        assertNull(list.head());
    }

    @Test
    void testIfDeleting1stElemWorks() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(3);
        list.append(2);
        list.deleteWithValue(3);
        assertEquals(2, list.head().data);
    }

    @Test
    void testIfDeleteWorksOnNodesInTheMiddle() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(3);
        list.append(2);
        list.append(1);
        list.deleteWithValue(2);
        assertEquals("31", list.toString());
    }

    @Test
    void testInsertThrowsProperException()
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertThrows(IndexOutOfBoundsException.class, () -> list.insert(4, 4));
        assertThrows(IndexOutOfBoundsException.class, () -> list.insert(-1, -1));
    }

    @Test
    void testInsertWorksOnLowerBound() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.insert(0, 0);
        assertEquals(0, list.head().data);
    }
    @Test
    void testInsertWorksOnUpperBound() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.insert(1, 2);
        assertEquals("12", list.toString());
    }
}