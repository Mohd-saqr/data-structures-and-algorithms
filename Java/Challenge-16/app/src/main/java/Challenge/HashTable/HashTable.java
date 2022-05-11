package Challenge.HashTable;

import java.util.*;


/*
this implementation  in chaining algorithm we can use the open addressing also.
 */

public class HashTable<K, V> {
    private int bound; // the bound of the Hash table(how many buckets you need)
    private int size;
    private final LinkedList<Entry<K, V>>[] entries;

    // default  constructor with bound
    public HashTable(int bound) {
        this.bound = bound;
        entries = new LinkedList[bound];
    }


    public void put(K kay, V value) {
        int index = hashedCode(kay);
        /*
        if the buckets in this index is null
        */
        LinkedList<Entry<K,V>> entries1=entries[index];
        if (entries1 == null) {
            entries[index] = new LinkedList<>();
        }
        LinkedList<Entry<K, V>> bucket = entries[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.getKay() == kay) {
                entry.setValue(value);
                return;
            }

        }
        entries[index].addFirst(new Entry<>(kay, value)); // we use add first because it faster than add last
        size++;

    }

    public V get(K kay) {
        /// get the index
        int index = hashedCode(kay);
        // initialise the buckets;
        LinkedList<Entry<K, V>> bucket = entries[index];
        // if the hash table is empty
//        throw new IllegalArgumentException("Empty HashTable");
        if (bucket == null) return null;
        for (Entry entry : bucket) {
            if (entry.getKay() == kay)
                return (V) entry.getValue();
        }

        // if we not found the key
//        throw new IllegalArgumentException("the kay not found");
        return null;
    }

    public boolean contains(K kay) {
        int index = hashedCode(kay);
        LinkedList<Entry<K, V>> bucket = entries[index];
        if (bucket == null) return false;
        for (Entry<K, V> entry : bucket) {
            if (entry.getKay() == kay) return true;
        }
        return false;
    }

    public void remove(K kay) {
        int index = hashedCode(kay);
        LinkedList<Entry<K, V>> bucket = entries[index];
        if (bucket == null) throw new IllegalArgumentException("Key Not Found");
        for (Entry<K, V> entry : bucket) {
            if (entry.getKay() == kay) {
                bucket.remove(entry);
                size--;
            }
            else throw new IllegalArgumentException("Key Not Found");
        }

    }


    public Collection<K> keys(){
        Collection<K>keys=new ArrayList<>();
        Arrays.stream(entries).forEach(LL->{
            if (LL!=null) {
                LL.stream().forEach(entry -> {
                    keys.add(entry.getKay());
                });
            }
        });
        return keys;
    }

    public int hash(K key){
        /// if the key in found return the index of collection for that key if not return 0
        return (contains(key))?Math.abs(key.hashCode() % bound):0;
    }





    private int hashedCode(K key) {
        return Math.abs(key.hashCode() % bound);
    }

    public int getSize() {
        return size;
    }
}