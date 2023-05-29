import java.util.Arrays;

class MergeSortedArray {

public static void main(String[] args) {
    int[] arr1 = {1, 2, 3,0,0,0};
    int[] arr2 = {2, 5, 6};

    int[] arr3 = merge(arr1, 3, arr2, 3);

    System.err.println(Arrays.toString(arr3));
}



    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int num1length = m-1;
        int num2length = n-1;
        int mergearray = m+n-1;

        while(num2length>=0){
            if(num1length>=0 && nums1[num1length]>nums2[num2length]){
                nums1[mergearray--] = nums1[num1length--];
            }
            else{
                nums1[mergearray--] = nums2[num2length--];
            }
        }
        return nums1;
    }
}
