/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author FREDDY
 */
public class CreadorCasos {

    public void createRepeats(int arr[], int rango) {

        for (int i = 0; i < arr.length; i++) {
            int n = (int) (Math.random() * (rango - 1)) + 1;
            arr[i] = n;
        }
    }

    public void createNonRepeats(int arr[], int rango) {
        int i = 0;

        arr[i] = (int) (Math.random() * (rango)) + 1;
        for (i = 1; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (rango)) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
    }

    public void ordenarAs(int arr[]) {
        int tmp = 0, r = 0, s = 0;  //3
        do {
            s = r + 1;  //2
            while (s < arr.length) {  //1
                if (arr[s] < arr[r]) {  //1
                    tmp = (int) arr[s]; //1
                    arr[s] = arr[r];    //1
                    arr[r] = tmp; //1
                }
                s++;    //1
            }
            r = r + 1;  //2
        } while (r < arr.length - 1); //2
    }

    public void print(int arr[]) {
        System.out.print("int arr[] = { ");
        for (int j = 0; j < arr.length; j++) {
            if (j == arr.length - 1) {
                System.out.print(arr[j] + "");
            } else {
                System.out.print(arr[j] + ", ");
            }
        }
        System.out.println("};");
    }

    public void crearArchivo(int arr[], String ruta) {
        try {

            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter fw = new PrintWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    bw.write(arr[i] + "");
                } else {
                    bw.write(arr[i] + ",");
                }
            }
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tope = sc.nextInt();
        String ruta = sc.next();

        int[] casos = new int[tope];

        CreadorCasos datos = new CreadorCasos();
        
        //process

        long startTime = System.nanoTime();

        datos.createNonRepeats(casos, tope);
        //datos.ordenarAs(casos);
        datos.print(casos);

        long endTime = System.nanoTime();
        System.out.println("Duración: " + (endTime - startTime) / 1e6 + " ms");
        
        datos.crearArchivo(casos, ruta);

    }

}
