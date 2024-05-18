public class RotatedArraySearch{//with duplicates
    public static boolean search(int a[], int n, int target){
        int low=0;int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==a[mid]){
                return true;
            }
            if(a[low]==a[mid] && a[mid]==a[high]){
                low++;
                high--;
            }else if(a[low]<a[mid]){
                if(target>=a[low] && target<a[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(target>a[mid] && target<=a[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
 
    }
               return false;
    }
    public static void main(String arg[]){
        int a[]={6,6,7,1,2,2,3,4,5};
        int n=a.length;
        int target=3;
        System.out.println(search(a,n,target));
    }
}