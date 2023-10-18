package org.ulpgc.example;
import com.google.gson.Gson;

import java.io.*;


public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche(4, "Ford", 2003);
        Concesionario concesionario = new Concesionario("Telde", coche, "Domingo Alonso");

        Gson gson = new Gson();
        String json = gson.toJson(coche);
        String json2 = gson.toJson(concesionario);

        System.out.println(json);
        System.out.println(json2);

        writing(json);
        reading(json);
        outputWriter(json2);
        inputReader(json2);
    }
    public static void writing(String json){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\testing\\coche.txt"))) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void reading(String json) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\testing\\coche.txt"));
            String file = reader.readLine();
            System.out.println(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void outputWriter(String json) {
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\testing\\concesionario.txt"));
            outputStream.writeObject(json);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void inputReader(String json) {
        try {
            ObjectInputStream deserializedSession = new ObjectInputStream(new FileInputStream("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\testing\\concesionario.txt"));
            Object objetoLeido = deserializedSession.readObject();
            System.out.println(objetoLeido);
        } catch (FileNotFoundException exception){
            exception.printStackTrace();
            System.out.println("fooo");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}