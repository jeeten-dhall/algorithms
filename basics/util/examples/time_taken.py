import timeit

def linear(n): return [i for i in range(n)]
def quadratic(n): return [(i, j) for i in range(n) for j in range(n)]

def time_taken(func, count, note):
    print("Time Taken for", note, ": ", timeit.timeit(func, number=count))

if __name__ == "__main__":
    print(linear(3))
    print(quadratic(3))
    time_taken(lambda: linear(1000), 10, "linear")
    time_taken(lambda: quadratic(1000), 10, "quadratic")