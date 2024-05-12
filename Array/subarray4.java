//Find the longest subarray with given sum K(Positive)

public class subarray4 {
    public static int subarrayLength(int a[], int l, int K){
        int i=0;
        int j=0;
        int sum=a[0];
        int maxlen=0;
        while(j<l){
            j++;
            if(j<l){
                sum+=a[j];
            }
            while(sum>K && i<=j){
                sum-=a[i];
                i++;
            }
            if(sum==K){
                maxlen=Math.max(maxlen, j-i+1);
            }
        }
        return maxlen;
    }
    public static void main(String arg[]){
        // int a[]={8,2,1,1,1,1,1,1,2,3,4,5};
        int a[]={7,1,6,0};
        int l=a.length;
        int K=6;
        int maxlen=subarrayLength(a,l,K);
        System.out.println(maxlen);
    }
}
