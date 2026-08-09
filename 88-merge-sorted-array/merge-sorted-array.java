class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Create new array to hold all elements
        int[] nums3 = new int[m + n];

        // Copy valid elements from nums1
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }

        // Copy elements from nums2
        for (int i = 0; i < n; i++) {
            nums3[m + i] = nums2[i];
        }

        // Sort the merged array
        Arrays.sort(nums3);

        // Copy sorted result back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = nums3[i];
        }
    }
}