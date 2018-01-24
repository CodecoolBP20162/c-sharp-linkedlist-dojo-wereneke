public class SinglyLinkedList implements LinkedListW {


    protected Node head;

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
    public void prepend(int data) {

        Node toPrepend = new Node(data);
        if (head == null) {
            head = toPrepend;
            return;
        }

        toPrepend.next = head;
        head = toPrepend;
    }

    @Override
    public void deleteWithValue(int value) {

        if (head == null) return;
        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return;
            }
        }
    }

    @Override
    public void insert(int index, int data) throws IndexOutOfBoundsException {

        if (index < 0 || index > length()) throw new IndexOutOfBoundsException();

        if (index==0) {
            prepend(data);
            return;
        }

        Node before = head;
        Node toInsert = new Node(data);

        for (int i=0; i<index-1; i++) {
            before = before.next;
        }

        toInsert.next = before.next;
        before.next = toInsert;
        return;
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