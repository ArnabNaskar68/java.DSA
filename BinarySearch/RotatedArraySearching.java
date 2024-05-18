public class RotatedArraySearching {
    public static int search(int a[], int n, int target) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (a[mid] == target) {
                return mid;
            }
            
            // Check if the left part is sorted
            if (a[low] <= a[mid]) {
                // If target is in the range of the sorted left part
                if (target >= a[low] && target < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // Otherwise, the right part must be sorted
                // If target is in the range of the sorted right part
                if (target > a[mid] && target <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1; // Return -1 if the target is not found
    }

    public static void main(String arg[]) {
        int a[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int n = a.length;
        int target = 1;
        System.out.println(search(a, n, target)); // Output should be 3
    }
}
