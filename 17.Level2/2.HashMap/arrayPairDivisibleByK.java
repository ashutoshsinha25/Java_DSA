// leetcode 1497. Check If Array Pairs Are Divisible by k

class arrayPairDivisibleByK {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int ele : arr){
            ele = ele % k;
            if(ele < 0 ) ele = ele+k;
            if(hm.containsKey(ele)){
                int freq = hm.get(ele);
                hm.put(ele , freq+1);
                
            }else{
                hm.put(ele , 1);
            }
        }
        
        for(int key : hm.keySet()){
            if(key == 0){
                int f = hm.get(key);
                // odd
                if(f%2!=0) return false;
                continue;
            }
            int secEle = k - key;
            if(hm.containsKey(secEle) == false) return false;
            int f1 = hm.get(key);
            int f2 = hm.get(secEle);
            if(f1 != f2) return false;
        }
        return true;
    }
}