#Ejercicio 1
palabra = str(input("Dime una palabra: "))
palindromo = palabra[::-1]

print(palabra[::-1])

if palindromo == palabra:
    print("La palabra que me has dicho es un palindromo")

#Ejercicio 2

cadena = " juan.perez@dominio.com "

print(cadena.strip(), cadena.upper()) 

print(cadena.split('@'))

#Ejercicio 3
clase = "class = titulo"

mensaje = f"<h1 {clase}> Mi encabezado </h1>"

print(mensaje)		