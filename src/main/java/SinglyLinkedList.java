public class SinglyLinkedList implements LinkedListW {


    private Node head;

    @Override
    public Node head() {
        return this.head;
    }

    @Override
    public Node last() {

        Node last = head;
        while (last.next != null) last = last.next;
        return last;
    }

    @Override
    public int length() {
        Node current = head;
        int length = 0;
        if (current != null) length++;
        while (current.next != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    @Override
    public void append(int data) {

        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = last();
        current.next = new Node(data);
    }

    @Override
    public void deleteWithValue(int value) {

        Node current = head;
        if (current.data == value) head = current.next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            current = current.next;
        }
        return sb.toString();
    }
}