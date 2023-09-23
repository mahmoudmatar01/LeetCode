class MyHashMap {

    Map<Integer,Integer> myHashMap;
    public MyHashMap() {
        myHashMap=new HashMap();
    }

    public void put(int key, int value) {
        myHashMap.put(key,value);
    }

    public int get(int key) {
        if(myHashMap.get(key)==null){
            return -1;
        }
        return  myHashMap.get(key);
    }

    public void remove(int key) {
        myHashMap.remove(key);
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */