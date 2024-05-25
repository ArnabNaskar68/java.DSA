//using sliding window/two pointer method
public class KlengthSubarray{
    public static int search(int[] a,int n,int k){
        int i=0;
        int r=k-1;
        int sum=0;
        int largest=0;
        for(int j=0; j<=r; j++){
            sum+=a[j];
        }
        while(r<n-1){
            sum-=a[i];
            i++;
            r++;
            sum+=a[r];
            if(largest<sum){
                largest=sum;
            }
        }
        return largest;
    }
    public static void main(String arg[]){
        int a[]={2,3,-2,1,6,4};
        int n=a.length;
        int k=4;
        int ans=search(a,n,k);
        System.out.println(ans);
    }
}