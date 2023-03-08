public class SortingAlgorithms {
    public static void main(String[] args) {
        //int[] arr = {7, 5, 8, 4, 9, 100, 24, 12};
        //selectionSort(arr);
        // insertionSort(arr);
        // display(arr);
        // System.out.println();

        //searching algorithms
        //int index = sequentialSearch(24, arr);
        // int index = binarySearch(24, arr);
        // System.out.println(index);

        for (int i = 0; i < 10; i++) {
            int[] arr = new int[(int)Math.pow(10,i)];
            binarySearch(23, arr);
        }


    }

    private static int binarySearch(int findMe, int[] arr) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max)/2;
        int counter = 0;

        while(min <= max){
            mid = (min + max)/2;

            if(arr[mid] == findMe)
                return mid;
            else if(arr[mid] > findMe)
                max = mid - 1;
            else
                min = mid + 1;
            counter++;
        }
        System.out.println(arr.length + ": " + counter);
        return -1;
    }

    private static int sequentialSearch(int findMe, int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == findMe)
                return j;
        }
            return -1;
    }



    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i-1; j >= 0 && arr[j] > temp; j--) {
                arr[j+1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

    private static void display(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[smallestIndex])
                    smallestIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
}
