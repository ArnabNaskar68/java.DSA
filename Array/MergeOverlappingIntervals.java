


import java.util.*;

public class MergeOverlappingIntervals {

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) { // select an interval:
            int start = arr[i][0];
            int end = arr[i][1];

            //Skip all the merged intervals:
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            //check the rest of the intervals:
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }

}


// import java.util.ArrayList;
// import java.util.Arrays;
// public class MergeOverlappingIntervals{
//     public static void mergeOverlappingIntervals(ArrayList<ArrayList<Integer>> matrix, int n,int m){
//         for(int i=0; i<n-1; i++){//loop to sort the array list
//             for(int j=n-1; j>i; j--){
//             int a=0;// iterator to iterate the column
//                 if(matrix.get(j).get(a)<matrix.get(i).get(a)){//condition to swap if the first element is different
//                     ArrayList<Integer> temp=matrix.get(i);
//                     matrix.set(i,matrix.get(j));
//                     matrix.set(j,temp);
//                 }
//                 if(matrix.get(j).get(a)==matrix.get(i).get(a)){//condition if the first element of pair is same
//                     a+=1;
//                     if(matrix.get(j).get(a)<matrix.get(i).get(a)){
//                         ArrayList<Integer> temp=matrix.get(i);
//                     matrix.set(i,matrix.get(j));
//                     matrix.set(j,temp);
//                     }
//                 }
//             }
//         }
//         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
//         for(int i=0; i<n; i++){
//             int start=matrix.get(i).get(0);
//             int end= matrix.get(i).get(1);

//             if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
//                 continue;
//             }
//             for(int j=i+1; j<n; j++){
//                 if(end>matrix.get(j).get(0)){
//                     end=Math.max(end,matrix.get(j).get(1));
//                 }
//             }
//             ans.add(new ArrayList<>(Arrays.asList(start,end)));
//         }
//             for(ArrayList<Integer> i:ans){
//                 for(int j:i){
//                     System.out.print(j);
//                 }
//                 System.out.println();
//             }
//         }
//     public static void main(String arg[]){
//         ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();

//         matrix.add(new ArrayList<>(Arrays.asList(1,3)));
//         matrix.add(new ArrayList<>(Arrays.asList(2,6)));
//         matrix.add(new ArrayList<>(Arrays.asList(8,9)));
//         matrix.add(new ArrayList<>(Arrays.asList(2,4)));
//         matrix.add(new ArrayList<>(Arrays.asList(9,1)));

//         int n=matrix.size();
//         int m=matrix.get(0).size();

//         MergeOverlappingIntervals.mergeOverlappingIntervals(matrix,n,m);
//     }
// }