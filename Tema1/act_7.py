def maximo(a):
    mayor = a[0]
    for i in a:
        if i > mayor:
            mayor = i
    return mayor

tabla = [2, 686, 25, 6514]
mayor = maximo(tabla)
print("El numero mayor es: ", mayor)