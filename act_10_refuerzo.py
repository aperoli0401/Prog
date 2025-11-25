def iguales(a,b,c):
    a = [letra.lower() for letra in a]
    b = [letra.lower() for letra in b]
    c = [letra.lower() for letra in c]
    
    if len(a) != len(b) != len(c):
        print("No son iguales")
    elif a != b != c:
        print("No son iguales")
    else:
        print("Son iguales")

a = ['p','e','r','a']
b = ['p','E','r','A']
c = ['P','E','R','A']

iguales(a,b,c)