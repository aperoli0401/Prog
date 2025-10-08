operacion = input("¿que queremos hacer? : ")
n1 = int(input("dime el primer numero "))
n2 = int(input("dime el segundo numero "))

if operacion == ("sumar"):
    print (n1 + n2)
             
elif operacion == ("restar"):
    print (n1 - n2)

elif operacion == ("multiplicar"):
    print (n1 * n2)

elif operacion == ("dividir"):
    print (n1 % n2)

else :
    print ("no se hacer eso")
