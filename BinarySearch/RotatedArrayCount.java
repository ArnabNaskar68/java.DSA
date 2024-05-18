public class RotatedArrayCount {
    public static int search(int a[], int n) {
        int low = 0;
        int high = n - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            if (a[low] < a[high]) { // Check if the array is already sorted
                if (a[low] < ans) {
                    ans = a[low];
                    index = low;
                }
                break;
            }
            int mid = (low + high) / 2;
            if (a[low] <= a[mid]) { // Left part is sorted
                if (a[low] < ans) {
                    ans = a[low];
                    index = low;
                }
                low = mid + 1;
            } else { // Right part is sorted
                if (a[mid] < ans) {
                    ans = a[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String arg[]) {
        int a[] = {7, 9, 2, 3, 4, 5, 6};
        int n = a.length;
        System.out.println(search(a, n)); // Output should be 2
    }
}
