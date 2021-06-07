package interfaces;

public interface BinaryTree <K, V> {

    void insertNode(K key);
    void deleteNode(K key);
    V getKey(K key);
}
