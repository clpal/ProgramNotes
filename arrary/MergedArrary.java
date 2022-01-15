package arrary;

public class MergedArrary {
    String testdemo = "merged test";

    public static void main(String[] args) {

        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m = nums1.length;
        int n = nums2.length;

        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, i = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                i = i - 1;
                p1 = p1 - 1;
            } else {
                nums1[i] = nums2[p2];
                i = i - 1;
                p2 = p2 - 1;
            }


        }

    }
}
