
from util.examples.time_taken import time_taken

def two_sum_o_n_square(nums, target):
    i = j = -1
    n = len(nums)

    for i in range(n):
        for j in range(n):
            if nums[i] + nums[j] == target:
                return True, i, j

    return False, i, j

def two_sum_o_n(nums, target):
    lookup = {}
    for i, num in enumerate(nums):
        compliment = target-num
        if compliment in lookup:
            return True, lookup[compliment], i
        lookup[num] = i
    return False, -1, -1

if __name__ == "__main__":
    print("Two Sum!")
    # nums = [2,7,11,15]
    # target = 26
    nums = list(range(1, 10001))  # 10,000 numbers
    target = 19999  # So the pair (9999, 10000) should match

    found, i, j = two_sum_o_n_square(nums, target)
    if found:
        print(target, "equals", nums[i], "and", nums[j])
    else:
        print("Target", target, "not found")

    found, i, j = two_sum_o_n(nums, target)
    if found:
        print(target, "equals", nums[i], "and", nums[j])
    else:
        print("Target", target, "not found")

    time_taken(lambda: two_sum_o_n_square(nums, target), 10, "quadratic")
    time_taken(lambda: two_sum_o_n(nums, target), 10, "linear")

    # Two Sum!
    # 19999 equals 9999 and 10000
    # 19999 equals 9999 and 10000
    # Time Taken for quadratic :  130.23602240000037
    # Time Taken for linear :  0.03865770000265911