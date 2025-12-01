
def max_subarray_o_n_square(arr):
    n = len(arr)
    max_i, max_j = -1, -1
    maximum = float('-inf')
    for i in range(n):
        max = arr[i]
        for j in range(i+1, n):
            max += arr[j]
            if max > maximum:
                maximum = max
                max_i, max_j = i, j
    return arr[max_i:max_j+1], sum(arr[max_i:max_j+1])

def max_subarray_o_n(arr):
    start, end, cumulative, total = 0, 0, arr[0], arr[0]
    for i in range(1, len(arr)):
        if arr[i] > total and cumulative <= 0: # reset
            start, end = i, i
            cumulative, total = arr[i], arr[i]
        elif cumulative + arr[i] > total: # accommodate
            end = i
            cumulative += arr[i]
            total = cumulative
        else: # explore
            cumulative += arr[i]

    return arr[start: end+1], total

def max_subarray(nums):
    max_sum = cur_sum = nums[0]
    for n in nums[1:]:
        cur_sum = max(n, cur_sum + n)
        max_sum = max(max_sum, cur_sum)
    return max_sum

if __name__ == "__main__":
    print("Expected max subarray sum: 6 : subarray [4, -1, 2, 1]")
    print(max_subarray_o_n_square([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
    print(max_subarray_o_n([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
    print(max_subarray([-2, 1, -3, 4, -1, 2, 1, -5, 4]))

    print("Expected max subarray sum: 18 : subarray [3, -2, 5, -1, 6, -3, 2, 7, -5, 2, 4]")
    print(max_subarray_o_n_square([3, -2, 5, -1, 6, -3, 2, 7, -5, 2, 4, -9, 6]))
    print(max_subarray_o_n([3, -2, 5, -1, 6, -3, 2, 7, -5, 2, 4, -9, 6]))
    print(max_subarray([3, -2, 5, -1, 6, -3, 2, 7, -5, 2, 4, -9, 6]))

    print("Expected max subarray sum: 6 : subarray [2, -1, 2, -1, 2]")
    print(max_subarray_o_n_square([-1, 2, -1, 2, -1, 2, -1, 2, -1, 2]))
    print(max_subarray_o_n([-1, 2, -1, 2, -1, 2, -1, 2, -1, 2]))
    print(max_subarray([-1, 2, -1, 2, -1, 2, -1, 2, -1, 2]))