import re
texto = "Nació en 1985 y el libro es de 2023."
patron = r'\d{4}'
print(re.findall(patron, texto))