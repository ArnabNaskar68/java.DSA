import java.util.Scanner;
public class Bubblesort {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        System.out.println("enter value for selection sorting");
        for(int i=0; i<5; i++){
            array[i]=sc.nextInt();
        }
        for(int i=array.length-1; i>=0; i--){
            int didswap=0;
for(int j=0; j<=i-1; j++){
    int temp=array[j];
    if(temp>array[j+1]){
        array[j]=array[j+1];
        array[j+1]=temp;
        didswap=1;
    }
}
if(didswap==0){
 System.out.println("the array is already sorted");
 break;
}
        }
                
            
        
        for(int z=0; z<5; z++){
        System.out.println(array[z]);
        }
        sc.close();
    }
}
