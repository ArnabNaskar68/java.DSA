import java.util.ArrayList;
public class pascalTriangle {
    public static int eachElements(int n,int r){
        long res=1;
        for(int i=0; i<r; i++){
        res=res*(n-i);
        res=res/(i+1);
        }
        return (int)res;
    }
    public static ArrayList<ArrayList<Integer>> generate(int n){
ArrayList<ArrayList<Integer>> triangle=new ArrayList<>();
        for(int row=1; row<=n; row++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int col=1; col<=row; col++){
                temp.add(eachElements(row-1, col-1));
            }
            triangle.add(temp);
        }
        return triangle;
    }
    public static void main(String srg[]){
        ArrayList<ArrayList<Integer>> triangle=new ArrayList<>();
        int n=5;
        triangle=generate(n);
        for (ArrayList<Integer> it : triangle) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
