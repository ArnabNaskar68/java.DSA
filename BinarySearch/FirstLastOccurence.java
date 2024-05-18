public class FirstLastOccurence{
    public static int FirstOccurence(int a[],int n, int target){
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(a[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return first;
    }
    public static int LastOccurence(int a[],int n, int target){
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(a[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return last;
    }
    public static void main(String arg[]){
        int a[]={1,1,1,2,2,3,4,5,8,8,8,8,8,8,9,10};
        int n=a.length;
        int target=8;
        int f=FirstOccurence(a,n,target);
        int l=LastOccurence(a,n,target);
        System.out.println("first occurence="+f+" "+"last occurence="+l);
        
    }
}