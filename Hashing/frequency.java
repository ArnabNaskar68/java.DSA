// Given an array of size n, find all elements that appears more than n/3 times


import java.util.HashMap;
class frequency{
    static void count(int nums[],int n){
        HashMap<Integer,Integer> c=new HashMap<>();
        for(int i=0; i<n; i++){
            if(c.containsKey(nums[i])){//updating hashmap where key already esists
                c.put(nums[i],c.get(nums[i])+1);
            }else{                    //entering new hashmap
                c.put(nums[i],1);
            }
        }
        for(int j:c.keySet()){
            if(c.get(j)>n/3){
                System.out.println(j);
            }
        }
        
    }
    public static void main(String arg[]){
        int[] nums={1,3,2,5,1,3,1,5,1};
        int n=nums.length;
        frequency.count(nums,n);
        
    }
}