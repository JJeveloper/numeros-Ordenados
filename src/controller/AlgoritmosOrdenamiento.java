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

}
