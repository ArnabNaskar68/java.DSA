import java.util.ArrayList;
import java.util.Arrays;

public class SingleElement{
    public static int search(ArrayList<Integer> a, int n){
        int low=1;
        int high=n-2;
        if(n==1){
            return a.get(0);
        }if(a.get(0)!=a.get(low)){
            return a.get(0);
        }if(a.get(n-2)!=a.get(n-1)){
            return a.get(n-1);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(a.get(mid)!=a.get(mid-1) && a.get(mid)!=a.get(mid+1)){
                return a.get(mid);
            }else if(mid%2==1 && a.get(mid)==a.get(mid-1)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,5,5,6,6));
        int n=a.size();
        System.out.println(search(a,n));
    }
}