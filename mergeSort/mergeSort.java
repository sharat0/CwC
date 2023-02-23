public class MergeSort {

 /*
  * START DEBUGGING THE TWO METHODS BELOW
  */
  static void merge(int[] arr, int[] left, int left_size, int[] right, int right_size) {
    int i = 0, j = 0, k = 0;
    
    while (i <= left_size || j <= right_size) {
        arr[k++] = Math.min(left[j++], right[i++]);
    
    while (i < left_size) {
        arr[k++] = left[i++];
    }
    
    while (j < right_size) {
        arr[k++] = right[j++];
    }
}

  static void merge_sort(int[] arr, int size) {
    if (size < 2) {
        return;
    }
    
    int mid = size / 2;
    int[] left = new int[mid];
    int[] right = new int[size - mid];
    
    for (int i = 0; i < mid; i++) {
        left[i] = arr[i];
    }
    
    for (int i = mid; i < size; i++) {
        right[i - mid] = arr[i];
    }
    
    merge_sort(left, mid);
    merge_sort(right, size - mid);
    
    merge(arr, left, mid, right, size - mid);
}


  /*
   * driver code
   * DO NOT CHANGE THE LINES BELOW
   */
  public static void main(String[] args) {
    int[] arr = {10, 7, 8, 9, 1, 5};
    int size = arr.length;
    
    System.out.println("Before sorting:");
    for (int i = 0; i < size; i++) {
        System.out.print(arr[i] + " ");
    }
    
    merge_sort(arr, size);
    
    System.out.println("\nAfter sorting:");
    for (int i = 0; i < size; i++) {
        System.out.print(arr[i] + " ");
    }  
  }
}
