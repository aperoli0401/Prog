
def es_primo(n):
    if n <= 1:
        return False  
    for i in range(2, int(n ** 0.5) + 1):  
        if n % i == 0:
            return False  
    return True


lista_original = list(range(1, 11))


primos = []
no_primos = []


for numero in lista_original[:]:  
    if es_primo(numero):
        primos.append(numero)
        lista_original.remove(numero)  
    else:
        no_primos.append(numero)


print("Lista original al principio:", list(range(1, 11)))
print("Lista de números primos:", primos)
print("Lista de números no primos:", no_primos)
print("Lista original después de la operación:", lista_original)