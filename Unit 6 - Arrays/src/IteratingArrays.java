public class IteratingArrays {
    public static void main(String[] args) {
        iterateArray();
        int[] nums  = {1, 2, 5, 6, 8, 9, 12, 4};
        int index = search(nums, 7);
        System.out.println(index);
        double average = getBetterAverage(nums);
        System.out.println(average);
    }

    private static double getBetterAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];  //assume that the min and max value are the first element
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(min > nums[i])
                min = nums[i];
            
            if(max < nums[i])
                max = nums[i];
        }

        return (sum - min - max) / (nums.length - 2);
    }

    /* return index of val, -1 if not there */
    private static int search(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val)
                return i;
        }
        return -1;
    }

    private static void iterateArray() {
        int[] nums  = {1, 2, 5, 6, 8, 9, 12, 4};    
        
        //Printing list elements backwards
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

        //Calculating the sum of array elements
        // int sum = 0;
        // for(int i = 0; i < nums.length; i ++){
        //     //System.out.println(nums[i]);
        //     sum += nums[i];
        // }
        // System.out.println(sum);

    }
}
