public class SherlockandArray{
    public static int totalsum(int a[],int n){
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=a[i];
        }
        return sum;
    }
    public static String search(int a[],int n){
        int sum=totalsum(a,n);
        int x=0;
        for(int y=0; y<n; y++){
            if(2*x==sum-a[y]){
                return "YES";
            }else{
                x+=a[y];
            }
        }
        return "NO";
    }
    public static void main(String arg[]){
        int a[]={9,0,1};
        int n=a.length;
        String ans=search(a,n);
        System.out.println(ans);
    }
}