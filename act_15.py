anio = int(input("determina un anio: "))

if anio % 4 == 0 :
    print ("el anio es bisiesto") 

elif anio % 100 == 0 :
    print ("el anio no es bisiesto")

elif anio % 4 == 0 and anio % 400 == 0:
    print ("el anio tambien es bisiesto")
    

           
 
