class MyHashMap {
    private static class Pair{
        int key;
        int value;
        Pair(int key, int value){
            this.key=key;
            this.value=value;
        }
    }
    private List<LinkedList<Pair>> buckets;
    private int size=10000;
    public MyHashMap() {
        buckets=new ArrayList<>(size);
        for(int i=0; i<size; i++){
            buckets.add(new LinkedList<>());
        }
    }
    
    public void put(int key, int value) {
        int bucketno=key%size;
        LinkedList<Pair> chain=buckets.get(bucketno);
        for(Pair pair: chain){
            if(pair.key==key){
                pair.value=value;
                return;
            }
        }
        chain.add(new Pair(key, value));
    }
    
    public int get(int key) {
        int bucketno=key%size;
        LinkedList<Pair> chain=buckets.get(bucketno);
        for(Pair pair: chain){
            if(pair.key==key){
                return pair.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int bucketno=key%size;
        LinkedList<Pair> chain=buckets.get(bucketno);
        for(Pair pair: chain){
            if(pair.key==key){
                chain.remove(pair);
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