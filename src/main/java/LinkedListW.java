public interface LinkedListW<T, V> {

    T head();
    T last();
    int length();
    void append();
    void deleteWithValue(V value);
}
