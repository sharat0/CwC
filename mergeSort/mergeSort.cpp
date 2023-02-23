#include <iostream>
#include <cmath>
using namespace std;

/*
  * START DEBUGGING THE TWO METHODS BELOW
  */
void merge(int arr[], int left[], int left_size, int right[], int right_size) {
    int i = 0, j = 0, k = 0;
    
    while (i <= left_size || j <= right_size) {
        arr[k++] = min(left[j++], right[i++]);
    }
    
    while (i < left_size) {
        arr[k++] = left[i++];
    }
    
    while (j < right_size) {
        arr[k++] = right[j++];
    }
}

void merge_sort(int arr[], int size) {
    if (size < 2) {
        return;
    }
    
    int mid = size / 2;
    int left[mid];
    int right[size - mid];
    
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
int main() {
    int arr[] = {10, 7, 8, 9, 1, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Before sorting:" << endl;
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    
    merge_sort(arr, size);
    
    cout << "After sorting:" << endl;
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    
    return 0;
}
