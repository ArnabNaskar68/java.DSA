// Union and Intersection of two array using HashSet

import java.util.HashSet;
import java.util.Iterator;
class union{
    static void combine(int arr1[],int arr2[], int m,int n){
        HashSet<Integer> set=new HashSet<>();
            for(int i=0; i<m; i++){
                set.add(arr1[i]);
            }
            for(int j=0; j<n; j++){
                set.add(arr2[j]);
            }
            Iterator t=set.iterator();
            while(t.hasNext()){
                System.out.println(t.next());
            }
            
    }
    public static void join(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){
            if(set.contains(arr2[j])){
                System.out.println(arr2[j]);
            }
            }
        }
    
    public static void main(String arg[]){
        int arr1[]={3,6,2,7};
        int arr2[]={8,0,5,3};
        int m=arr1.length;
        int n=arr2.length;
        union.combine(arr1,arr2,m,n);
        System.out.println("intersection is:");
        union.join(arr1,arr2);
        
    }
}
