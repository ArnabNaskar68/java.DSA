// largest and second largest no in an array


class large{
    static int c=0;
    static void largest(int ar[],int b){
        for(int i=0; i<b; i++){
            if(ar[i]>=c){
                c=ar[i];
            }        
        }
        System.out.println("largest numner is="+" "+c);
    }
    static void secondlargest(int ar[],int b){
        int d=0;
        for(int i=0; i<b; i++){
            if(ar[i]>=d && ar[i]<c){
                d=ar[i];
            }
        }
        System.out.println("second largest number is ="+" "+d);
    }
    public static void main(String arg[]){
        int ar[]={2,8,3,5,0};
        int b=ar.length;
        large.largest(ar,b);
    large.secondlargest(ar,b);
    }
}
