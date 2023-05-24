package Hashmap;
import java.util.*;
public class Hash_Code {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; //n
        private LinkedList<Node> buckets[];

        public HashMap() {
           this.size = 0;
           this.buckets = new LinkedList[4];
           for (int i = 0; i < 4; i++) {
               this.buckets[i] = new LinkedList<>();
           }
        }
        public void put (K key, V value){

        }
        public boolean containsKey(K key) {
            return false;
        }
    }
}
