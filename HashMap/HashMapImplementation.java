import java.util.LinkedList;

public class HashMapImplementation {

    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Number of entries in the map
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        // Search for a node with the key in the given bucket, return its index or -1
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) { // Use .equals() for comparison
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket, key);

            if (ei == -1) {
                Node node = new Node(key, value);
                currentBucket.add(node);
                n++;
            } else {
                // Update case
                Node currNode = currentBucket.get(ei);
                currNode.value = value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        mp.put("d", 4);
        System.out.println("Size: " + mp.size());
        System.out.println("Get key 'b': " + mp.get("b"));
        System.out.println("Remove key 'a': " + mp.remove("a"));
        System.out.println("Size after removal: " + mp.size());
    }
}
