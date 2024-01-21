// get the union of two sorted array
// where the union is also sorted

public class union {
   static int c[]=new int[6];
    static void arrayunion(int a[],int b[],int n,int m){
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                c[k++]=a[i];
                i++;
            }
            else if(a[i]>b[j]){
                c[k++]=b[j++];
            }
            else if(a[i]==b[j]){
                c[k++]=a[i++];
                j++;
            }

            
        }
        while(i<n){
            c[k++]=a[i++];
        }
        while(j<m){
            c[k++]=b[j++];
        }
        for(int s=0; s<10; s++){
            System.out.println(c[s]);
        }
    }
    public static void main(String arg[]){
        int a[]={1,2,3};
        int b[]={2,3,4};
        int n=a.length;
        int m=b.length;
        union.arrayunion(a,b,n,m);

    }
    
}
