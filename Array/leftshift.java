// Rotate an array by D places in the same array


public class leftshift {
    public static void main(String arg[]){
        int d=1;
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        d=d%n;
        int temp[]=new int[d];
        for(int i=0; i<d; i++){
            temp[i]=arr[i];
        }
        for(int j=d; j<n; j++){
            arr[j-d]=arr[j];
        }
        for(int l=n-d; l<n; l++){
            arr[l]=temp[l-(n-d)];
        }
    for(int m=0; m<n; m++){
        System.out.println(arr[m]);
    }
    }
}
