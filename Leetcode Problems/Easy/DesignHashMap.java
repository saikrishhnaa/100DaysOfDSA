/*
Description:

Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:

MyHashMap() initializes the object with an empty map.
void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 
Example 1:

Input
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
Output
[null, null, null, 1, -1, null, 1, null, -1]

Explanation
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
 

Constraints:

0 <= key, value <= 106
At most 104 calls will be made to put, get, and remove.
*/

class KeyValuePair {
    public int key;
    public int value;
    KeyValuePair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {
    private KeyValuePair[] pair;
    private int pairSize = 8;
    private int hashMapSize = 0;
    private int index = 0;
    
    public MyHashMap() {
        pair = new KeyValuePair[pairSize];
    }
    
    public void put(int key, int value) {
        hashMapSize++;
        if(hashMapSize > pairSize) {
            KeyValuePair[] tempPair = pair;
            pair = new KeyValuePair[pairSize *= 2];
            for(int i = 0; i < tempPair.length; i++) {
                pair[i] = tempPair[i];
            }
        }
        pair[index] = new KeyValuePair(key, value);
        index++;
    }
    
    public int get(int key) {
        for(KeyValuePair pairObj : pair) {
            if(pairObj != null && pairObj.key == key)
                return pairObj.value;
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i = 0; i < pair.length; i++) {
            if(pair[i].key == key) {
                hashMapSize -= 1;
                for(int j = i + 1; j < pair.length; j++) {
                    pair[i] = pair[j];
                }
                if(hashMapSize <= (pairSize / 2)) {
                    KeyValuePair[] tempPair = pair;
                    pair = new KeyValuePair[pairSize /= 2];
                    for(int j = 0; j < tempPair.length; j++) {
                        pair[j] = tempPair[j];
                    }
                }
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

