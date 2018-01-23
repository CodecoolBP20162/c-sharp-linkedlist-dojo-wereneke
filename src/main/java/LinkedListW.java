public interface LinkedListW {

    Node head();
    Node last();
    int length();
    void append(int value);
    void deleteWithValue(int value);
    void insert(int index, int value) throws IndexOutOfBoundsException;
}
