import math

def main():
    a, b, c = map(float, input().split())

    s = (a + b + c) / 2.0
    area = math.sqrt(s * (s - a) * (s - b) * (s - c))

    print("{:.3f} m2".format(area))

if __name__ == "__main__":
    main()
