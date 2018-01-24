import java.util.Iterator;

public class ListIterator implements Iterator {

    DoublyLinkedList lL;
    BidirectionalNode current;

    public ListIterator(DoublyLinkedList lL) {
        this.lL = lL;
        this.current = (BidirectionalNode) this.lL.head();
    }

    @Override
    public boolean hasNext() {
        return (current.next != null);
    }

    public boolean hasPrevious() {
        return (current.previous != null);
    }

    @Override
    public Object next() {
        if (this.hasNext()) current = current.next;
        return current;
    }

    public Object previous() {
        if (this.hasPrevious()) current = current.previous;
        return current;
    }
}
