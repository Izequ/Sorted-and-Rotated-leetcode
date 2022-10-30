/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lector;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author FREDDY
 */
public class LectorSolucion {

    public static int[] LeeNumerosFichero(File f) throws FileNotFoundException {

        Scanner scan = new Scanner(f);
        String s1 = "";

        while (scan.hasNext()) {

            s1 += scan.nextLine();

        }
        String[] arrayString = s1.split(",");//1, 2, 3, 4
        int[] numeros = new int[arrayString.length];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(arrayString[i]);
        }
        return numeros;
    }

    public boolean check(int arr[]) {
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                cont++;
            }
        }
        if (cont > 1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        String ruta = sc.next();

        File fichero = new File(ruta);
        
        LectorSolucion lector = new LectorSolucion();

        int[] nums = lector.LeeNumerosFichero(fichero);
        
        int[] exa = {2,1};

        for (int j = 0; j < nums.length; j++) {
            if (j == nums.length - 1) {
                System.out.print(nums[j] + "");
            } else {
                System.out.print(nums[j] + ", ");
            }
        }
        
        boolean cmp = lector.check(nums);
        System.out.println(cmp);

    }
}
