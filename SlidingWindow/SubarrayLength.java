//from an array find the longest subarray who's sum is <=k
//return the length of the longest array
public class SubarrayLength{
    public static int search(int a[],int n){
        int k=9;
        int l=0;
        int r=0;
        int maxlen=0;
        int sum=0;
        while(r<n){
            sum+=a[r];
            
            while(sum>k && l<n){
                sum-=a[l];
                l++;
            }
            if(sum<=k){
                maxlen=Math.max(maxlen,r-l+1);
                r++;
            }
        }
        return maxlen;
    }
    public static void main(String arg[]){
        int a[]={3,4,1,1,6,1,2,6,1};
        int n=a.length;
        System.out.println(search(a,n));
    }
}