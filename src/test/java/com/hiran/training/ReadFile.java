package com.hiran.training;

import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
	public static void main(String[] args) {

        Leer_fichero accediendo=new Leer_fichero();
        accediendo.lee();
    }
}

class Leer_fichero{

    String texto="";

    public void lee() {

        try {
            FileReader entrada=new FileReader("./src/main/resources/File/hola.txt");

                int c=0;

                while(c!=-1) {
                    c=entrada.read();

                    char letra=(char)c;

                    texto+=letra;
                }

                entrada.close();

                System.out.println(texto);

        } catch (IOException e) {

            System.out.println("No se ha encontrado el archivo");
        }
    }

}
