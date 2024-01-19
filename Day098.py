n1 = float(input("Masukkan angka pertama: "))
operator = input("Masukkan operator (+, -, *, /): ")
n2 = float(input("Masukkan angka kedua: "))

r = 0
if operator == "+":
    result = n1 + n2
elif operator == "-":
    result = n1 - n2
elif operator == "*":
    result = n1 * n2
elif operator == "/":
    if n2 != 0:
        result = n1 / n2
    else:
        print("Error: Pembagian dengan nol.")
        exit()
else:
    print("Operator tidak valid.")
    exit()

print(f"Hasil: {r}")