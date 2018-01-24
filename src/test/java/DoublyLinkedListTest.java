import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void testConstructor() {
        DoublyLinkedList list = new DoublyLinkedList();
    }

    @Test
    void testAppendFirst() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(0);
        assertEquals(0, list.head.data);
    }

    @Test
    void testAppendFew() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(0);
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals("0123", list.toString());
    }

    @Test
    void testLengthOnEmptyList() {
        DoublyLinkedList list = new DoublyLinkedList();
        assertEquals(0, list.length());
    }

    @Test
    void testLengthOnNotEmptyList() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(0);
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(4, list.length());
    }

    @Test
    void testPrependOnEmptyList() {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.prepend(1);
        assertEquals(1, linkedList.head.data);
    }

    @Test
    void testPrependOnNotEmpty() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(0);
        list.append(1);
        list.append(2);
        list.append(3);
        list.prepend(-1);
        assertEquals(-1, list.head.data);
    }

    @Test
    void testDeleteWithValueOnEmpty() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.deleteWithValue(1);
    }

    @Test
    void testDeleteWithValueOnNotEmptyWhereValueExist() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(0);
        list.append(1);
        list.append(2);
        list.append(3);
        list.deleteWithValue(2);
        assertEquals("013", list.toString());
    }

}