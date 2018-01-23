public class SinglyLinkedList implements LinkedListW {


    Node head;

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
        Node last = head;
        int length = 0;
        while (last.next != null) length++;
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