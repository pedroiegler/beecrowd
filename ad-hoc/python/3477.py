def is_right_triangle(a, b, c):
    sides = [a, b, c]
    sides.sort()
    return sides[0]**2 + sides[1]**2 == sides[2]**2

def main():
    x, y, z = map(int, input().split())
    
    if is_right_triangle(x, y, z):
        area = (x * y) - (z * y) // 2
        print(f"AREA = {area}")
    else:
        print("Nao eh retangulo!")

if __name__ == "__main__":
    main()
2 