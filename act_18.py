l1 = int(input("dime un lado "))
l2 = int(input("dime otro lado "))
l3 = int(input("dime el ultimo lado "))

if l1 == l2 == l3:
    print ("este triangulo es equilatero")

elif l1 == l2 or l2 == l3 or l3 == l1:
    print ("este es un triangulo isosceles")

elif l2 < l1 < l3:
    print ("este trinagulo es escaleno")

else :
    print ("no es un triangulo")
