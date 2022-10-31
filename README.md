# Sorted-and-Rotated-leetcode
## TALLER PROBLEMAS BÚSQUEDA Y ORDENAMIENTO ##
### Grupo 2 - 1151494 ###
### Ejercicio: 1752. Check if Array Is Sorted and Rotated 

Dada una matriz nums, devuelve true si la matriz se ordenó originalmente en orden no decreciente y luego se giró una cierta cantidad de posiciones (incluido cero). De lo contrario, regresa false.

Puede haber duplicados en la matriz original.

Nota: Una matriz A rotada por xposiciones da como resultado una matriz B de la misma longitud tal que A[i] == B[(i+x) % A.length], donde % es la operación de módulo.

## Puntos
### 1) Resolver el problema en la plataforma https://leetcode.com/
![image](https://user-images.githubusercontent.com/71033260/199124722-da23756b-b330-4f94-81f2-67e11ebcb6f2.png)
![image](https://user-images.githubusercontent.com/71033260/199124739-3fe56b3d-3135-4a94-ad71-3892fefff124.png)

Captura de envió. 

![image](https://user-images.githubusercontent.com/71033260/199124761-0ec33940-0ee1-43ce-a3a7-fc84a24c97e1.png)

## 2) Desarrollar una aplicación que genera al menos 100 casos de prueba para el problema. Los casos deben cubrir todas las posibilidades de casos del problema, de manera equilibrada.

En el paquete creador se encuentra la clase que genera los casos de prueba para nuestro ejercicio, se llama CreadorCasos.java

![image](https://user-images.githubusercontent.com/71033260/199125367-46656ade-3f89-4d11-9817-2286f013b79d.png)

Para el ejercicio se cuentan con una serie de métodos para cubrir todos los casos de prueba posibles:

#### Para la creación tenemos los métodos:

•	createRepeats(int arr[], int rango):

  Crea el arreglo con números repetidos en un rango de máximo determinado como parámetro.
  
•	createNonRepeats(int arr[], int rango)
  
  Crea el arreglo con números no repetidos en un rango máximo determinado como parámetro.
  
o	En estos casos se crean en orden aleatorio lo cual cubre la opción de un arreglo sin orden alguno.

#### Para el ordenamiento tenemos los métodos:

•	ordenarAs(int arr[])
  
  Ordena todos los números del arreglo de forma ascendente.
  
•	ordenarPar(int a[])

  Ordena la mitad de los números del arreglo de forma ascendente.
  
•	ordenarDes(int a[])

  Ordena la mitad de los números del arreglo de forma descendente.
  
La clase también cuenta con un método print(int arr[]) que imprime el arreglo generado.

#### Funcionamiento de la clase GenerarCasos

Método main de la clase.

![image](https://user-images.githubusercontent.com/71033260/199125717-b923d597-048c-4160-b07f-7000ba7c05a4.png)

El **ejecutarse** la clase nos pedirá dos parámetros:

•	**El número del tamaño** del arreglo que también se utilizara para determinar el número máximo.

•	**La dirección** en donde se desea guardar el arreglo de datos en un archivo.

•	**un numero** que define el orden en que desea el arreglo

![image](https://user-images.githubusercontent.com/71033260/199125769-7d690968-f453-44a1-b685-dad2dce9553f.png)

Como **resultado** de la ejecución tendremos en consola:

•	El **arreglo** creado con los números.

•	El **tiempo** en mili segundos que tardo en crear el arreglo.

![image](https://user-images.githubusercontent.com/71033260/199125993-bf058e82-af41-44ca-bad5-aecf2ec00034.png)

![image](https://user-images.githubusercontent.com/71033260/199126006-9796ca85-c29e-4097-bedf-b849c2ae034b.png)
![image](https://user-images.githubusercontent.com/71033260/199126010-c59f39b6-2ceb-480b-ac15-cc7cb6beb11c.png)

#### 3) Desarrollar una aplicación completa, con main y lectura de datos, de manera que se pruebe la solución independientemente de la plataforma https://leetcode.com/. Esta solución debe ser consistente con la solución realizada en el numeral 1.

En el paquete lector se encuentra la clase que lee y procesa el archivo de texto con el arreglo de números generado.

![image](https://user-images.githubusercontent.com/71033260/199126038-b7c9eea6-f3ef-45f2-ac81-c941e59806f8.png)

En la clase se tienen 3 métodos, para el desarrollo de nuestro ejercicio:

•	LeeNumerosFichero(File f)

  Este método es el que lee el archivo txt en el que se encuentran los datos y los guarda en un arreglo.
  
•	check(int arr[])

  ESTE es el método que da solución a nuestro ejercicio Check if Array Is Sorted and Rotated.
  
•	print(int arr[])

  que imprime el arreglo generado en esta clase.
  
#### Funcionamiento de la clase LectorSolucion

Método Main de la clase

![image](https://user-images.githubusercontent.com/71033260/199126146-f9934f8b-8c84-4f42-a23c-d03a6e4b4fe1.png)

El **ejecutarse** la clase nos pedirá un parámetro

•	La **dirección** del archivo con los datos del arreglo que se desean procesar.

![image](https://user-images.githubusercontent.com/71033260/199126193-5623c08a-154e-4823-81d8-89baaf3b8567.png)


Como **resultado** de la ejecución tendremos en consola 

•	El **arreglo** abstraído del documento con los números procesados.

•	El **resultado de nuestro método Check** que da la solución al problema Check if Array Is Sorted and Rotated.

•	El **tiempo** en mili segundos en lo que el método Check if Array Is Sorted and Rotated tardo en ejecutarse con los datos pasados como parámetro.

![image](https://user-images.githubusercontent.com/71033260/199126295-55ff72f4-1483-413e-ab52-858c8c3def9d.png)

Resultados:

para este ejercicio se tomó los tipos de órdenes que pueden tener los arreglos y el tamaño de datos con el límite establecido en el ejercicio que son 100 y en todos los casos se obtuvo el siguiente resultado:

![image](https://user-images.githubusercontent.com/71033260/199126331-9923087d-347a-4f38-9d47-22f607c871ef.png)

Conclusiones:

Para arreglos ordenados de forma **ascendente** siempre dará true ya que el contador siempre dará que es igual a 0.

Para el caso **descendente**, nos dará false ya que el contador siempre será mayor que 1 y los parámetros de entrega de la plataforma leetcode nos decía que la rotación se haría para el orden ascendente.

Para el caso de **parcialmente ordenado**, nos puede dar true o false, dependiendo del orden que lleve el arreglo, si el arreglo esta ordenado de mitad y mitad y en orden ascendente, el contador será 1 y nos devolverá true, de no cumplirse esta condición nos devolverá false.

Para el orden **aleatorio**, se puede dar la posibilidad de que los números se generen con cierto orden parcial como el caso anterior, si el arreglo esta ordenado de mitad y mitad y en orden ascendente, el contador será 1 y nos devolverá true, de no cumplirse esta condición nos devolverá false.

#### 4) Elaborar un video explicando en detalle los tres numerales anteriores. Preferiblemente subirlo a Youtube.

**Video:** https://youtu.be/bIVeDTSFLLU 
