import java.util.Scanner;
class Selectionsot{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter values");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        // int val;
        for(int j=0; j<5; j++){
            for(int y=j+1; y<5; y++){
                
                do{
                    temp=arr[j];
                    arr[j]=arr[y];
                    arr[y]=temp;
                }while(arr[j]>arr[y]);
            }
        }
        for(int z=0; z<5; z++){
            System.out.println(arr[z]);
        }
        sc.close();
    }
}