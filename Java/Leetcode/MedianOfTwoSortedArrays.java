class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //combine two arrays 
        int[] bothArr = mergeArr(nums1, nums2);
        //sort array
        Arrays.sort(bothArr);
        //find median of sorted array
        return findMedian(bothArr);
    }
    private int[] mergeArr(int[] nums1, int[] nums2) {
        int[] bothArr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            bothArr[i] = nums1[i];
        }
        int i = 0;
        for (int j = nums1.length; j < bothArr.length; j++) {
            bothArr[j] = nums2[i];
            i++;
        }
        return bothArr;
    }
    private double findMedian(int[] arr) {
        int m = arr.length / 2 - 1;
        if (arr.length % 2 == 1) {
            return arr[m + 1];
        }
        else {
            double temp = arr[m] + arr[m + 1];
            temp /= 2;
            return temp;
        }
    }
}