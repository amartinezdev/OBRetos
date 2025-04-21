# Retos de OpenBootcamp

## 1. Reto: Adivina el Número
Crea un programa que:
Genere (o almacene) un número secreto en un rango definido, por ejemplo, entre 1 y 100.
Pida al usuario que intente adivinar el número.
Compare la suposición del usuario con el número secreto:
Si es mayor, indica que el número correcto es más pequeño.
Si es menor, indica que el número correcto es más grande.
Continúa pidiendo suposiciones hasta que el usuario adivine o hasta que se supere un límite de intentos (por ejemplo, 5).
Si el usuario acierta, muestra un mensaje de felicitación.
Si no acierta en el número de intentos permitidos, muestra un mensaje indicando que ha fallado y revela el número secreto.

- [x] [**Primer reto**](https://github.com/amartinezdev/OBRetos/blob/master/AdivinaAPP.java)

## 2. Reto: Diferencia Absoluta entre las Sumas de las Diagonales de una Matriz Cuadrada
Dada una matriz cuadrada (un arreglo bidimensional de tamaño n×nn×n), escribe una función que calcule la diferencia absoluta entre las sumas de sus dos diagonales principales.
Descripción:
Diagonal Primaria (Diagonal Principal): Es la diagonal que va desde la esquina superior izquierda a la esquina inferior derecha. 
Por ejemplo, en la matriz:
 ```
 [11, 2, 4]
 [4, 5, 6]
 [10, 8, -12]
```

Los elementos de esta diagonal son: 11, 5, -12.
Diagonal Secundaria: Es la diagonal que va desde la esquina superior derecha a la esquina inferior izquierda. En el ejemplo anterior, los elementos son: 4, 5, 10.
Diferencia Absoluta: La función debe calcular la suma de los elementos de cada diagonal y luego retornar el valor absoluto de la diferencia entre estas dos sumas. En el ejemplo:
Suma de la diagonal principal: 11+5+(−12)=4.
Suma de la diagonal secundaria: 4+5+10=19.
Diferencia absoluta: [4−19]=15.

- [x] [**Segundo reto**](https://github.com/amartinezdev/OBRetos/blob/master/Matriz.java)

## 3. Reto: IMC

En este reto te propongo que crees una calculadora que indique al usuario su índice de masa corporal (IMC). Una vez hayas calculado el IMC, deberás indicar a la categoría que pertenece el usuario.

No es necesario que se soliciten los datos por consola, simplemente asigna el valor a las variables que instancies, y luego utilízalas para calcular el IMC.

- [x] [**Tercer reto**](https://github.com/amartinezdev/OBRetos/blob/master/IMCapp.java)
