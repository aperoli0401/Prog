import re

# Parte 1: La Matriz de Inventario (Arrays Multidimensionales)
def busquedaInven(lista, num):
    encontrado = False
    for producto in lista:
        if num == producto[0]:
            print(f"El ID: {producto[0]} se encuentra en {producto}\033[32m")
            encontrado = True
            break
    if not encontrado:
        print(f"Error: el ID {num} no está en el inventario\033[31m")

 
def comparaStock(lista):
    # Inicializamos con el primer elemento
    maxStock = lista[0][2]
    minStock = lista[0][2]
    prodMax = lista[0][1]
    prodMin = lista[0][1]

    # Recorremos la lista con un for
    for item in lista:
        # item[2] es el stock
        if item[2] > maxStock:
            maxStock = item[2]
            prodMax = item[1]

        if item[2] < minStock:
            minStock = item[2]
            prodMin = item[1]

    return prodMax, prodMin


# Parte 2: Validación con Expresiones Regulares (Cadenas)
def validacion(cad):
    patron = r'^[A-Z] [0-9] \w{5,20}$'
    
    if re.match(patron, cad):
        print(f"El producto '{cad}' es válido\033[32m")
    else:
        print(f"El producto '{cad}' no cumple los criterios de mayúscula, dígitos y longitud\033[31m")


inventario = [
    [1, "AMD Ryzen 7 9800x3D", 200],
    [2, "Intel Core i7 14000k", 460],
    [3, "ASUS ROG Striks 5070 Ti", 150],
    [4, "Saphire PULSE AMD Raedon RX 9070 XT", 350],
    [5, "Kingston FURY Beast DDR4 3200 Mhz 32GB", 270]
]

print(inventario, end=" ")

num = int(input("Introduzca un ID: "))
busquedaInven(inventario, num)

producto_max, producto_min = comparaStock(inventario)
print("Producto con mayor stock:", producto_max)
print("Producto con menor stock:", producto_min)

cad = input("Introduzca un producto nuevo (Formato: A 1 producto): ")
validacion(cad)