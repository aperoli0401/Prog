def par_o_impar(numero):
    if numero % 2 == 0:
        print("El numero es par")
    else:
        print("El numero es impar")

numero = int(input("Dime un numero: "))
par_o_impar(numero)