// the first element is taken as the pivot 
class Quicksort{
    public static void main(String arg[]){
        int arr[]={7,0,4,3,8,2,0};
        int n=arr.length;
        recurtion(arr,0,n-1);
        printarr(arr,n);
    }
    static int sort(int[] arr,int low,int high){
        int pv=arr[low];
        int i=low;
        int j=high;
        if(i<j){
            while(pv>=arr[i] && i<=high ){
                i++;
            }
            while(pv<arr[j]&& j>=low){
                j--;
            }
            if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j++;
            }
        }
        if(j<i){
            arr[low]=arr[j];
            arr[j]=pv;
        }
    return j;
        
    }
    static void recurtion(int[] arr,int low,int high){
        if(low<high){
            int pi=sort(arr,low,high);
            
            recurtion(arr,low,pi-1);
            recurtion(arr,pi+1,high);
        }
    }
    static void printarr(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}