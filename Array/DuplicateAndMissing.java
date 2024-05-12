public class DuplicateAndMissing{
    public static long[] find(int a[]){
        long n=a.length;
        long sn=(n*(n+1))/2;// sum of n natural no
        long s2n=(n*(n+1)*(2*n+1))/6;// sum of the square of n natural no

        long s=0;// sum of the given array
        long s2=0;//sum of the square of the given array
        for(int i=0; i<n; i++){
            s=s+a[i];
            s2=s2+(a[i]*a[i]);
        }

        long val1=s-sn;
        long val2=s2-s2n;

        val2=val2/val1;

        long x=(val2+val1)/2;
        long y=val2-x;

        long b[]={x,y};
         System.out.println(sn+" "+s2n+" "+s+" "+s2+" "+val1+" "+val2+" "+x+" "+y);// to check the values 
        
        return b;
    }
    public static void main(String arg[]){
        int a[]={1,2,2,4,3,5};
        long b[]=find(a);
            System.out.println(b[0]+" "+b[1]);
    }
}