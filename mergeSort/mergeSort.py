# START DEBUGGING THE METHOD BELOW

def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        left_half = arr[:mid]
        right_half = arr[mid:]

        merge_sort(left_half)
        merge_sort(right_half)

        i = j = k = 0

        while i <= len(left_half) or j <= len(right_half):
            arr[k] = min(left_half[j], right_half[i])
            i += 1
            j += 1
            k += 1

        while i < len(left_half):
            arr[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            arr[k] = right_half[j]
            j += 1
            k += 1

    return arr

# driver code
# DO NOT CHANGE THE LINES BELOW

arr = [10, 7, 8, 9, 1, 5]

print(f"Before sorting:\n{arr}\nAfter sorting:\n{merge_sort(arr)}")
