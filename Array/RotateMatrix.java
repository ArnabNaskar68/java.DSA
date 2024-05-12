import java.util.ArrayList;
import java.util.Arrays;
public class RotateMatrix {
    public static ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> matrix, int n, int m){
        // step 1 is to transpose
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<m; j++){
                int temp=matrix.get(i).get(j);
                matrix.get(i).set(j,matrix.get(j).get(i));
                matrix.get(j).set(i,temp);
            }
        }
        //step 2 is to rotate
        //here we are swaping elements to reverse them
        for(int i=0; i<n; i++){
            int start=0;// will start from the first element of each row
            int end=m-1;//will start from the last element of each row
            while(start<end && end>start ){
                int temp=matrix.get(i).get(start);
                matrix.get(i).set(start,matrix.get(i).get(end));
                matrix.get(i).set(end,temp);
                start++;
                end--;
            }
        }
        return matrix;
    }
    public static void main(String arg[]){
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
        matrix.add(new ArrayList<>(Arrays.asList(5,6,7,8)));
        matrix.add(new ArrayList<>(Arrays.asList(9,10,11,12)));
        matrix.add(new ArrayList<>(Arrays.asList(13,14,15,16)));

        int n=matrix.size();
        int m=matrix.get(0).size();

        ArrayList<ArrayList<Integer>> MATRIX=rotate(matrix,n,m);

        for(ArrayList<Integer> i:MATRIX){
            for(int j:i){
                System.out.print(j+"   ");
            }
            System.out.println();
        }
    }    
}

