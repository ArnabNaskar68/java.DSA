import java.util.Scanner;
public class Insertionsort {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int temp;
        int[] arr=new int[5];
        System.out.println("enter Insertion sort values");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1; i<5; i++){
             temp=arr[i];
             int y=i;
             while(y>0 && arr[y]<arr[y-1]){
                arr[y]=arr[y-1];
                arr[y-1]=temp;
                y--;
             }
        }
            
        
        for(int z=0; z<5;z++){
            System.out.println(arr[z]);
        }
        sc.close();
    }
}
