class MyHashMap {
   private final int SIZE = 10000;
   private List<int[]>[] map;
    public MyHashMap() {
      map = new ArrayList[SIZE];  
    }
    private int hash(int key) {
        return key % 10000;

    }
    public void put(int key, int value) {
      int i = hash(key);  
      if (map[i] == null){
        map[i] = new ArrayList<>();

      }
      for(int[] pair : map[i]){
        if(pair[0] == key){
            pair[1] = value;
            return;
        }
      }
      map[i].add(new int[] { key, value});
    }
    
    public int get(int key) {
        int i = hash(key);
        if(map[i] == null) return -1;
        for(int[] pair : map[i]){
            if(pair[0] == key) return pair[1]; 
        }
        return -1;
    }

    
    public void remove(int key) {
       int i = hash(key);
       if(map[i] == null) return;
       Iterator<int[]> it = map[i].iterator();
       while(it.hasNext()) {
        if(it.next()[0] == key) {
            it.remove();
            return;
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