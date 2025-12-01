from util.examples.time_taken import time_taken

def move_zeroes_o_n_square(nums):
    n = len(nums)
    for i in range(n-2, -1, -1):
        if nums[i] == 0:
            j = -1
            for j in range(i+1, n):
                if nums[j] != 0:
                    nums[j-1] = nums[j]
                    nums[j] = 0
                else:
                    break
            # nums[j-1] = 0

def move_zeroes_o_n(nums):
    last_non_zero = 0
    for i in range(len(nums)):
        if nums[i] != 0:
            nums[i], nums[last_non_zero] = nums[last_non_zero], nums[i]
            last_non_zero += 1

if __name__ == "__main__":
    # nums = [4, 0, 2, 0, 3, 0]
    # print("Before moving zeroes:", nums)
    # move_zeroes_o_n_square(nums)
    # print("After moving zeroes:", nums)
    #
    # nums = [4, 0, 2, 0, 3, 0]
    # print("Before moving zeroes:", nums)
    # move_zeroes_o_n(nums)
    # print("After moving zeroes:", nums)
    #
    # nums = [0, 5, 0, 1, 0, 0, 3, 12, 0, 8, 0, 0, 7, 0, 9, 0, 0, 10, 0, 11, 0, 0, 0, 13, 0]
    # print("Before moving zeroes:", nums)
    # move_zeroes_o_n_square(nums)
    # print("After moving zeroes:", nums)
    #
    # nums = [0, 5, 0, 1, 0, 0, 3, 12, 0, 8, 0, 0, 7, 0, 9, 0, 0, 10, 0, 11, 0, 0, 0, 13, 0]
    # print("Before moving zeroes:", nums)
    # move_zeroes_o_n(nums)
    # print("After moving zeroes:", nums)

    nums = [0, 5, 0, 1, 0, 0, 3, 12, 0, 8, 0, 0, 7, 0, 9, 0, 0, 10, 0, 11, 0, 0, 0, 13, 0]
    time_taken(lambda: move_zeroes_o_n_square(nums), 1000000, "quadratic")
    time_taken(lambda: move_zeroes_o_n(nums), 1000000, "linear")