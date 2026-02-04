numero = int(input("Introduce un número para calcular su factorial: "))
factorial = 1

if numero < 0:
    print("El factorial no existe para números negativos.")
else:
    for i in range(1, numero + 1):
        factorial *= i
    print(f"El factorial de {numero} es {factorial}")