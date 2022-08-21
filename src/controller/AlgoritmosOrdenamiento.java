package controller;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author JJeveloper
 */
public class AlgoritmosOrdenamiento {

    private int numeros[];

    public int[] generarNumerosAleatorios(int cantidadNumeros, int de, int hasta) {
        int aux;
        if (de > hasta) {
            aux = de;
            de = hasta;
            hasta = aux;
        }

        numeros = new int[cantidadNumeros];

        Random r = new Random();

        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = r.nextInt(de, hasta + 1);
        }
        return numeros;
    }

    public int[] burbuja() {
        int aux;
        
        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        return numeros;
    }

    public int[] seleccion() {
        int aux, menor;

        
        for (int i = 0; i < numeros.length - 1; i++) {
            menor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[menor]) {
                    menor = j;
                }
            }
            aux = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = aux;
        }

        return numeros;
    }

    public int[] insercion() {        
        int aux, posicion;
        
        for (int i = 0; i < numeros.length; i++) {
            posicion = i;
            aux = numeros[i];

            while ((posicion > 0) && (numeros[posicion - 1] > aux)) {
                numeros[posicion] = numeros[posicion - 1];
                posicion--;
            }
            numeros[posicion] = aux;
        }
        return numeros;
    }

}
