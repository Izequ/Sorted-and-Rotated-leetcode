# Sorted-and-Rotated-leetcode
## TALLER PROBLEMAS BÚSQUEDA Y ORDENAMIENTO ##
### Grupo 2 - 1151494 ###
Ejercicio: 1752. Check if Array Is Sorted and Rotated.

Dada una matriz nums, devuelve true si la matriz se ordenó originalmente en orden no decreciente y luego se giró una cierta cantidad de posiciones (incluido cero). De lo contrario, regresa false.
Puede haber duplicados en la matriz original.
Nota: Una matriz A rotada por xposiciones da como resultado una matriz B de la misma longitud tal que A[i] == B[(i+x) % A.length], donde %es la operación de módulo.

Puntos:
1) Resolver el problema en la plataforma https://leetcode.com/.

 ![image](https://user-images.githubusercontent.com/71033260/198909538-7982dedb-62e7-44e0-8fa3-a1a8bb648e2d.png)

2) Desarrollar una aplicación que genera al menos 100 casos de prueba para el problema. Los casos deben cubrir todas las posibilidades de casos del problema, de manera equilibrada.

   En el paquete creador se encuentra la clase que genera los casos de prueba para nuestro ejercicio, se llama CreadorCasos.java.

 ![image](https://user-images.githubusercontent.com/71033260/198909551-347eced3-a0d4-43ee-b9fc-53a0eb268f1e.png)

Para el ejercicio se cuentan con una serie de métodos para cubrir todos los casos de prueba posibles:

Para la creación tenemos los métodos:

•	createRepeats(int arr[], int rango)
Crea el arreglo con números repetidos en un rango de máximo determinado como parametro.

•	createNonRepeats(int arr[], int rango)
Crea el arreglo con números no repetidos en un rango máximo determinado como parámetro.

o	En estos casos se crean en orden aleatorio lo cual cubre la opción de un arreglo sin orden alguno.

Para el ordenamiento tenemos los métodos:
•	ordenarAs(int arr[])
Ordena todos los números del arreglo de forma ascendente.
•	ordenarPar(int a[])
Ordena la mitad de los números del arreglo de forma ascendente.
•	ordenarDes(int a[])
Ordena la mitad de los números del arreglo de forma descendente.
La clase también cuenta con un método print(int arr[]) que imprime el arreglo generado.
Funcionamiento de la clase
Método main de la clase
 ![image](https://user-images.githubusercontent.com/71033260/198909580-13b14df0-1ab8-4d69-8ffc-914cd333fa9b.png)
 
El ejecutarse la clase nos pedirá dos parámetros:
•	El número del tamaño del arreglo que también se utilizara para determinar el número máximo.
•	La dirección en donde se desea guardar el arreglo de datos en un archivo.
 ![image](https://user-images.githubusercontent.com/71033260/198909585-6e160b05-cb3c-4b52-9206-25dbfbcd6a96.png)

Como resultado de la ejecución tendremos en consola:
•	El arreglo creado con los números.
•	El tiempo en mili segundos que tardo en crear el arreglo.
 ![image](https://user-images.githubusercontent.com/71033260/198909588-078da950-96ae-4113-98e1-68661263d6f7.png)

También el archivo creado en la dirección que se especifico:
 
 ![image](https://user-images.githubusercontent.com/71033260/198909593-6772292d-4968-42ad-9aef-9f9d3809f347.png)
![image](https://user-images.githubusercontent.com/71033260/198909598-0aece19a-bca2-4264-941b-5f088fd46d49.png)

Para los casos de los arreglos ordenados debe quitarse el comentario dependiendo de cómo desea acomodar el arreglo
 ![image](https://user-images.githubusercontent.com/71033260/198909603-8e75d709-68ec-4c53-a339-388fe9ad4b4e.png)

3) Desarrollar una aplicación completa, con main y lectura de datos, de manera que se pruebe la solución independientemente de la plataforma https://leetcode.com/. Esta solución debe ser consistente con la solución realizada en el numeral 1.
En el paquete lector se encuentra la clase que lee y procesa el archivo de texto con el arreglo de números generado.
 ![image](https://user-images.githubusercontent.com/71033260/198909611-d1b9fcee-bc71-44c1-a436-3ac6d781cf50.png)

En la clase se tienen 3 métodos, para el desarrollo de nuestro ejercicio:
•	LeeNumerosFichero(File f)
Este método es el que lee el archivo txt en el que se encuentran los datos y los guarda en un arreglo.
•	check(int arr[])
ESTE es el método que da solución a nuestro ejercicio Check if Array Is Sorted and Rotated.
•	print(int arr[])
que imprime el arreglo generado en esta clase.
Metodo Main de la clase
 ![image](https://user-images.githubusercontent.com/71033260/198909620-4a7efc0c-d642-419d-844c-ca4b961e47f2.png)

El ejecutarse la clase nos pedirá un parámetro
•	La dirección del archivo con los datos del arreglo que se desean procesar.
 ![image](https://user-images.githubusercontent.com/71033260/198909630-a569a6ec-70d5-4038-92dd-a1a1dbfb7127.png)

Como resultado de la ejecución tendremos en consola 
•	El arreglo abstraído del documento con los números procesados.
•	El resultado de nuestro método Check que da la solución al problema Check if Array Is Sorted and Rotated.
•	El tiempo en mili segundos en lo que el método Check if Array Is Sorted and Rotated tardo en ejecutarse con los datos pasados como parámetro.
 ![image](https://user-images.githubusercontent.com/71033260/198909636-d34dcf22-ab2e-471d-a178-f01809056d85.png)

4) Elaborar un video explicando en detalle los tres numerales anteriores. Preferiblemente subirlo a Youtube.
Video: 
