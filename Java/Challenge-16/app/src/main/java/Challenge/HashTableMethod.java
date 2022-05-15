package Challenge;

import Challenge.HashTable.HashTable;
public class HashTableMethod {

    public  static  String repeatedWord(String str) {
        HashTable<String, String> hashTable = new HashTable<>(20);
        String[] strSplit = str.toLowerCase().split("\\W+"); // using regex to split the string aad convert yo lowe case because in this method  we use
        // insensitive word
        for (String s : strSplit) {
            if (hashTable.contains(s)) return s;
            hashTable.put(s, s);
        }
        return "No repeated Word"; //if the string is empty or hase on word;

    }
}
