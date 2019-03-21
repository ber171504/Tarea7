/*
 *Andres Berthet 171504
 * Hoja de Trabajo 7
 * 30 de Marzo de 2019
 * Algoritmos y estructura de datos
 * */

import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese su oracion que desea traducir.");
        Scanner input = new Scanner(System.in);
        int ora = input.next();
        Association<String,String> Traductor = new Association<String,String>();

        System.out.println("ingrese donde se localiza el archivo con las cartas: ");// bufferReader codigo basado de los ejemplos encontrados en la pagina : https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
        String fileName = input.next();
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("[,]");// se separa el string que da el buffer reader
            Association<String,String> Traductor = new Association<parts[0],parts[1]>();

        }


    }
}