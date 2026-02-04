a = int(input("¿Cuantos numeros deseas introducir? "))

numero = [0] * a

for i in range(a):
    numero[i] = int(input(f"Introduce un numero"))

print("Los numeros ordenados al reves: ")
for i in range(len(numero) - 1):
    print(i)