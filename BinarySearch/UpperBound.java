public class UpperBound {
    public static int search(int a[],int l,int target){
        int low=0;
        int high=l-1;
        int ans=l;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String arg[]){
        int a[]={1,2,3,4,5,8,8,10,10,11};
        int l=a.length;
        int target=-1;
        System.out.println(search(a,l,target));
    }
}
