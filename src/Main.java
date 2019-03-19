/*
 *Andres Berthet 171504
 * Hoja de Trabajo 6
 * 3 de Marzo de 2019
 * Algoritmos y estructura de deatos
 * */

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Cual de los 3 mapas desea usar \n  1, HashMap \n  2, LinkedHashMap \n  3, TreeMap \n ingrese el numero");
        Scanner input = new Scanner(System.in);
        int map = input.nextInt();
        MapFacotry factory = new MapFacotry();
        AbstractMap<String, String> Mapa = factory.getmap(map);// se usa el factory para saber cual de los tres mapoas se quiere usar

        System.out.println("ingrese donde se localiza el archivo con las cartas: ");// bufferReader codigo basado de los ejemplos encontrados en la pagina : https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
        String fileName = input.next();
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            //process the line
            String[] parts = line.split("[|]");// se separa el string que da el buffer reader
            Mapa.put(parts[0], parts[1]);// se guarda la carta en el mapa con su key y value adecuado

        }
    }
}