package HashMap;

import java.util.LinkedList;

public class Implementations {
    public class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        public class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;

            }
        }

        private int n;
        private LinkedList<Node>[] buckets;
        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }
        private void initBuckets(int capacity) {
            buckets = new LinkedList[capacity];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
        

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public int size() {
            return n;
        }

    public void put(K key,V value){
        int bi=HashFunc(key);
        LinkedList<Node> currBucket=buckets[bi];
        int ei=searchInBucket(currBucket, key);
        if (ei==-1) {
            Node node=new Node(key,value);
             currBucket.add(node);
             n++;
        } else{
            Node currNode=currBucket.get(ei);
            currNode.value=value;
        }
    }

        public V get(K key) {
            int bi=HashFunc(key);
            LinkedList<Node> currBucket =buckets[bi];
            int ei=searchInBucket(currBucket, key);
            if (ei!=-1) {
                Node currNode=currBucket.get(ei);
                return currNode.value;
            } else{
                return null;
            }
        }
        public V remove(K key){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket, key);
            if (ei!=-1) {
                Node currNode=currBucket.get(ei);
                V val=currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }

    }

    public static void main(String[] args) {
        Implementations impl = new Implementations();
        MyHashMap<String, Integer> map = impl.new MyHashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Size: " + map.size());
        System.out.println("Get 'one': " + map.get("one"));
        System.out.println("Get 'two': " + map.get("two"));

        map.put("one", 10);
        System.out.println("Get 'one' after update: " + map.get("one"));

        map.remove("two");
        System.out.println("Size after removing 'two': " + map.size());
        System.out.println("Get 'two': " + map.get("two"));
    }
}