public class DoublyLinkedList implements LinkedListW {

    protected BidirectionalNode head;
    protected BidirectionalNode tail;


    @Override
    public Node head() {
        return this.head;
    }

    @Override
    public Node last() {
        return this.tail;
    }

    @Override
    public int length() {

        if (head==null) return 0;
        int length = 1;
        ListIterator iterator = iterator();

        while (iterator.hasNext()) {
            iterator.next();
            length++;
        }
        return length;
    }

    @Override
    public void append(int value) {

        BidirectionalNode appender = new BidirectionalNode(value);

        if (head==null) {
            head = appender;
            tail = head;
            return;
        }

        tail.next = appender;
        appender.previous = tail;
        tail = appender;
    }

    @Override
    public void prepend(int value) {

        if (head == null) {
            head = new BidirectionalNode(value);
            return;
        }

        BidirectionalNode prepender = new BidirectionalNode(value);
        prepender.next = head;
        head = prepender;
    }

    @Override
    public void deleteWithValue(int value) {

        if (this.length()==0) return;

        ListIterator iterator = new ListIterator(this);
        BidirectionalNode toDelete = iterator.current;

        while (toDelete.data != value && iterator.hasNext()) {
            toDelete = (BidirectionalNode) iterator.next();
        }

        if (toDelete.data == value) toDelete.previous.next = toDelete.next;
    }

    @Override
    public void insert(int index, int value) throws IndexOutOfBoundsException {

        if (index<0 || index>length()) throw new IndexOutOfBoundsException();

        if (index==0) {
            prepend(value);
            return;
        }

        if (index==length()) {
            append(value);
            return;
        }

        BidirectionalNode before = head;
        BidirectionalNode toInsert = new BidirectionalNode(value);

        if (index<=length()/2) {

            for (int i=0; i<index-1; i++) {
                before = before.next;
            }
            toInsert.next = before.next;
            before.next = toInsert;
            toInsert.previous = before;
        }
        else {

            BidirectionalNode after = tail;
            for (int i=length(); i>index; i--) {
                after = after.previous;
            }
            toInsert.previous = after.previous;
            toInsert.next = after;
            after.previous = toInsert;
        }
    }

    ListIterator iterator() {
        return new ListIterator(this);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("");
        BidirectionalNode current = head;
        while (current != null) {
            sb.append(current.data);
            current = current.next;
        }
        return sb.toString();
    }
}
