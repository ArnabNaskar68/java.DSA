// shift the zero to the left
// the following code works fine but has few flaws or can be upgraded

public class zero {
    static void shift(int arr[],int l){
        for(int i=0; i<l; i++){
            if(arr[i]==0){
                for(int j=i+1; j<l; j++){
                    if(arr[j]!=0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for(int k=0; k<l; k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String arg[]){
        int arr[]={9,0,7,0,9,6,0};
        int l=arr.length;
        zero.shift(arr,l);
    }
    
}
